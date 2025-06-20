package OOps4.Q3;

public class Car implements Returnable {
    
    public boolean isRented;
    public String CarModel;

    public Car(String CarModel) {
        this.CarModel = CarModel;
        this.isRented = false;
    }
public void rent() {
        if (isRented) {
            System.out.println("Car is already rented.");
        } else {
            isRented = true;
            System.out.println("Car rented successfully.");
        }
    }
    public void returnItem() {
        if (!isRented) {
            System.out.println("Car is not rented.");
        } else {
            isRented = false;
            System.out.println("Car returned successfully.");
        }
    }
            }

