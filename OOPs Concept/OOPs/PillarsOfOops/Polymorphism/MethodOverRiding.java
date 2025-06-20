package OOPs.PillarsOfOops.Polymorphism;


// Method Overriding is a feature in Java that allows a subclass (child class) to provide a specific implementation of a method that is already defined in its superclass (parent class).
// It is a way to achieve runtime polymorphism, where the method to be executed is determined at runtime based on the object type.
// Method Overriding allows a subclass to inherit the properties and methods of its parent class and then modify or extend them as needed.
// The method in the subclass must have the same name, return type, and parameters as the method in the parent class.
// This allows the subclass to provide its own implementation of the method, effectively "overriding" the parent class's version.
class bank{
    public void ROI(){
        System.out.println("Bank's Rate of Interest is 5%");
    }
   
   }
    class SBI extends bank{
     public void ROI(){
          System.out.println("SBI's Rate of Interest is 6%");
     }
    }   

public class MethodOverRiding {

    public void main(String[] args) {
        
        SBI sbi = new SBI(); // Creating an object of the subclass (SBI)
        bank b = new bank(); // Creating an object of the parent class (bank)
        // Calling the overridden method
        sbi.ROI(); // Calling the overridden method in the subclass (SBI)   
        b.ROI(); // Calling the method in the parent class (bank)
        
    }
}
