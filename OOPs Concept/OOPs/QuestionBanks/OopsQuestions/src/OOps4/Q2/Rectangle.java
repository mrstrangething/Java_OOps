package OOps4.Q2;

public class Rectangle extends Shape {

   // private int positionX;
    //private int positionY;
    private int width;
    private int height;


    public Rectangle(int positionX, int positionY,String fillColor, String borderColor, int width, int height) {
        super(positionX, positionY, fillColor, borderColor);
       // this.positionX = positionX;
      //  this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }   
}
