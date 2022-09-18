package assignment;

import static org.junit.jupiter.api.Assertions.*;

class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone12 = new Iphone();

        iphone12.setColor("Black");

        iphone12.getColor();

        System.out.println(iphone12.getColor());

        Iphone.setPrice(250);

        Iphone.getPrice();
        System.out.println(Iphone.getPrice());
    }
}