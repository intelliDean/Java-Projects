package Nokia3310;

import java.util.Scanner;

public class PhoneDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%34s%n%s%n", "WELCOME TO DEAN'S PHONE MENU",
                "Press 1 to view menu or any number to exit");
        int start = input.nextInt();
        PhoneMenu.real(start);
    }
}