package OOPs.PillarsOfOops;

// SUPER class in Java is a keyword that refers to the superclass of the current object. 
//It is used to access members (methods and variables) of the superclass from a subclass.
// It is commonly used in three scenarios:
// 2. Accessing Parent Class Methods: If a subclass overrides a method from its parent class,
class Animal{
    
    void eat(){
        System.out.println("eating.... Pedigree");
    }
    }


class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
    void bark(){
        System.out.println("Barking");
    }
    void work(){
        System.out.println("Dog is working");
        super.eat(); // Calls the eat method of Animal class
        bark();
    }
    
}
public class SUPER2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.work(); // Calls the work method of Dog class, which in turn calls the eat method of Animal class   
    }
    
}
