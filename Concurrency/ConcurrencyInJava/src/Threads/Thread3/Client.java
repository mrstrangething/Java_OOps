package Threads.Thread3;

import java.util.*;
public class Client {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        // Create a thread for the Adder class and pass the numbers to it

        Thread adderThread = new Thread(new Adder(a, b));
        adderThread.start(); // Start the thread
    }

}
