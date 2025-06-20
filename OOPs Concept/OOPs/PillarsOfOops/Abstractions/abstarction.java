package OOPs.PillarsOfOops.Abstractions;


abstract class Car{// Abstract class
    abstract void start(); // Abstract method (does not have a body)
    abstract void stop(); // 
    public void honk(){ // Regular method
        System.out.println("Honk! Honk!");
    }
}
     class Lexus extends Car{ // Subclass (inheriting from Car)
        void start(){ // Implementing abstract method
            System.out.println("Lexus is starting");
        }
        public void stop(){ // Implementing abstract method
            System.out.println("Lexus is stopping");
        }
        public void honk(){ // Overriding regular method
            System.out.println("Lexus is honking");
        }
}
public class abstarction {
    public static void main(String[] args) {
        // Abstraction in Java is a fundamental concept in object-oriented programming that focuses on hiding the complex implementation details and showing only the essential features of an object.
        // It allows developers to create a simplified model of a system, making it easier to understand and use.
            Lexus car1 = new Lexus();
                
        car1.start(); // Calls the start method of the Lexus class
        car1.stop(); // Calls the stop method of the Lexus class    
        car1.honk(); // Calls the honk method of the Lexus class
    }
}
