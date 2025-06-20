package OOPs.PillarsOfOops.Inheritance;

interface Car{
    // Interface defining a contract for car-related methods
    void start(); // Method to start the car
    //void stop();  // Method to stop the car
    //void accelerate(); // Method to accelerate the car 
    
    //void charge(); // Method to charge the car (for electric cars)
    
    


}

    class Electric implements Car{
    // ElectricCar class implements the car interface
    // This class must provide the body for all methods defined in the car interface
    // Example method in the ElectricCar class
    public void start() {
            System.out.println("Electric car started.");
        }
  
    }


    class Diesel implements Car{
    // DieselCar class implements the car interface
    // This class must provide the body for all methods defined in the car interface
    // Example method in the DieselCar class
    
    public void start() {
            System.out.println("Diesel car started.");
        }
    }


public class inTerfaces {
    // Interfaces are a way to achieve abstraction in Java. They allow you to define a contract that classes can implement.
    // An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
    // Interfaces cannot contain instance fields or constructors.
    // A class implements an interface by providing the body of the methods defined in the interface.
    // Example of an interface in Java
   public static void main(String[] args) {


   Car electricCar = new Electric(); // Creating an object of the Electric class
   Car dieselCar = new Diesel(); // Creating an object of the Diesel class
   electricCar.start(); // Calling the start method from the Electric class
    dieselCar.start(); // Calling the start method from the Diesel class


   }
    // Dog class implements the Animal inter   
}
