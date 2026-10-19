public class CashRegister {

    private double purchase;
    private double payment;
    private int itemCount;

    // Constructor
    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    // Records a purchase
    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    // Receives a payment
    public void receivePayment(double amount) {
        payment += amount;
    }

    // Calculates and returns the change
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0; // Reset item count for the next customer
        return change;
    }

    // (a) Returns the number of purchases recorded
    public int getItemCount() {
        return itemCount;
    }

    // (b) Returns the total number of items purchased
    // across all CashRegister objects in the array
    public static int countTotal(CashRegister[] registers) {
        int total = 0;

        for (CashRegister register : registers) {
            total += register.getItemCount();
        }

        return total;
    }

    // Example toString method (assumed in the question)
    @Override
    public String toString() {
        return "CashRegister[purchase=" + purchase +
                ", payment=" + payment +
                ", itemCount=" + itemCount + "]";
    }
}