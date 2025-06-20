package OOPs.PillarsOfOops;

/*In Java, the super keyword is used to refer to the immediate parent class of the current class. 
It is commonly used in three scenarios:

1.Accessing Parent Class Methods: If a subclass overrides a method from its parent class,
you can use super.methodName() to call the parent class's version of the method.

2.Accessing Parent Class Variables: If a subclass has a field with the same name as a field in the parent class, you can use super.
variableName to access the parent class's field.

3.Calling Parent Class Constructors: You can use super() to explicitly call the constructor of the parent class.
This is useful when the parent class has a parameterized constructor or when you want to ensure specific initialization logic is executed.

*/
// Accessing Parent Class Variables: If a subclass has a field with the same name as a field in the parent class, you can use super.variableName to access the parent class's field.    

class Parent {
    String name = "Parent Class";
    String Color = "White";
    public void display() {
        System.out.println("This is the Parent class- "+ name +" Color: " + Color);
    }
} 
class Child extends Parent {
    String name = "Child Class";
    String Color = "Brown";

    public void display() {
        System.out.println("This is the Child class."+" Color: " + Color);
        System.out.println("Name from Parent class: " + name + super.Color ); // Accessing parent class variable
        System.out.println("Name from Child class: "+name + this.Color); // Accessing child class variable
    }

    public void show() {
        // Accessing parent class method using super keyword
        super.display(); // Calls the display method of Parent class
        System.out.println("Name from Parent class: " + super.name); // Accessing parent class variable
        System.out.println("Name from Child class: " + this.name); // Accessing child class variable
    }
}


public class SUPER {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Calls the show method of Child class 
        child.show(); // Calls the display method of Child class  
        
    }
    }
