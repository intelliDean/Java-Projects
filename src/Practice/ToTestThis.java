package Practice;

public class ToTestThis {
    private  int amount;
    private  int age;
    private static int price;


    public ToTestThis() {
        this(0);
    }
    public ToTestThis(int amount) {
        this(amount,0);
    }
    public ToTestThis(int amount, int age) {
        if (amount < 0) throw new IllegalArgumentException("invalid amount");
        if (price < 0) throw new IllegalArgumentException("invalid price");
        if (age < 0) throw new IllegalArgumentException("invalid price");
        this.amount = amount;
        ToTestThis.price = 350;
        this.age = age;

    }

    public void setAmount(int amount) {
        this.amount = this.amount + amount;     //this.amount is the value of the object amount and
                                    // amount is the value of argument input at the call of the method
    }
    public static void setPrice(int price) {
        ToTestThis.price += price;
    }
    public int getAmount() {
        return amount;
    }
    public int getPrice() {
        return price;
    }
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Illegal age");
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
