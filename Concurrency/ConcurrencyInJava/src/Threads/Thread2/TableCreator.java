package Threads.Thread2;

// Implementing the Runnable interface
public class TableCreator implements Runnable {
    
     int x;
    public TableCreator(int x){
            this.x = x; }

    public void run() {        
        for(int i=1; i<=10; i++){
         System.out.println(x + " times " + i + " is " + (x * i));}
        }
    }

