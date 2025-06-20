package OOPs.PillarsOfOops.AccessModifier;

public class Student {
  /*  // String name; // Default access modifier (package-private) - accessible within the same package
    // In Java, if no access modifier is specified, the default access modifier is used.
    int age;
    int rollNo;*/ // Default access modifier (package-private) - accessible within the same package

    private String name; // Private access modifier - accessible only within this class
    private int age; 
    private int rollNo; 

    Student(String name, int age, int rollNo) {// Constructor to initialize the private variables
        this.name = name; // 'this' keyword is used to refer to the current object
        this.age = age;
        this.rollNo = rollNo;
    } // Constructor to initialize the private variables


    void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }

    
}       
     class Access{
    public static void main(String[] args) {
    
      /* Student student = new Student();
        student.name = "John Doe";
        student.age = 20;
        student.rollNo = 12;
        student.print(); // Calling the print method to display the student's information.
    // Note: In a real-world scenario, you would typically use getters and setters to access and modify private variables.  

        Student student = new Student("John Doe", 20, 12); // Creating an object of the Student class using the constructor
        student.print(); // Calling the print method to display the student's information.  
        student.name = "Jane Doe"; // This line will cause a compilation error because name is private
        student.age = 21; // This line will cause a compilation error because age is private   
        
     */   
    }
}
