package Threads.Thread2;
import java.util.*;

/* Raw Problem**
Write code to achieve the following

   1. A class Client with a main method.
   2. Client class shall take a number n as input.
   3. A class called TableCreator which prints the multiplication table from 1 to 10 for a given number x
    x times 1 is x
    .
    .
    .
    x times 10 is 10x
   4. Client should create a thread for every number between 1 to n, n included and
    Pass it to TableCreator to print a multiplication table for that number.

Print format = 2 times 6 is 12 */

public class Client {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // Create a thread for each number from 1 to n
        for (int i = 1; i <= n; i++) {
            TableCreator tableCreator = new TableCreator(i);
            Thread thread = new Thread(tableCreator); // pass the runnable to Thread
            thread.start();
        }
    }
}
