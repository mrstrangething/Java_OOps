package Callable.ThreadNCallable.ThreadWithCallable;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*Raw Problem
Write code to achieve the following

    A class Client with a main method.
    Create a class ArrayCreator which takes as input a number (n)
    ArrayCreator should create an ArrayList which should contain numbers from 1 to n
    ArrayCreator should implement appropriate Callable interface and return the arraylist discussed above to calling thread
    Client class should invoke ArrayCreator over a new thread and get the arraylist from ArrayCreator class and print it.


 */
public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Scanner scn = new Scanner(System.in);
       
        int n = scn.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(1);

        ArrayCreator arr = new ArrayCreator(n);

        Future<List<Integer>> ans = executor.submit(arr);

        List<Integer> list = ans.get();

        System.out.println(list);
       
    }
}
