package OOps4.Q3;

public class Main {
    
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry");
        Bicycle bike1 = new Bicycle("Hero Sprint");

        car1.rent();         // Output: car is now rented
        car1.rent();         // Output: car is already rented
        car1.returnItem();   // Output: car is now returned

        bike1.rent();  // Output: cycle is now rented
        bike1.rent();   // Output: cycle is already rented     
        bike1.returnItem();  // Output: cycle is now returned
    }
}

