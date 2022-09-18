package CHAPTER_7;

public class SUmArrayElement {
public static void main(String[] args) {
    int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
    int total = 0; // add each element's value to total
        for (int counter = 0; counter < array.length; counter++) {
             total += array[counter];
        }
        //Enhanced for loop
//    for (int i : array) {
//        total += i;
//    }
        System.out.printf("Total of array elements: %d%n", total);
    }
}
