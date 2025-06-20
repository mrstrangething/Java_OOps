package Threads;

public class Printer implements Runnable { 
// Runnable is a interface, it is inbuilt in Java, it is used to create a thread by implementing the run method.
    
    public void run(){

        System.out.println("Hello from Thread class : " + Thread.currentThread().getName());
        


    }
}
