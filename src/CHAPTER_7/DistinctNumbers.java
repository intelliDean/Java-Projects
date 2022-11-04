package CHAPTER_7;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

public class DistinctNumbers {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();

         ArrayList<Integer> result = distinctArrays(list);

        // Display the distinct numbers
        displayList(result);
    }
    public static ArrayList<Integer> distinctArrays(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0)\n");
        int value;
        do {
            value = input.nextInt(); // Read a value from the input

            if (!list.contains(value) && value != -1) {
                list.add(value);    // Add the value if it is not in the list
            }
        } while (value != -1);
        return list;
    }
    public static void displayList(ArrayList<Integer> result) {
        for (Integer each : result) {
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("The list before being sorted\n"+result);
        sort(result);
        System.out.println("\nThe list after being sorted\n"+result);
    }
}
