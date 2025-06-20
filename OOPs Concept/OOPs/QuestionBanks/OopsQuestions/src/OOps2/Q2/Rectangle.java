package OOps2.Q2;

public class Rectangle {
    
    Point topLeft;
    Point bottomRight;

   public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        // Initializing the instance variables with the passed values
        this.topLeft = new Point(topLeftX, topLeftY); // Using the Point class to create points
         // for the corners of the rectangle
         // This is an example of composition, where Rectangle uses Point
         // as a part of its structure.
        this.bottomRight = new Point(bottomRightX, bottomRightY);}

      public Rectangle (Point topLeft, Point bottomRight) {
            // Copy constructor
            this.topLeft = new Point(topLeft);
            this.bottomRight = new Point(bottomRight);
        }

      public  Rectangle(Rectangle CopyConstructor) { //deep copy constructor
            // This constructor creates a new Rectangle object by copying the values
            
            this.topLeft = new Point(CopyConstructor.topLeft);
            this.bottomRight = new Point(CopyConstructor.bottomRight);
        }

    }
// This class represents a rectangle defined by two points: top-left and bottom-right.
