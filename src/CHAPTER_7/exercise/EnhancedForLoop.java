package CHAPTER_7.exercise;

public class EnhancedForLoop {
    public static void forLoop() {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        int sum = 0;
        int i = 0;
        // add each element's value to total
        for (int number : array) {
            if (i % 2 == 0) { //only the even index including index 0
                sum += number;
            }
            i++;
            total += number;
        }
        System.out.print(sum);
        System.out.printf("%nTotal of array elements: %d%n", total);
    }

    public static void main(String[] args) {
        forLoop();
    }
}
