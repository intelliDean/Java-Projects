package CHAPTER_7;

public class ArrayAss {
    /*Create an array and initialize it with values.
    Sum all the values in the array and print them out.*/
    public static void main(String[] args) {

        int [] numbers = {3,5,8,9,12,45,89,65,35,28,89,90,76};
        int total = 0;
        for(int i : numbers){
            total += i;
        }
        System.out.printf("%n %d ", total);

    }
}
/*PSEUDO CODE
Declare the class
call the main method
declare and initialize an array
use the for statement to print the values of array
 */
