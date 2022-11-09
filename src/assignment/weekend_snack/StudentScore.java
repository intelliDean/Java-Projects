package assignment.weekend_snack;

public class StudentScore {
    private final String courseName;
    private  final String[] studentsName = new String[100];
    private int numberOfStudents;
    private int[][] courseScore;

    public StudentScore(String name, String courseName) {
        studentsName[numberOfStudents] = name;
        numberOfStudents++;
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        studentsName[numberOfStudents] = student;
    }
    public void addScore(int myScore) {
        int[][] score = new int[100][3];
        for (int i = 0; i < 3; i++) {
            score[numberOfStudents][i] = myScore;
        }
        courseScore = score;
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
}
