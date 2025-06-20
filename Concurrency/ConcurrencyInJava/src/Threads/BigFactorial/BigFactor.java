package Threads.BigFactorial;

import java.math.BigInteger;


public class BigFactor extends Thread {

    private BigInteger factorial; // Field to store the computed factorial    
    private final int n; // Field to hold the number for factorial computation
    
    public BigFactor(int n) {
        this.n = n; // Initialize the number for factorial computation
        
    }
    public void run(){
          for (int i = 1; i <= n; i++) { // Loop from 2 to n
            factorial = factorial.multiply(BigInteger.valueOf(i)); // Compute factorial
        }
    }

    public BigInteger getFactorial() {
        return factorial; // Return the computed factorial
    }

    public static void main(String[] args) throws InterruptedException {
        BigFactor calculator = new BigFactor(100);
        calculator.start();
        calculator.join(); // Wait for the thread to finish

        System.out.println("Factorial of 100: " + calculator.getFactorial());
    }

}
