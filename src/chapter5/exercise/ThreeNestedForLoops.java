package chapter5.exercise;

public class ThreeNestedForLoops {
    public static void threeForLoops() {

        for (int i = 1; i <= 9; i++) {

             for (int j = 1; j <= i; j++) {

                 for (int k = 1; k <= j; k++) {
                     System.out.print("*  ");
                 }
                 System.out.println();
             }
             System.out.println();
        }
    }

    public static void main(String[] args) {
        threeForLoops();
    }
}
