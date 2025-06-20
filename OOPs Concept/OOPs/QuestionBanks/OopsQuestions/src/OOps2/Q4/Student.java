package OOps2.Q4;

public class Student {
 
    int age; String name;

    //telescopic constructor 
    // Constructor to initialize the student with age and name
    //default constructor
    Student(){
        this(0, null);  // this() calls another constructor in the same class
    }
    // Constructor to initialize the student with age or name
     Student (int age){
        this(age, null);
     }
     Student (String name){
            this(0, name);
        }
        // Constructor to initialize the student with age and name
     Student (int age, String name){
            this.age = age;
            this.name = name;

        }


        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student(20);   
            Student s3 = new Student("John");
            //Student s4 = new Student(25, "Alice");
            System.out.println("Student 1: Age = " + s1.age + ", Name = " + s1.name);
            System.out.println("Student 2: Age = " + s2.age + ", Name = " + s2.name);
            System.out.println("Student 3: Age = " + s3.age + ", Name = " + s3.name);
        }

}
