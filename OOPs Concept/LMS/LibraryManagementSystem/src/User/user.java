package User;
public abstract class user{ 
    private String name;
    private String userId;
    private String contactInfo;
    static int totalUsers = 0; 

    // Constructor
    public user(String name, String userId, String contactInfo) {
        totalUsers++;
        this.name = name;
        this.userId = userId;
        this.contactInfo = contactInfo;
         // Increment the total users count when a new user is created.
    }
    public String getName() {  // encapsulation
        // Getter method for name
        return name;
    }   

    public void setName(String name) {// encapsulation
        this.name = name;
    }

    public String getUserId() {// encapsulation
        // Getter method for userId
        return userId;
    }   
    public void setUserId(String userId) {// encapsulation
        this.userId = userId;
    }   
    public String getContactInfo() {// encapsulation
        // Getter method for contactInfo
        return contactInfo;
    }   
    public void setContactInfo(String contactInfo) {// encapsulation
        this.contactInfo = contactInfo;
    }
         public final int generateUniqueId() {
        // Method to generate a unique user ID
        
        return (int) (Math.random() * 10000);
        // return 0;
    }

    user() {
        // Default constructor
        userId = String.valueOf(generateUniqueId());
    }

    user(String name, String contactInfo) {
        // Constructor with name and contactInfo
        this.name = name;
        this.contactInfo = contactInfo;
        this.userId = String.valueOf(generateUniqueId());
    }
     user(user anotherUser) {
        // Copy constructor and it is a Shallow copy

        this.name = anotherUser.name;
        this.userId = anotherUser.userId;
        this.contactInfo = anotherUser.contactInfo;
    }

   public abstract void displayDashboard(); 
   public abstract boolean canBorrowBooks();

   
     public static int getTotalUsers() {
         return totalUsers;
     }
   
}


/*
Copy Constructor - Constructor that takes an object of the same class and copies its values
Shallow Copy - Fields are copied, but object references remain shared - 
Deep Copy - Entire object graph is duplicated (including nested objects) */



// why abstract class?
    // An abstract class is a class that cannot be instantiated directly.
    // 1.we can not create an object of this class
    // 2. Abstract class can have constructors, fields, and methods (both abstract and concrete).
// Static variable to keep track of total users, why static?
    /* Static variables are shared among all instances of the class.
       They are not tied to a specific instance, meaning they can be accessed without creating an object of the class.
       In this case, totalUsers is a static variable that keeps track of the total number of users created.
       It is incremented in the constructor whenever a new user is created.
    */

   /* why use public?
     public is an access modifier that allows this method to be accessible from other classes.
    Reason for using getters and setters:
     1. Encapsulation: They allow you to control access to the fields of a class.
     2. Validation: You can add validation logic in the setter methods to ensure that     
        the data being set is valid.
     3. Flexibility: If you need to change the internal representation of a field 
        later, you can do so without changing the public interface of the class.
     using access modifier, you can control the access to the fields of a class. or it helps to restrict access to the other classes. that means other class can not directly access the data members of the class.
    Encapsulation is a fundamental principle of object-oriented programming that helps to protect the internal state of an object and ensures that it can only be modified in controlled ways.
    - what is data member?
     A data member is a variable that is associated with a class or an object. It represents the state or attributes of the class or object. Data members can be of any data type, including primitive types (like int, float, etc.) and reference types (like objects of other classes).
     how to achieve encapsulation?
    * Encapsulation is achieved by using access modifiers (like private, protected, and public) and by providing getter and setter methods to access and modify the data members of a class.
*/

/* This class is abstract, meaning it cannot be instantiated directly
    It serves as a base class for other user types (e.g., Student, Librarian)
    The displayDashboard() and canBorrowBooks() methods are abstract, meaning they must be implemented by subclasses
    This allows for different user types to have their own specific implementations of these methods
    The abstract keyword indicates that this class is incomplete and that subclasses must provide implementations for the abstract methods
   methods are abstract
    Abstract method to be implemented by subclasses
    This method will display the user's dashboard
    It is abstract because different types of users may have different dashboard implementations.
     * Abstract method to check if the user can borrow books.
     * This method should be implemented by subclasses to define borrowing rules.
     */