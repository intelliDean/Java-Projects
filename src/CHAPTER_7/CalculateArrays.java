package CHAPTER_7;

public class CalculateArrays {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // declare constant
            int[] array = new int[ARRAY_LENGTH]; // create array

            // calculate value for each array element
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        for (int counter = 0; counter < array.length; counter++) {
                array[counter] = 2 + 2 * counter;

             System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
