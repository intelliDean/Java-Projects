package student_grade;


import java.util.Arrays;

public class Scores {
    private Student students;
    private int[] scores;

    public Scores(Student student) {
        scores = new int[5];
        this.students = student;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
    public int totalScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-25s %-15d", students, Arrays.toString(scores), totalScore());
    }
}
