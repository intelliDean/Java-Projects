package Practice;

import java.util.Scanner;

public class Year {
/*Write a program to check if a year is leap year or not.
[Hint] If a year is divisible by 4 then it is leap year but if the
year is century year like 2000, 1900, 2100 then it must be divisible by 400.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        for (int i = 1; i > 0; i++){
            System.out.println("Input year or 0 to quit");
            int year = input.nextInt();
            if (year != 0) {
                if ( year % 4 == 0) {
                    System.out.printf("%d is a leap year%n%n", year);
                }
                else {
                    System.out.printf("%d is not a leap year%n%n", year);
                }
            } else break;
        }
    }
}
