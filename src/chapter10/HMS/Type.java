package chapter10.HMS;

public enum Type {
    EXECUTIVE(15000),
    CHEAP(10000),
    NORMAL(1000);

    private final int price;

    Type(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
