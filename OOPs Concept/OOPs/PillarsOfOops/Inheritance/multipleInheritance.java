package OOPs.PillarsOfOops.Inheritance;

interface A{
   void run();

}
interface B{
    void run();
}
class  C implements A,B{

public void run(){
    System.out.println("Running in C class");   
}
// Multiple inheritance is a feature of some object-oriented programming languages in which a class can inherit from more than one superclass.
// In Java, multiple inheritance is not supported directly through classes to avoid ambiguity and complexity.
// However, it can be achieved through interfaces. A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
// This is a way to achieve multiple inheritance in Java without the issues associated with it.
}
public class multipleInheritance {
    public static void main(String[] args) {
        C obj = new C(); // Creating an object of class C
        obj.run(); // Calling the run method from class C
        // The run method in class C implements the run method from both interfaces A and B.
        // This demonstrates how multiple inheritance can be achieved through interfaces in Java.
    }
}
