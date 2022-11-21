package CHAPTER_7;

public class MultiArray {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2}, {4, 5, 6}, {3}, {3,6},{7,6,4,3,2,8,5}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
        System.out.println("Values in array1 by row are");
        outputArray(array1); // displays array1 by row

         System.out.printf("%nValues in array2 by row are%n");
         outputArray(array2); // displays array2 by row

    }
           // output rows and columns of a two-dimensional array
    public static void outputArray(int[][] array) {
        for (int row = 0; row < array.length; row++){ // this gives the array length, which is the length of its row and not column

            for (int column = 0; column < array[row].length; column++) { // this brings out the value in each row, as a result, the column

                System.out.printf("%d ", array[row][column]); // this print out the array's row and column's value.
            }

            System.out.println();
        }
    }
}