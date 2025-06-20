package Callable.ThreadNCallable.ThreadWithCallable;
import java.util.*;
import java.util.concurrent.Callable;


public class ArrayCreator implements Callable<List<Integer>> {
      // Create a class ArrayCreator which takes as input a number (n)
      // ArrayCreator should create an ArrayList which should contain numbers from 1 to n
      // ArrayCreator should implement appropriate Callable interface and return the arraylist discussed above to calling thread
      // Client class should invoke ArrayCreator over a new thread and get the arraylist from ArrayCreator class and print it.

    List<Integer> li = new ArrayList<>();
      int n;
    public ArrayCreator(int n){
        this.n = n;
           }
    public List<Integer> call() throws Exception {
       
        for(int i=1; i<=this.n; i++){
            this.li.add(i);
        }

        return this.li;
    }
}