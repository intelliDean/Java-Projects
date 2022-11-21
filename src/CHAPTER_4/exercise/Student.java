package CHAPTER_4.exercise;

import java.util.Scanner;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        if (average > 0.0 && average <= 100.0) {
            this.average = average;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAverage(double average){
        if(average > 0.0 && average <= 100) {
            this.average = average;
        }
    }
    public double getAverage(){
        return average;
    }
    public String getGradeLetter(){
        String gradeLetter = "";
        if (average >= 90) {
            gradeLetter = "A";
        } else
            if (average >= 80) {
            gradeLetter = "B";
        } else
            if (average >= 70) {
            gradeLetter = "C";
        } else
            if (average >= 50) {
            gradeLetter = "D";
        }else {
            gradeLetter = "F";
        }
        return gradeLetter;
    }

    public static void main(String[] args) {
        Student me = new Student("Doe", 0.0);
        Student you = new Student("Joe", 0.0);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter student 1 and student 2 name");
        String name1 = input.nextLine();
        String name2 = input.nextLine();

        System.out.println("Enter student 1 and student 2 average");
        double avg1 = input.nextDouble();
        double avg2 = input.nextDouble();

        me.setName(name1);
        you.setName(name2);

        me.setAverage(avg1);
        you.setAverage(avg2);

        System.out.printf("%n%s, you scored %.2f in your exams, hence your grade is %s%n",
                me.getName(), me.getAverage(), me.getGradeLetter());
        System.out.printf("%n%s, you scored %.2f in your exams, hence your grade is %s%n",
                you.getName(), you.getAverage(), you.getGradeLetter());

    }

}
