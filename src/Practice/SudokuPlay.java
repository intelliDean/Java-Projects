package Practice;

public class SudokuPlay {
    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];

        for (int i = 0; i < sudoku.length; i++) {

             for (int j = i; j < sudoku[i].length; j++) {
                sudoku[i][j] = j + 1;
                System.out.print(sudoku[i][j] + "   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "   ");
            }
            System.out.println();

        }

    }
}
