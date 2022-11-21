package chapter10.Course;

public class Course {
    private final String courseName;
    private  final String[] studentsName = new String[100];
    private int numberOfStudents;
    private int[][] courseScore = new int[100][3];

    public Course(String name, String courseName) {
        studentsName[numberOfStudents] = name;
        numberOfStudents++;
        this.courseName = courseName;

       //students = new String[no];
    }

    public void addStudent(String student) {
        studentsName[numberOfStudents] = student;
    }
    public void addScore(int score) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                courseScore[numberOfStudents][j] = score;
            }
        }
    }
    public int[][] getCourseScore() {
        return courseScore;
    }

    public String[] getStudents() {
        return studentsName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Programming Exercise 10.9
    }
}
