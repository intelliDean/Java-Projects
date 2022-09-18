package CHAPTER_7;

public class InitializeArray {
    public static void main(String[] args) {
            // declare variable array and initialize it with an array object
         int [] number = {23, 34, 89, 23, 78, 90, 78, 12, 32, 34};
             System.out.printf("%7s%8s%n", "Index", "Value");
         for (int counter = 0; counter < number.length; counter+=1) {
                // if (counter % 3 != 0){
                System.out.printf("%5d%8d%n", counter, number[counter]);//}
         }
            //    System.out.println(number[4] * number[8] - number[2]);

    }

}
