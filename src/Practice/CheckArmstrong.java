package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to check armstrong number");
        int number = input.nextInt();

        ArrayList<Integer> result = armstrongThreeNumbers(number);
        ArrayList<Integer> outcome = armstrongFourNumbers(number);
        System.out.println("Armstrong number to 3rd power -> "+result);
        System.out.println("Armstrong number to 4th power -> "+outcome);

        System.out.println("\nEnter the nth number of armstrong and the number to check with");
        int n = input.nextInt();
        int reply = input.nextInt();
        ArrayList<Integer> check = armstrongNthNumbers(n, reply);
        System.out.println("Armstrong number to "+ n +" power -> "+check);
    }
    public static ArrayList<Integer> armstrongThreeNumbers(int number) {
        ArrayList<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (ArmstrongNumbers.isThreeArmstrong(i)) {
                arrays.add(i);
            }
        }
        return arrays;
    }
    public static ArrayList<Integer> armstrongFourNumbers(int number) {
        ArrayList<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (ArmstrongNumbers.isFourArmstrong(i)) {
                arrays.add(i);
            }
        }
        return arrays;
    }
    public static ArrayList<Integer> armstrongNthNumbers(int n, int number) {
        ArrayList<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (ArmstrongNumbers.isNthArmstrong(n, i )) {
                arrays.add(i);
            }
        }
        return arrays;
    }
}
