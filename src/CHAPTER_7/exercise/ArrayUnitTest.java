package CHAPTER_7.exercise;

public class ArrayUnitTest {

    public static int addSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }


    public static int getMin(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    public static int getArrayLength(int[] array) {
        return array.length;
    }

    public static int[] copyArray(int[] array) {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static int[] toShiftArray(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
        return array;
    }
    public static int max(int[] array) {
        return addSum(array) - getMin(array);
    }
    public static int min(int[] array){
        return addSum(array) - getMax(array);
    }
    public static void arraySum(int[] array) {
        int[] array2 = new int[array.length];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            System.out.println(sum - array[i]);
        }
    }
}
