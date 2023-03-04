import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arrays = {2,4,6,3,5,1};
        int[] numSquare = square(arrays);
        int[] num = ascSort(numSquare);

        System.out.println(Arrays.toString(num));

        int[] desc = descSort(numSquare);

        System.out.println(Arrays.toString(desc));
    }
    public static int[] square(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }
        return numbers;
    }

    public static int[] ascSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return numbers;
    }
    public static int[] descSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return numbers;
    }
}
