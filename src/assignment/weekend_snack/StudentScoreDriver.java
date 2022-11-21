package assignment.weekend_snack;

import java.util.Scanner;

public class StudentScoreDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentScore dean = new StudentScore("Michael Dean", "Java");
        StudentScore sule = new StudentScore("Sule", "CSS");

        System.out.printf("%n%s%n", dean.getCourseName());

        String[] studentArrays = sule.getStudents();
        for (int i = 0; i < sule.getNumberOfStudents(); i++) {
            System.out.println(i+1+ ": "+studentArrays[i]);
        }


        for (int i = 0; i < 3; i++) {
            dean.addScore(input.nextInt());
        }

        int id = dean.getNumberOfStudents();
        int[][] score = dean.getCourseScore();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(score[id][j]);
            }
        }




//        int studentID = dean.getNumberOfStudents();
//        int[][] gradeScore = new int[100][3];
//        for (int i = 0; i < dean.getNumberOfStudents(); i++) {
//            for (int j = 0; j < 3; j++) {
//                gradeScore[studentID][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < dean.getNumberOfStudents(); i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(gradeScore[studentID][j]+" ");
//            }
//        }


    }
}
