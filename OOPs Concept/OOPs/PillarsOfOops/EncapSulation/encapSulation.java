package OOPs.PillarsOfOops.EncapSulation;

public class encapSulation { 
    // Encapsulation is the bundling of data (attributes) and methods (functions) that operate on the data into a single unit or class.
    // It restricts direct access to some components and can prevent the accidental modification of data.
    private String name; // private variables can only be accessed within the class
    private int age;

    // Getter for name
    public String getName() {// Getter method to access the private variable name
        return name;
    }

    // Setter for name
    public void setName(String name) {// Setter method to modify the private variable name
        this.name = name; // 'this' keyword is used to refer to the current object
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        encapSulation obj = new encapSulation();
        obj.setName("Encapsulation");
        obj.setAge(1);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}

