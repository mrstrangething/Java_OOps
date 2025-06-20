package Threads.ThreadOneToHundred;

public class PrintOneToHundred implements Runnable {

        private int num;
        public PrintOneToHundred(int num) {
            this.num = num;
        }

      public void run(){
        System.out.println( "Printing from thread number: " + num + " : " + Thread.currentThread().getName());
          System.out.println(Thread.currentThread().getName()
                           + " is running with priority " 
                           + Thread.currentThread().getPriority());// Print the current thread's name and priority
        }

    }
    