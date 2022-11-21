package CHAPTER_7.exercise;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class SmallAppLikeJumia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> item = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();

        System.out.println("""
               𝗘𝗜𝗚𝗛𝗧𝗬𝟵 𝗦𝗛𝗢𝗣𝗣𝗜𝗡𝗚 𝗠𝗔𝗟𝗟
        yes to record transaction, No to quit""");
        int i = 0;
        String pos;
        String reply = input.nextLine();
            while (Objects.equals(reply, "yes")) {

                if (i == 0) {
                    pos = "st";
                } else
                    if (i == 1) {
                    pos = "nd";
                } else if (i == 2) {
                        pos = "rd";
                    } else {
                        pos = "th";
                    }
                System.out.printf("%nInput the %d%s item's name%n", i + 1, pos);
                String itemName = input.nextLine();
                item.add(itemName);

                System.out.printf("%nInput quantit(ies) of the %d%s item%n", i + 1, pos);
                int quantityVal = input.nextInt();
                if (quantityVal > 0) {
                quantity.add(quantityVal);
                } else {
                    System.out.println("""
                            Invalid quantity
                            Try again""");
                    continue;
                }

                System.out.printf("%nInput price of the %d%s item%n", i + 1, pos);
                int pricePerUnit = input.nextInt();
                if (pricePerUnit > 100) {
                price.add(pricePerUnit);
                } else {
                    System.out.println("""
                            Invalid price
                            Try again""");
                    continue;
                }

                input.nextLine();   //After a nextInt, the JVM skips the nextLine after it. It is right to put a
                                    // dormant nextLine between it, so it could skip that before the useful nextLine
                System.out.println("""
                        
                        yes to record another sale or NO to print receipt""");
                reply = input.nextLine();
                i++;
            }

        System.out.println("\nEnter Cashier name");
        String name = input.next();
        System.out.println();

        SecureRandom rand = new SecureRandom();     //secure random for the receipt number
        int receipt = 5834 * (1 + rand.nextInt(20));

        long millis = System.currentTimeMillis();
        java.util.Date date = new java.util.Date(millis); // for current time and date

        System.out.println("==========================================================================");
        System.out.printf("""
                                   🏘️ 𝐄𝐈𝐆𝐇𝐓𝐘𝟗 𝐒𝐇𝐎𝐏𝐏𝐈𝐍𝐆 𝐌𝐀𝐋𝐋 𝐈𝐍𝐕𝐎𝐈𝐂𝐄
                   📍 26B, Admiralty Way Lekki Phase 1, Lagos 550104 Nigeria
                  ☎ +234 809 572 9090
                  📆 %s
                """, date);
        double total = 0;
        System.out.println("==========================================================================");
        System.out.printf("%-21s%-22s%-22s%-20s%n","ITEM NAME", "QUANTITY", "PRICE", "AMOUNT");
        System.out.println("--------------------------------------------------------------------------");
        for (int j = 0; j < i; j++) {
            System.out.printf("%d. %-21s%-20d₦%,-20d₦%,-20d%n",j+1,
                    item.get(j).toUpperCase(), quantity.get(j), price.get(j),
                    price.get(j) * quantity.get(j));

            total += quantity.get(j) * price.get(j);

        }
        double vat = total * 0.075;
        double grandTotal = total + vat;
        System.out.println("==========================================================================");
        System.out.printf("%57s:%,15.2f%n%57s:%,15.2f%n%57s:%,15.2f%n", "SUBTOTAL", total, "VAT (7.5%)", vat, "TOTAL", grandTotal);
        System.out.println("==========================================================================");
        System.out.println("\nCash tendered?");
        double cash = input.nextDouble();
        double balance;
        if (cash >= grandTotal) {
            balance = cash - grandTotal;
            System.out.println("\n\n\n\n\n\n\n==========================================================================");
            System.out.printf("""
                                   🏘️ 𝐄𝐈𝐆𝐇𝐓𝐘𝟗 𝐒𝐇𝐎𝐏𝐏𝐈𝐍𝐆 𝐌𝐀𝐋𝐋 𝐑𝐄𝐂𝐄𝐈𝐏𝐓
                   📍 26B, Admiralty Way Lekki Phase 1, Lagos 550104 Nigeria
                  ☎ +234 809 572 9090
                  📆 %s
                  🧾 Receipt №: %d
                  🧒 Cashier: %s
                """, date, receipt, name.toUpperCase());
            System.out.println("==========================================================================");
            System.out.printf("%-21s%-22s%-22s%-20s%n","ITEM NAME", "QUANTITY", "PRICE", "AMOUNT");
            System.out.println("--------------------------------------------------------------------------");
            for (int j = 0; j < i; j++) {
                System.out.printf("%d. %-21s%-20d₦%,-20d₦%,-20d%n",j+1,
                        item.get(j).toUpperCase(), quantity.get(j), price.get(j),
                        price.get(j) * quantity.get(j));

                total += quantity.get(j) * price.get(j);

            }
            vat = total * 0.075;
            grandTotal = total + vat;
            System.out.println("==========================================================================");
            System.out.printf("%57s:%,15.2f%n%57s:%,15.2f%n%57s:%,15.2f%n", "SUBTOTAL", total, "VAT (7.5%)", vat, "TOTAL", grandTotal);
            System.out.println("--------------------------------------------------------------------------");
            System.out.printf("%57s:%,15.2f%n%57s:%,15.2f%n","CASH", cash, "BALANCE",balance);
            System.out.println("--------------------------------------------------------------------------");
            System.out.print("""
                                  𝓣𝓗𝓐𝓝𝓚 𝓨𝓞𝓤 𝓕𝓞𝓡 𝓨𝓞𝓤𝓡 𝓟𝓐𝓣𝓡𝓞𝓝𝓐𝓖𝓔!
                """);
            System.out.println("==========================================================================\n\n\n\n");
        } else {
            balance = grandTotal - cash;
            System.out.printf("Your money remain %.2f to complete", balance);
        }
    }
}
