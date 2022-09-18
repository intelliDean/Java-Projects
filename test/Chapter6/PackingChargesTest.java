package Chapter6;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PackingChargesTest {
    public static void main(String[] args) {
        PackingCharges pay = new PackingCharges();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hours used");
        int reply = input.nextInt();

        pay.calculateCharge(reply);
    }
}