package OOps4.Q2;

public class Circle extends Shape {
    
   // private int positionX;
   // private int positionY;

    private int radius;
    private static final double pi = 3.14;

    public Circle(int positionX, int positionY, int radius, String fillColor, String borderColor) {
        super(positionX, positionY, fillColor, borderColor);
        this.radius = radius;
    }
        public int getRadius() {
        return radius;
    }

    public double calculateArea() {
        return pi * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * pi * radius;
    }
}

//  public class Circle extends Shape {
//     private double radius;

//     public Circle(int positionX, int positionY, String fillColor, String borderColor, double radius) {
//         super(positionX, positionY, fillColor, borderColor);
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     @Override
//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }

//     @Override
//     public double calculatePerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }
