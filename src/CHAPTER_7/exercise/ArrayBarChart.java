package CHAPTER_7.exercise;

public class ArrayBarChart {
    public static void chart() {
        int[] array = {0, 0, 0, 0, 0, 6, 1, 2, 4, 2, 1};
        System.out.println("Grade distribution:");
         // for each array element, output a bar of the chart
         for (int i = 0; i < array.length; i++) {
         // output bar label ("00-09: ", ..., "90-99: ", "100: ")
             if (i == 10) {
                System.out.printf("%8d: ", 100);
             }
             else {
                System.out.printf("%02d - %03d: ", i * 10, i * 10 + 9);
             }
                // print bar of asterisks
            for (int stars = 0; stars < array[i]; stars++) {
                System.out.print("* ");
            }

            System.out.println();
         }
    }

    public static void main(String[] args) {
        chart();
    }
}