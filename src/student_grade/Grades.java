package student_grade;

import java.util.ArrayList;
import java.util.List;

public class Grades {
private List<Scores> scores;

    public Grades() {
        scores = new ArrayList<>();
    }

    public void addGrades(Scores score) {
        Scores grade = findById(score.getStudents().getId());
        if (grade == null) {
        scores.add(score);
        } else {
            grade.setScores(score.getScores());
        }
    }

    public int numberOfGrades() {
        return scores.size();
    }

    public Scores findById(String id) {
        for (Scores score : scores) {
            if (score.getStudents().getId().equals(id)) {
                return score;
            }
        }
        return null;
    }

    public void deleteGrade(Scores grade) {
        Scores score = findById(grade.getStudents().getId());
        if (score != null) {
            scores.remove(score);
        }
    }
    public void displayGrade() {
        System.out.printf("""
                %-21s %-17s %-15s
                ""","Name(ID)", "Scores", "Total Score");
        for (Scores score : scores) {
            System.out.println(score);
        }
    }
}
