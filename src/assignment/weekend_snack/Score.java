package assignment.weekend_snack;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] studentGrade;

        System.out.println("How many students do you have?");
        int student = input.nextInt();

        System.out.println("How many Subjects do you offer?");
        int subjects = input.nextInt();

        studentGrade = new int[student][subjects];
        System.out.println("Saved successfully");

        for (int i = 0; i < student; i++) {
            for (int j = 0; j < subjects; j++) {
                System.out.printf("Enter score for student %d in course %d%n", (i + 1), (j + 1));
                studentGrade[i][j] = input.nextInt();
                System.out.println("Saved successfully");
            }
        }
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < subjects; j++) {
                System.out.print(studentGrade[i][j]+" ");
            }
            System.out.println();
        }
        int total = 0;
        double avg;
        double[] inAvg = new double[student];
        int[] inTot = new int[student];
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < subjects; j++) {
                total += studentGrade[i][j];
            }
            inAvg[i] = (float) total / subjects;
            inTot[i] = total;
        }

        System.out.printf("%n%s%n%-20s%-10s%-10s%-10s%-10s%-10s%-10s%n%s%n", "==========================================================================",
                "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVG", "POS", "==========================================================================");


//            System.out.printf("%n%s%10d%-5d%-5d%-5d%-5d%-5.2f%-5d",
//                    "Student", 1, studentGrade[0], studentGrade[1], studentGrade[2];
        int tot = 0;
        double ave = 0;
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < subjects; j++) {
//                total = studentGrade[i][j];
//                ave = (float) total /
                System.out.printf("%-10d",studentGrade[i][j]);
            }
            System.out.println();
        }




    }
}
