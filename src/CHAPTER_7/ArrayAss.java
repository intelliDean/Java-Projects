package CHAPTER_7;

public class ArrayAss {
    /*Create an array and initialize it with values.
    Sum all the values in the array and print them out.*/
    public static void main(String[] args) {

        int [] numbers = {3,5,8,9,12,45,89,65,35,28,89,90,76};
        for(int i = 0; i < numbers.length; i++){
            System.out.printf("%n%s%n %d: %d", "The result", i, numbers[i]);
        }
    }
}
