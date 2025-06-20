package Threads;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Client class is running : " + Thread.currentThread().getName());
    
        
        Printer printer = new Printer();
        Thread thread = new Thread(printer); // Create a thread with the Printer instance
        printer.run(); // Call the run method directly (not recommended for multithreading)
            thread.start(); // Start the thread (recommended for multithreading) new thread will create after calling start method

            System.out.println("Client class is running : " + Thread.currentThread().getName());
            thread.start(); // Start the thread again (this will throw an IllegalThreadStateException)
            // The thread cannot be started again after it has been started once.

    }

    // public static void hello() {
    //     System.out.println("Hello from hello method!");
    //     System.out.println(Thread.currentThread().getName()); // is it parallel?
    //     // Yes, it is parallel. The main thread can call this method while other threads are executing concurrently.
    //     //is it concurrent?
    //     // Yes, it is concurrent. The main thread can execute this method while other threads are running.
    //     //is it multithreaded?  
    //     // Yes, it is multithreaded. The main thread can execute this method while other threads are running in parallel.
        

    // }
}
