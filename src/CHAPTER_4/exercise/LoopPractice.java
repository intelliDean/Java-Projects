package CHAPTER_4.exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class LoopPractice {
    /*ARRAY - to compare two array in an array, have two for loop and have the first one start from
    index zero and the second for loop to start from index 1 and by that, you compare the two loops*/
    static Scanner input = new Scanner(System.in);
    private static final SecureRandom pass = new SecureRandom();

  /*!*/  public static void grade(){
        int i = 1;
        double total = 0;
        while (i <= 10) {
            //this application can also take user input for the grade but for more accuracy and to eradicate error, random numbers is better
            double grade = 10 * (5 + pass.nextDouble(5)); // this method generate random secure numbers instead of taking user input, it is constructed to take minimum of 50
            System.out.printf("Student %d: %.2f%n", i, grade);
            total += grade;
            i++;
        }
        double avg = total / 10;
        System.out.printf("%n%s %.2f %n%s %.2f%n", "The total score is ", total, "while the average is ", avg);
    }
    public static void count () {
        int count = 1;
        while (count <= 100) {
            count *= 3;
            System.out.println(count);
        }
    }
    public static void sentiGrade(){
        double grade = 1;
        double total = 0;
        int count = 0;
        System.out.println("Input grade or input -1 to quit");
        grade = input.nextInt();
        while (grade != -1){
            total += grade;
            count++;
            //System.out.println("Input grade or input -1 to quit");
            grade = input.nextInt();
        }
        if (count > 0) {
        double avg = total / count;
        System.out.printf("%nThe total grade of %d students is %.2f%n while the average grade is %.2f%n", count, total, avg);
        } else {
            System.out.println("No grades!");
        }
    }
    public static void sum (int a, int b) {
      try{
          System.out.println(a + b);
      } catch (IllegalArgumentException ignored) {

      }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //grade();
       // sentiGrade();
        int aCount = 0;
        int bCount = 0;
        int total = 0;
        int result = 0;
        int i = 1;
        while (i <= 10) {
            System.out.println("\nInput grade");
            int grade = input.nextInt();
            if (grade >= 70) {
                result = 1;
                System.out.printf("Student %d: %d%n", i, result);
                aCount++;
                //total += grade;
            } if (grade < 70) {
                result = 2;
                System.out.printf("Student %d: %d%n", i, result);
                bCount++;
                //total += grade;
            }
            i++;
        }
        System.out.printf("%n%d Students passed, while %d students failed", aCount, bCount);
        System.out.println("");
        if (aCount > 8) {
            System.out.println("\n\nBonus to instructor");
        } else {
            System.out.println("\n\nYou didn't make your instructor proud");
        }

        int d = Integer.parseInt(input.next());
        var h = input.next();

//        String j = "Horse";
//        System.out.println(j.charAt(2));


    }
}
