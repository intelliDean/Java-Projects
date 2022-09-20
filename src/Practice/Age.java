package Practice;

import java.util.Scanner;

public class Age {
    /*Take input of age of 3 people by user and determine oldest and youngest among them.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input age");
        int age1 = input.nextInt();
        int age2 = input.nextInt();
        int age3 = input.nextInt();

        int largest = Math.max(age1, Math.max(age2, age3));
        int lowest = Math.min(age1, Math.min(age2, age3));

        System.out.println("The oldest is "+ largest + ", while the youngest is "+ lowest);

    }
}
