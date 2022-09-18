package assignment;

public class Iphone {
    private static int price;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public static void setPrice(int price) {
        if (price > 0) {
            Iphone.price = price;
        }
    }
    public static int getPrice() {
        return price;
    }
}
