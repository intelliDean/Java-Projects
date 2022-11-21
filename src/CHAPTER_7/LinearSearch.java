package CHAPTER_7;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {23, 65, 34, 23, 65, 23, 65, 90};
        linearSearch(array, 65);
    }
    public static void linearSearch(int[] list, int key) {
        System.out.print("Search found at index ");
         for (int i = 0; i < list.length; i++) {
             if (key == list[i]) {
                 list[i] = i;

                 System.out.print(list[i]+", ");
             }
         }
    }
}
