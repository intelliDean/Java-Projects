package chapter10.Course;

public class Course {
    private final String courseName;
    private  final String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName/*int no*/) {
        this.courseName = courseName;
       //students = new String[no];
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
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
