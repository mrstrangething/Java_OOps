package OOps4.Q3;

public class Bicycle implements Returnable {

    public boolean isRented;
    public String bicycleModel;

    public Bicycle(String bicycleModel) {
        this.bicycleModel = bicycleModel;
        this.isRented = false;
    }

    public void rent() {
        if (isRented) {
            System.out.println("Bicycle is already rented.");
        } else {
            isRented = true;
            System.out.println("Bicycle rented successfully.");
        }
    }
    public void returnItem() {
        if (!isRented) {
            System.out.println("Bicycle is not rented.");
        } else {
            isRented = false;
            System.out.println("Bicycle returned successfully.");
        }
    }
    
}
