package OOps3.Q2;

public class Employee extends User {

    int employeeId; String department;
    Employee (String Username, String email, int employeeId, String department) {
        super(Username, email); // why do we call super?
        // We call super to initialize the parent class (User) attributes.
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId; // returning the employee ID
    }
    public String getDepartment() {
        return department; // returning the department
    }

    void displayInfo() {
        super.displayInfo(); // calling the parent class method to display common info
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}
