package Practice;

import java.util.Scanner;

public class DiscountDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Discount discount = new Discount();

        for (int i = 1; i > 0; i++){
        System.out.println("Input quantity");
        int reply = input.nextInt();
        if (reply != 0) {
        discount.setPrice(reply);
        System.out.printf("Your price is %.2f%n%n", discount.getPrice());
        } else break;
        }
//        double a = 100 - (100 * 0.1);
//        System.out.println(a);1
    }
}
