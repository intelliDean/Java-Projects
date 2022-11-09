package chapter10.Course;

import java.util.Scanner;

public class CourseDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course course1 = new Course("Dean","Data Structures");
        Course course2 = new Course("Michael","Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.printf("%d students registered for %s%n", course1.getNumberOfStudents(), course1.getCourseName());

        String[] studentArrays = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(i+1+ ": "+studentArrays[i]);
        }

        System.out.println();
        System.out.printf("%d students registered for %s%n", course2.getNumberOfStudents(), course2.getCourseName());
        studentArrays = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println(i+1+ ": "+studentArrays[i]);
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter score"+(j+1));
                course1.addScore(input.nextInt());
            }
        }
    }
}
