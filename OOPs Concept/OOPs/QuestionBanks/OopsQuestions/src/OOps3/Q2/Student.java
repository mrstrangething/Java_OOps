package OOps3.Q2;

public class Student extends User {

    int StudentId;
    String course;

    Student(String name, String email, int StudentId, String course) {
        super(name, email); // why do we call super?
        // We call super to initialize the parent class (User) attributes.
        this.StudentId = StudentId;
        this.course = course;
    }
    public int getStudentId() {
        return  this.StudentId; // appending StudentId to the username
    }
    public String getCourse() {
        return this.course; // returning the email from the parent class
    }
    void displayInfo() {
        super.displayInfo(); // calling the parent class method to display common info
        System.out.println("Student ID: " + StudentId);
        System.out.println("Course: " + course);
    }

}