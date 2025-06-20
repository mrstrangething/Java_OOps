package Lendable;
import User.user;
public interface lendable { //why use interface?
    // An interface is a contract that defines a set of methods that a class must implement.
    // interface are  by default abstract
    // Methods to be implemented by classes that implement this interface
    boolean lend(user User);
    void returnBook(user User);  
    boolean isAvailable();
}
