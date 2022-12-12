package student_grade;

public class GradeDriver {
    public static void main(String[] args) {
        Grades grades = new Grades();

        Student dean = new Student("Dean", "1234");
        Scores deanGrade = new Scores(dean);
        deanGrade.setScores(new int[]{89,76,87,76,90});
        grades.addGrades(deanGrade);

        Student mikeDean = new Student("Dean", "5564");
        Scores mikeGrade = new Scores(mikeDean);
        mikeGrade.setScores(new int[]{67,96,87,76,89});
        grades.addGrades(mikeGrade);

        Student sule = new Student("Sule", "7804");
        Scores suleGrade = new Scores(sule);
        suleGrade.setScores(new int[]{67,96,87,76,89});
        grades.addGrades(suleGrade);

        grades.displayGrade();
    }

}
