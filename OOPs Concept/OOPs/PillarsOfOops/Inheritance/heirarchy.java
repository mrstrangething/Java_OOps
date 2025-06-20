package OOPs.PillarsOfOops.Inheritance;

class Me{
    void printMe(){
        System.out.println("This is class A");
    }
}
class D extends Me{
    void printD(){
        System.out.println("This is class D");
    }
}
class F extends Me{
     void printF(){
        System.out.println("This is class F");
    }
}   

public class heirarchy {
    // Inheritance in Java is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class.
    // The class that inherits is called the subclass (or child class), and the class from which it inherits is called the superclass (or parent class).
    // Inheritance allows for code reusability and establishes a relationship between classes.
    // There are different types of inheritance in Java:
    // 1. Single Inheritance: A subclass inherits from one superclass.
    // 2. Multilevel Inheritance: A subclass inherits from a superclass, which in turn inherits from another superclass.
    // 3. Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.
    // 4. Multiple Inheritance: Not supported directly in Java, but can be achieved through interfaces.
    public static void main(String[] args) {
        // Hierarchical Inheritance Example
        D d = new D(); // Creating an object of class B
       F  f = new F(); // Creating an object of class C
        d.printMe(); // Accessing method from class A using object of class B
        d.printD(); // Accessing method from class B

        f.printMe(); // Accessing method from class A using object of class C
        f.printF(); // Accessing method from class C
    }
}
