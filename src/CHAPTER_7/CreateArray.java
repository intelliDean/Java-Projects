package CHAPTER_7;

public class CreateArray {
     public static void main(String[] args) {
            // declare variable array and initialize it with an array object
          int [] number = new int[10]; //Create an array object
          System.out.printf("%7s%8s%n", "Index", "Value");
            // output each array element's value
          for (int counter = 0; counter < number.length; counter+=1) {
              System.out.printf("%5d%8d%n", counter, number[counter]);
          }
     }
}
