package OOPs.PillarsOfOops.Inheritance;

public class animal {
    // Base class (Parent class) (Super Class)
    String name; // Attribute of the animal
    String Color;

    // Constructor with color
    public animal(String name, String color) {
        this.name = name;
        this.Color = color;
    }
    // Method to display the animal's name
    public void eat() {
        System.out.println( name +"is eating.");
    }   

    public void bark(){
        System.out.println("Woof! Woof!");
    }
    public void Color(){
        System.out.println("Animal Color: " + Color); // Animal's color
    }
    // Method to display the animal's name
}
