package CHAPTER_7;

import java.util.Scanner;

public class SumOfLargestRow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = input.nextInt();
        System.out.println("Enter number of columns");
        int columns = input.nextInt();

        //GenerateArrayWithUserInput is a class where the method integer2DArrays was called to generate arrays of int data type
        String largestRow = largestRow(GenerateArrayWithUserInput.integer2DArrays(rows, columns));
        System.out.println(largestRow);
    }
    public static String largestRow(int[][] matrix) {
        int maxRow = 0;
        int indexOfMaxRow = 0;
            // Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }

        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalOfThisRow += matrix[row][column];
                if (totalOfThisRow > maxRow) {
                    maxRow = totalOfThisRow;
                    indexOfMaxRow = row;
                }
            }
        }
        return String.format("%nRow %d has the maximum sum of %d%n", indexOfMaxRow, maxRow);
    }
}
