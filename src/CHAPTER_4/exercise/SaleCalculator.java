package CHAPTER_4.exercise;

import java.util.Scanner;

public class SaleCalculator {
    static  Scanner input = new Scanner(System.in);
    /*(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
Item Value
1 239.99
2 129.75
3 99.95
4 350.89*/
    public static void saleCal(){
        double weeklyWages = 0;
        double sales = 0;
        System.out.println("Input item number");
        int itemNumber = input.nextInt();
        while (itemNumber != -1) {
            if (itemNumber == 1) {
                sales += 239.99;
            } else
                if (itemNumber == 2) {
                sales += 129.75;
            } else
                if (itemNumber == 3) {
                sales += 99.95;
            } else
                if (itemNumber == 4) {
                sales += 350.89;
            } else {
                System.out.println("\ninvalid item number");
            }
            System.out.println("Input item number");
            itemNumber = input.nextInt();
        }
        weeklyWages = 200 + sales * 0.09;
        if (weeklyWages < 650){
        System.out.println(weeklyWages);
        } else {
            weeklyWages = 650;
            System.out.println(weeklyWages);
        }
    }

    public static void main(String[] args) {
        saleCal();
    }
}
