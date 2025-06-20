package User;

import java.util.ArrayList;
import java.util.List;

import Books.Book;

public class LMS {
    
    private List<Book> bookInventory = new ArrayList<>();
    private List<user> users = new ArrayList<>();

   public void addBook(Book book) {
        // Add a book to the inventory
        bookInventory.add(book);
    }

    public void removeBook(Book book) {
        // Remove a book from the inventory
        bookInventory.remove(book);
    }

    public void registerUser(user newUser) {
        // Register a new user in the system
        users.add(newUser);
    }

    
}
