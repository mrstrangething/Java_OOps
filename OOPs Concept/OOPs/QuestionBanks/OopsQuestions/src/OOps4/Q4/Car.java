package OOps4.Q4;

public class Car implements Comparable<Car> {
    int price;
    int speed;

    public Car() {
    }

    public Car(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public int compareTo(Car other) {
        return this.price - other.getPrice(); // Sort by price ascending
    }
}


//  public class Car implements Comparable<Car>{
//     int Price;
//     int Speed;

//     Car()
//     {}

//     @Override
//     public int compareTo(Car c)
//     {
//         return this.Price-c.Price;
//     }
// }