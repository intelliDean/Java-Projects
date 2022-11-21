package CHAPTER_7;

public class PascalTriangle {
    public static void main(String[] args) {
        pascalTriangle(6);
    }
    public static void pascalTriangle(int size) {
        int[][] pascalTr = new int[size][size];
        int row, column;
        //assign zero to every array element
        for (row = 0; row < size; row++) {
            for (column = 0; column < size; column++){
                pascalTr[row][column] = 0;
            }
        }
        //first and second rows are set to 1s
        pascalTr[0][0] = 1;
        pascalTr[1][0] = 1;
        pascalTr[1][1] = 1;

        for (row = 2; row < size; row++) {
            pascalTr[row][0] = 1;
            for (column = 1; column <= row; column++) {
                pascalTr[row][column] = pascalTr[row - 1][column - 1] + pascalTr[row - 1][column];
            }
        }
        //display the Pascal Triangle
        for (row = 0; row < size; row++) {
            for (column = 0; column <= row; column++) {
                System.out.print(pascalTr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
