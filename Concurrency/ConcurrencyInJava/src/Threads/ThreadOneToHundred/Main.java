package Threads.ThreadOneToHundred;

public class Main {
    
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
           // PrintOneToHundred print = new PrintOneToHundred(i);// Create a new instance of PrintOneToHundred for each number
           if(i%2==0){Runnable print = new PrintOneToHundred(i); // Create a new instance of PrintOneToHundred for each number , why use Runnable?
            // Using Runnable allows us to pass the instance to a Thread, enabling multithreading.
            Thread thread = new Thread(print); // Create a new thread for each number
            thread.setPriority(8);// Set the priority of the thread to 8
            thread.start();
             // Start the thread to print the number
            }
            else{
                Runnable print = new PrintOneToHundred(i);
                System.out.println("Skipping odd number: " + i + " from thread: " + Thread.currentThread().getName());
            } 
            
        }
        System.out.println("All threads started to print numbers from 1 to 100.");
    }
}
