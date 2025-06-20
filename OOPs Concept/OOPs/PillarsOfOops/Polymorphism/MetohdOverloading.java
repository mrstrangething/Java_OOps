package OOPs.PillarsOfOops.Polymorphism;

public class MetohdOverloading {
     // Method Overloading is a feature in Java that allows a class to have more than one method with the same name, 
     //as long as their parameter lists are different (either in type or number of parameters).
     // It is a way to achieve compile-time polymorphism, 
     //where the method to be executed is determined at compile time based on the method signature.

     /*MethodOverloading
      * same method name with different parameters
        * 1. Different number of parameters 
        same method name with different data types
        * 2. Different data types of parameters
      */
      
    public int sum(int a, int b) {
        return a + b; // Method to add two integers
    }

    public int sum(int a, int b, int c) {
        return a + b + c; // Method to add three integers
    }

    public String sum(String a, String b) {
        return a + b; // Method to concatenate two strings
    }   

    public  void main(String[] args) {
      System.out.println(sum(10,20,30));
      System.out.println(sum(10,20));
      System.out.println(sum("Hello ", "World"));
    }
}
