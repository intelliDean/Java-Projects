package CHAPTER_4;

import java.util.Scanner;

public class SalesCommission {
    /*(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
sold for last week and calculates and displays that salesperson’s earnings.
There’s no limit to the number of items that can be sold.*/
  //  public static void main(String[] args) {
    public void commission() {
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        double g = 0;
        double h = 0;
        double j = 0;
        double k = 0;

        for (int i = 1; i > 0; i++) {
        System.out.println("Enter item code between 1 & 10");
        int code = input.nextInt();
        if (code != -1) {

        switch (code) {
            case 1->{
                a += 670.43;
                System.out.println(a);
            }
            case 2->{
                b += 2500;
                System.out.println(b);
            }
            case 3-> {
                c += 9200;
                System.out.println(c);
            }
            case 4->{
                d += 2307.03;
                System.out.println(d);
            }
            case 5->{
                e += 1200.67;
                System.out.println(e);
            }
            case 6->{
                f += 200.89;
                System.out.println(f);
            }
            case 7->{
                g += 900.82;
                System.out.println(g);
            }
            case 8->{
                h += 3400;
                System.out.println(h);
            }
            case 9->{
                j += 8900.12;
                System.out.println(j);
            }
            case 10-> {
                k += 5460.07;
                System.out.println(k);
            }
            default -> {
                System.out.println("item not available");
            }
        }
        } else break;
        }
        var wages = 200;
        double salesEarnings = (a + b + c + d + e + f + g + h + j + k) * 0.09;
        double totalEarnings = wages + salesEarnings;
        System.out.printf("%nYour total earning is %.2f%n", totalEarnings);
    }

}