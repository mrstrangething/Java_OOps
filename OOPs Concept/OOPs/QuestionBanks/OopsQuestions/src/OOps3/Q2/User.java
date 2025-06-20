package OOps3.Q2;

public class User { // Base class for User, Student, and Employee
        String Username; String email;
        //encapsulation: making attributes private and providing public methods to access them
        // This allows us to control how the attributes are accessed and modified.
        User(String name, String email) {
            this.Username = name;
            this.email = email;
        }
          //why do we use getters?
        // We use getters to provide controlled access to the private attributes of the class. and to encapsulate the data.
        public String getUsername() {
            return Username.toLowerCase().replace(" ", "_");
        }   
        public String getEmail() {
            return email;
        }   
        void displayInfo() {
            System.out.println("Name: " + Username);
            System.out.println("Email: " + email);
        } 
}
