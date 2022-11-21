package CHAPTER_7;

import java.util.ArrayList;

public class CheckOutApp {
    private ArrayList<String> item;
    private  ArrayList<Integer> quantity;
    private  ArrayList<Integer> pricePerUnit;
    private int count = 0;
    private double total;

    public void setItem(String itemName) {
        for (int i = 0; i < item.size(); i++) {
            this.item.add(itemName);
        }
    }
    public ArrayList<String> getItem(int index) {
        this.item.get(count);
        return item;
    }
    public void setQuantity(int quantity) {
        this.quantity.add(quantity);
    }
    public ArrayList<Integer> getQuantity() {
        this.quantity.get(count);
        return quantity;
    }
    public void setPricePerUnit(int price) {
        pricePerUnit.add(price);
    }
    public ArrayList<Integer> getPricePerUnit() {
        this.pricePerUnit.get(count);
        return pricePerUnit;
    }
}
