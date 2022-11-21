package CHAPTER_4.exercise;

import java.util.Scanner;

public class Validate {

    /*(Validating User Input) Modify the program in Fig. 4.12 to validate its inputs.
    For any input, if the value entered is other than 1 or 2, keep looping until the
    user enters a correct value.*/
    static Scanner input = new Scanner(System.in);
    public static void valid(int num){
    while (num != 1 && num != 2) {
        System.out.println("""

            Enter number
            or either of 1 or 2 to quit""");
        num = input.nextInt();
    }
    }

    public static void main(String[] args) {

    System.out.println("Enter number");
    int num = input.nextInt();
    valid(num);
    }
}
