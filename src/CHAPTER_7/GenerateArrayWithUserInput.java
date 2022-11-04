package CHAPTER_7;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateArrayWithUserInput {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arrays = string1DArrays(5);

        System.out.println("\n"+Arrays.deepToString(arrays));
    }
    public static int[] integer1DArrays(int column) {
        int[] arrays = new int[column];
        for (int i = 0; i < arrays.length; i++) {
            System.out.printf("Enter int arrays[%d]:  ", i);
            arrays[i] = input.nextInt();
        }
        return arrays;
    }
    public static double[] double1DArrays(int column) {
        double[] arrays = new double[column];
        for (int i = 0; i < arrays.length; i++) {
            System.out.printf("Enter double arrays[%d]:  ", i);
            arrays[i] = input.nextDouble();
        }
        return arrays;
    }
    public static String[] string1DArrays(int column) {
        String[] arrays = new String[column];
        for (int i = 0; i < arrays.length; i++) {
            System.out.printf("Enter String arrays[%d]:  ", i);
            arrays[i] = input.nextLine();
        }
        return arrays;
    }
    public static int[][] integer2DArrays(int rows, int columns) {
        Scanner input = new Scanner(System.in);
        int[][] arrays = new int[rows][columns];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("Enter int arrays[%d][%d]:  ", i, j);
                arrays[i][j] = input.nextInt();
            }
        }
        return arrays;
    }
    public static int[][] integer2DArraysWithColumnsSizes(int rows) {
        Scanner input = new Scanner(System.in);
        int[][] arrays = new int[rows][];
        for (int i = 0; i < arrays.length; i++) {
            System.out.printf("Column size for row[%d]:  ", i);
            arrays[i] = new int[input.nextInt()];
        }

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("Enter arrays[%d][%d]:  ", i, j);
                arrays[i][j] = input.nextInt();
            }
        }
        return arrays;
    }
    public static double[][] double2DArrays(int rows, int columns) {
        Scanner input = new Scanner(System.in);
        double[][] arrays = new double[rows][columns];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("Enter double arrays[%d][%d]:  ", i, j);
                arrays[i][j] = input.nextDouble();
            }
        }
        return arrays;
    }
    public static String[][] string2DArrays(int rows, int columns) {
        Scanner input = new Scanner(System.in);
        String[][] arrays = new String[rows][columns];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("Enter string arrays[%d][%d]:  ", i, j);
                arrays[i][j] = input.nextLine();
            }
        }
        return arrays;
    }

}
