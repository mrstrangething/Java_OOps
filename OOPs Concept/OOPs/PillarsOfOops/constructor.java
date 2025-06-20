 package OOPs.PillarsOfOops;

public class constructor {
     
    // Constructor is a special method that is called when an object is instantiated.
    // It is used to initialize the object.
    // Constructor has the same name as the class and does not have a return type.

    // Example of constructor
    String name; int age; // instance variable
    
     // Constructor is used to initialize the instance variables of the class.
     // Constructor is called when an object is created.
     // Constructor can be parameterized or non-parameterized.

     // Non-parameterized constructor
     // It is a constructor that does not take any parameters.
     // It is used to initialize the instance variables with default values.
     // It is called when an object is created without passing any arguments.
        constructor() {// default constructor
        name = "Default Name";
        age = 0;}


     // Parameterized constructor
     // It is a constructor that takes parameters.
     // It is used to initialize the instance variables with user-defined values.
     // It is called when an object is created by passing arguments.
   
     constructor(String name, int age) {// parameterized constructor
        this.name = name;
        this.age = age;
    }


    void display() {// method to display the values of name and age
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        constructor obj = new constructor("John", 25);// creating an object of the class using parameterized constructor
        obj.display();// calling the display method to print the values of name and age
        
        constructor obj1 = new constructor();// creating an object of the class using non-parameterized constructor
        obj1.display();// calling the display method to print the default values of name and age
    }
    
}