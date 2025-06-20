package Books;
import User.user;
import Lendable.lendable; // package for the lendable interface

public abstract class Book implements lendable{
    private String isbn;
    private String title;
    private String author;  
    private boolean isAvailable;

    // public boolean lend() {};
    // public void returnBook(String bookId) {
    //     // Method to return a book
    //     // Implementation can be added later
    // }
    public boolean isAvailable() {
        // Method to check if the book is available
        return isAvailable;
    }

    

   public boolean lend(user User) {
        // Method to lend the book to a user
        if (isAvailable()) {
            isAvailable = false; // Mark the book as not available
            System.out.println("Book lent to " + User.getName());
            return true; // Return true if the book was successfully lent
        } else {
            System.out.println("Book is not available for lending.");
            return false; // Return false if the book is not available
        }
    }  
    
public void returnBook(user User) {
    // Method to return the book
    isAvailable = true; // Mark the book as available again
    System.out.println("Book returned by " + User.getName());
}


    // Method to return the book
    // Implementation can be added later
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    abstract void displayBookDetails();  // Abstract method to display book details
    }