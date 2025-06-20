package OOps1.Q2;

public class Rectangle {

    Point topLeft;
    int height; int width; 

    public int getArea() {
        return this.height * this.width;
    }
    public int getPerimeter() {
        return 2 * (this.height + this.width);
    }   
    public Point getBottomRight(){
        Point bottomRight = new Point();
        bottomRight.x = this.topLeft.x + this.width;
        bottomRight.y = this.topLeft.y - this.height; // Assuming y increases downwards
        return bottomRight;
    }
    
}
