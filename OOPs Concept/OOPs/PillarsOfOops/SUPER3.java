package OOPs.PillarsOfOops;
// In Java, the super keyword is used to refer to the immediate parent class of the current class.
//3. calling Parent Class Constructors: You can use super() to explicitly call the constructor of the parent class.


class Animal2 {
    Animal2() {
        System.out.println("Animal constructor called");
    }
}
class Dog extends Animal2 {//dog inherit animal class
    Dog() {
        super(); // Calls the constructor of Animal class
        System.out.println("Dog constructor called");
    }
}

public class SUPER3 {
    public static void main(String[] args) {
        Dog d = new Dog(); // Creates an instance of Dog class, which calls the constructor of Animal class first
        // and then the constructor of Dog class
        System.out.println(d); 
    }
}
