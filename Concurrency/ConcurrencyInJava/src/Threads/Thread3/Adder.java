package Threads.Thread3;

public class Adder implements Runnable {
    private int num1;
    private int num2;

    // Constructor to initialize the numbers
    public Adder(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // The run method that will be executed when the thread starts
    @Override
    public void run() {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
    
}
