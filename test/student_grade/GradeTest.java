package student_grade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    Grades grades;

    @BeforeEach
    void setUp() {
        grades = new Grades();
    }
    @Test
    void objectExists() {
        assertNotNull(grades);
    }
    @Test
    void studentList() {
        Student dean = new Student("Dean", "1234");
        Scores deanGrade = new Scores(dean);
        deanGrade.setScores(new int[]{76, 56, 90, 87, 76});
        grades.addGrades(deanGrade);
        assertEquals(1, grades.numberOfGrades());
    }
    @Test
    void findById() {
        Student dean = new Student("Dean", "1234");
        Scores deanGrade = new Scores(dean);
        deanGrade.setScores(new int[]{76, 56, 90, 87, 76});
        grades.addGrades(deanGrade);
        Student mike = new Student("Mike", "3212");
        Scores mikeGrade = new Scores(mike);
        mikeGrade.setScores(new int[]{98, 43, 89, 78, 76});
        grades.addGrades(mikeGrade);
        assertEquals(2, grades.numberOfGrades());
        assertEquals(deanGrade, grades.findById("1234"));
    }
    @Test
    void idIsUniqueAndUpdate() {
        Student dean = new Student("Dean", "1234");
        Scores deanGrade = new Scores(dean);
        deanGrade.setScores(new int[]{76, 56, 90, 87, 76});
        grades.addGrades(deanGrade);
        Student mike = new Student("Mike", "1234");
        Scores mikeGrade = new Scores(mike);
        mikeGrade.setScores(new int[]{98, 43, 89, 78, 76});
        grades.addGrades(mikeGrade);
        assertEquals(1, grades.numberOfGrades());
        assertArrayEquals(new int[]{98, 43, 89, 78, 76}, mikeGrade.getScores());
    }
    @Test
    void deleteGrade() {
        Student dean = new Student("Dean", "1234");
        Scores deanGrade = new Scores(dean);
        deanGrade.setScores(new int[]{76, 56, 90, 87, 76});
        grades.addGrades(deanGrade);
        Student mike = new Student("Mike", "4323");
        Scores mikeGrade = new Scores(mike);
        mikeGrade.setScores(new int[]{98, 43, 89, 78, 76});
        grades.addGrades(mikeGrade);
        grades.deleteGrade(mikeGrade);
        assertEquals(1, grades.numberOfGrades());
    }

}