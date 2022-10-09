package CHAPTER_7.exercise;

import java.security.SecureRandom;
import java.util.Arrays;

public class MultidimensionalArrayWithAsterisk {
    private static final SecureRandom rand = new SecureRandom();
    private static final int LENGTH = 4;


    public static void dimensional() {
         final int [][] array = new int[LENGTH][];      //random number cannot be used to determine the length of the row else there will be conflict
        array[0] = new int[1 + rand.nextInt(5)]; //random number determining the length of the column
        array[1] = new int[1 + rand.nextInt(5)];    //random number determining the length of the column
        array[2] = new int [1 + rand.nextInt(5)];   //random number determining the length of the column
        array[3] = new int[1 + rand.nextInt(5)];    //random number determining the length of the column


        int total = 0;
        for (int i = 0; i < array.length; i++) { //array.length is talking about the length od the row of the array. The length of the row is 2 hence the length is 2
            for (int j = 0; j < array[i].length; j++) { //array[i] is talking about the length of the column. the length of the column is inconsistent, hence the length is not consistent
                array[i][j] = (1 + rand.nextInt(15));   //populating the element of each array index with random numbers
                total += array[i][j];
            }
        }


        for (int rows = 0; rows < array.length; rows++) {   //for (int[] rows : array) {
            for (int columns = 0; columns < array[rows].length; columns++) { //for (int columns : ints) {
                for (int elementValue = 0; elementValue < array[rows][columns]; elementValue++) { // printing the value of each element as asterisks
                    System.out.print("* "); // the element values printing the asterisks
                }
                System.out.println(); //the column new line
            }
            System.out.println(); // the row new line
        }
        System.out.printf("Total of the elements in the array = %d", total);
        System.out.println();
        System.out.print(Arrays.deepToString(array)); // the arrays printed toString
    }

    public static void main(String[] args) {
        dimensional();
    }
}
