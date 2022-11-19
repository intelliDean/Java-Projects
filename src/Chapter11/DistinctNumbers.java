package Chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with any number less than 0): \n");
        int value;

        do {
            value = input.nextInt(); // Read a value from the input

            if (!list.contains(value) && value >= 0) {      // if the number inputted is not in the list,
                list.add(value); // add it to the set of distinct numbers
            }
        } while (value >= 0);


            // Display the distinct numbers

        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
