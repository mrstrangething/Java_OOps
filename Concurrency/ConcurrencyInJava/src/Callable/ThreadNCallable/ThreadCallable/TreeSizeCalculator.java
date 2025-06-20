package Callable.ThreadNCallable.ThreadCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    private Node root;
    private ExecutorService exs;

    public TreeSizeCalculator(Node root, ExecutorService exs) {
        this.root = root;
        this.exs = exs;
    }   
    
        // Create two threads for left and right subtrees
        public Integer call() throws Exception {
        if(root == null){
            return 0;
        }

        TreeSizeCalculator leftSizeCalculator = new TreeSizeCalculator(root.left, exs);
        Future<Integer> leftSizeFuture = exs.submit(leftSizeCalculator);

        TreeSizeCalculator rightSizeCalculator = new TreeSizeCalculator(root.right, exs);
        Future<Integer> rightSizeFuture = exs.submit(rightSizeCalculator);

        return leftSizeFuture.get() + rightSizeFuture.get() + 1;// 1 for the current node + sizes of left and right subtrees
    }
}
