package OOps3.Q1;

public class Point {

     protected int x; protected int y;
        // To access the protected members of Point class in the subclass 
        //Use the super keyword in the constructor of the subclass
    void display() {
        System.out.println("[<<"+x+ ">>" +"," + "<<"+y+ ">>" +"]");
    }
}
