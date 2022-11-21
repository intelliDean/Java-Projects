package CHAPTER_7;

public class ArrayAss {
    /*Create an array and initialize it with values.
    Sum all the values in the array and print them out.*/
    public static void main(String[] args) {
        int [] numbers = {3, 2};

        int result = sumArray(numbers);
        System.out.println(result);
    }
    public static int sumArray(int[] arrays) {
        if (arrays.length <= 1) {
            return -1;
        }
        int total = 0;
        for (int element : arrays) {
            total += element;
        }
        return total;
    }
}

