package OOps2.Q5;

public class Math {
    double pi = 3.14;

    public double getCircleArea(int radius) {
        return (double) (pi * radius * radius);
    }

    public static void main(String[] args) {
        Math math = new Math();
        int radius = 5; // Example radius
        double area = math.getCircleArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}
// This class provides a method to calculate the area of a circle given its radius.
// The method uses the value of pi defined in the class.