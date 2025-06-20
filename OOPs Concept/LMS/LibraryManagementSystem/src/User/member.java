package User;

public class member extends user{
    int borrowedBooksCount;
    int MAX_BORROW_LIMIT = 5;


    public member(String name, String userId, String contactInfo) {
        super(name, userId, contactInfo); // Call the constructor of the parent class (user)
        this.borrowedBooksCount = 0; // Initialize borrowed books count
    }

     @Override
    public boolean canBorrowBooks() {
        // Check if the member can borrow more books
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
    @Override
    public void displayDashboard() {
        // Display member-specific dashboard information
        System.out.println("Member Dashboard:");
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
        System.out.println("Max Borrow Limit: " + MAX_BORROW_LIMIT);
    }

   

  

}
