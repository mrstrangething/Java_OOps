package OOPs.PillarsOfOops.EncapSulation;

public class Student {
    // Encapsulation is the bundling of data (attributes) and methods (functions) that operate on the data into a single unit or class.
    // It restricts direct access to some components and can prevent the accidental modification of data.

    private String name;   
    private int age; 
    private int roll; 
    
    public String getName() { // Getter method to access the private variable name
        return name;
    }   

    public int getAge() { // Getter method to access the private variable age
        return age;
    }   
    public int getRoll() { // Getter method to access the private variable rollNo
        return roll;
    }   

    public void setName(String name) { // Setter method to modify the private variable name
        this.name = name; // 'this' keyword is used to refer to the current object
    }
    public void setAge(int age) { // Setter method to modify the private variable age
        if (age > 0) { // Validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
        public void setRoll(int roll) { // Setter method to modify the private variable rollNo
          this.roll = roll; // 'this' keyword is used to refer to the current object
        }   
    }


class Access {
    public static void main(String[] args) {
        Student student = new Student(); // Creating an object of the Student class using the constructor
        //System.out.println("Name: " + student.name);
        student.setName("Doe"); // Setting the name using the setter method
        student.setAge(21); // Setting the age using the setter method  
       student.setRoll(12); // Setting the roll number using the setter method 
      student.getName();
      student.getAge();
      System.out.println("Name: " + student.getName()); // Getting the name using the getter method
      System.out.println("Age: " + student.getAge()); // Getting the age using the getter method
      System.out.println("Roll No: " + student.getRoll()); // Getting the roll number using the getter method

         
    } 
}
