package assignment;

import java.util.Scanner;

public class MinMax {
    Scanner scan=new Scanner(System.in);
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        double max = 0.0;
        double min = 0.0;

        System.out.print("Enter ten floating points: \n");

        while (input.hasNext()) {
            a = input.nextInt();
            System.out.print("Enter ten floating points: \n");
            if(a == 0) {
                min = a;
                max = a;
                a++;
            }
            else if(a < min) {
                min = a;
            }
            else if (a > max){
                max = a;
            }
        }
        System.out.println("Minimum value: " +min);
        System.out.println("Maximum value: " +max);
    }
}
