package assignment;

public class SumNumbersWithLoop {
    public static int sumWithLoop(int figure) {
        int total = 0;
        for (int i = 1; i <= figure; i++) {
            total = total + i;
            System.out.printf("%d ", total);
         }
        return total;
    }

}