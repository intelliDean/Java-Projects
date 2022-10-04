package chapter5.exercise;

import static CHAPTER_4.exercise.LargestNumber.input;

public class BarChartPrinting {
    /*(Bar-Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks.
For example, if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.*/

    public static void printBarChart(int num) {
        int [] arr = new int[num];
        System.out.printf("%n input %d numbers separately%n", num);
        for (int i = 0; i < arr.length; i++) {
            int numbers = input.nextInt();
            if (numbers >= 0) {
            arr[i] = numbers;
            } else {
                System.out.println("input non-negative numbers");
            }
        }
        for (int each : arr) {                  // for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < each; j++) {     //for (int j = 0; j < arr[i]; j++) {
                System.out.print("*  ");        //  System.out.print("*  ");
            }                                     //  }
            System.out.println("");                //System.out.println("");
        }
    }                                            //}

    public static void main(String[] args) {
        System.out.println("How many bar charts do you want?");
        int num = input.nextInt();
        printBarChart(num);
    }
}
