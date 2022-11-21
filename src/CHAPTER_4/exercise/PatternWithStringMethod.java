package CHAPTER_4.exercise;

import java.util.Scanner;

public class PatternWithStringMethod {
    public static void patternsWithStringMethod(int num) {
        if (num > 0 && num <= 30) {
            for (int i = 0; i <= num; i++) {
                System.out.println("*  ".repeat(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i != 10) {
            patternsWithStringMethod(input.nextInt());
            i++;
        }
    }
}
