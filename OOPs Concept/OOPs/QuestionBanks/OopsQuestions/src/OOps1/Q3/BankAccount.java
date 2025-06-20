package OOps1.Q3;

public class BankAccount {
    String accountNumber; int balance; double ROI;

    public double getSimpleInterest(int time) {
        return (balance * ROI * time) / 100;
    }
    public double getBalanceWithInterest(int time) {
        return balance + getSimpleInterest(time);
    }
}
