package User;

public class libranian extends user {
    private String employeeNumber;

    public libranian(String name,String phone, String employeeNumber) {
        super(name, phone); // Call the constructor of the parent class (user)
        this.employeeNumber = employeeNumber;
    }

    public void displayDashboard() {
        // Display librarian-specific dashboard information
        System.out.println("Librarian Dashboard:");
        System.out.println("Employee Number: " + employeeNumber);
    }
    public boolean canBorrowBooks() {
        // Librarians can borrow books without restrictions
      //  System.out.println("As a librarian, you can borrow books without restrictions.");
        return true; // Librarians can borrow books without restrictions
    }
    //void addNewBook(Book book){}
   //void removeBook(Book book){}
}
