package OOps3.Q1;

public class ThreedPoint extends Point {
    
    // public ThreedPoint(int x, int y, int z) {
    //     this.x = x; // Accessing protected member from parent class
    //     this.y = y; // Accessing protected member from parent class
    //     this.z = z; // Initializing the new member variable
    // }
    
    // New member variable for the third dimension

   private int z; 
    public void display() {
        System.out.println("[<<"+super.x+ ">>" +"," + "<<"+super.y+ ">>" +"," + "<<"+this.z+ ">>" +"]");
    }
    //why use super - Why Use super.x and super.y? 

    /* In ThreedPoint, you're inheriting x and y from Point.
    Although you could just write x and y directly (because they are protected), using super.x clearly says:
    👉 “I'm using the variables from the parent class.” */
    // This makes the code clearer, especially if you have variables with the same name in ThreedPoint.

    public static void main(String[] args) {
        ThreedPoint tp = new ThreedPoint();
        // Accessing protected member from parent class
        tp.z = 30; // Setting the new member variable
        tp.display(); // Displaying the point
    }
}
