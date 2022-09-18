//package assignment;
//
//import java.util.Scanner;
//
//public class Grade {
//    public static <letterGrade> void main(String[] args) {
//        /*(Student Grades) A group of five students earned the following grades:
//        Student 1, ‘A’; student 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’.
//        Write an application that reads a series
//        of pairs of numbers as follows:
//        a) student name
//        b) student letter grade
//        Your program should use a switch statement to determine how many students got a grade of ‘A’,
//        how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
//        loop as needed to input the five student grades, and then finally display the results.*/
//
//        Scanner input = new Scanner(System.in);
//        /*System.out.println("Enter student name");
//        String student1 = input.nextLine();
//        System.out.println("Enter grade");
//        System.out.println("Enter student name ");*/
//
//        String student1 = "A";
//        String student2 = "C";
//        String student3 = "B";
//        String student4 = "A";
//        String student5 = "B";
//
//        String letterGrade;
//        int i =1;
//        int total = 0;
//
//        int aCount = 0;
//        int bCount = 0;
//        int cCount = 0;
//
//        while(i <= 5){
//           // System.out.println("Enter student name");
//            //String name = input.nextLine();
//            System.out.println("Input grade");
//            letterGrade = input.nextLine();
//
//            total += i;
//            i++;
//            switch (letterGrade) {
//                case "A" -> student1,student3 = A; aCount++;
//                case "B" -> cCount++;
//                case "C" -> bCount++;
//                default -> {
//                }
//            }
//        }
//        System.out.printf("%d:%d:%d", aCount, bCount, cCount);
//    }
//}
