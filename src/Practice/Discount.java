package Practice;

public class Discount {
    /*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity. Suppose, one unit will cost 100.
Judge and print total cost for user.*/
    private int totalPrice;
    private int quantity;

    public void setPrice(int quantity) {
        int pricePerUnit = 100;
        totalPrice =  (quantity * pricePerUnit);
        if (quantity > 1000) {
            double discount = totalPrice - (totalPrice * 0.1);
            totalPrice = (int) discount;
        }
    }
    public double getPrice(){
        return totalPrice;
    }
}
