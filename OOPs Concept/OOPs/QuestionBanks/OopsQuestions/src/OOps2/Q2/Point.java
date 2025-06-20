package OOps2.Q2;

public class Point {
    int x; int y; 

    Point (int x, int y) { // Parameterized constructor
        // Initializing the instance variables with the passed values
        this.x = x;
        this.y = y;
    }

    Point(Point CopyConstructor) { // Copy constructor
        // Copying values from the passed object to the new object
        this.x = CopyConstructor.x;
        this.y = CopyConstructor.y;
    }
    
}
