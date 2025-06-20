package IntroToSync.Counter;
/*Create a class with the following requirements

    Class should be public and name is Counter
    It should’ve a single private data member of int type named count
    It should’ve a single public constructor which takes an integer parameter and sets the value of count
    It should’ve following 3 methods

        public void incValue(int offset)

        This method should increment the value of count by offset. Also make this method synchronized

        public void getValue()

        This method should return the value of count. Also make this method synchronized

        public void decValue(int offset)

        This method should decrement the value of count by offset. Also make this method synchronized



        */

public class Counter {
    private int count; // private data member of int type named count

    public Counter(int count) { // constructor which takes an integer parameter and sets the value of count
        this.count = count;
    }
     public synchronized void incValue(int offset) { // synchronized method to increment the value of count by offset
        count += offset;    
    }   
        public synchronized int getValue() { // synchronized method to return the value of count
            return count;
        }
    
        public synchronized void decValue(int offset) { // synchronized method to decrement the value of count by offset
            count -= offset;
        }
}