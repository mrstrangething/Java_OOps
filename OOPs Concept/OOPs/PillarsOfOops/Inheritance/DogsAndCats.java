package OOPs.PillarsOfOops.Inheritance;

interface Animal {
    void eat(); // Method signature (abstract method)
    void bark(); // Method signature (abstract method)

    
}

        class Dog implements Animal {
            public void eat() {
                System.out.println("Dog eats meat.");
            }
            public void bark() {
                System.out.println("Dog barks.");
            }
        }

        class Cats implements Animal{
            public void eat() {
                System.out.println("Cat eats fish.");
            }
            public void bark() {
                System.out.println("Cat meows.");
            }   

        }

public class DogsAndCats {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Creating an object of the Dog class
        dog.eat(); // Calling the eat method from the Dog class
        dog.bark(); // Calling the bark method from the Dog class
        Animal c = new Cats(); // Creating an object of the Cat class
        c.eat(); // Calling the eat method from the Cat class
        c.bark(); // Calling the bark method from the Cat class
    }
}
