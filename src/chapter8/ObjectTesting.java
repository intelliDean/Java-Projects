package chapter8;

import java.util.Locale;
import java.util.Scanner;

public class ObjectTesting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = new String("Michael Dean");
        String address = new String("26B, Admiralty way, Lekki");
        String phoneNumber = new String("08095729090");

        System.out.printf("%n%-15s%-30s%-15s%n", name.toUpperCase(Locale.ROOT), address, phoneNumber);
    }
}
