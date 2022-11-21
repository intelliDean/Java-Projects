package Practice;

public class ProblemArray {
    public static void main(String[] args) {
        String [] problems = {"Sapa", "Food", "TDD", "Python", "Konji"};
        problem(problems);
    }
    public static void problem(String[] problems){
        System.out.println("");
        for (int i = 0, j = problems.length - 1; i < problems.length; i++, j--) {
            System.out.printf("%n%-3d%-10s", j + 1, problems[i]);
        }
    }
}
