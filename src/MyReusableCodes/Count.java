package MyReusableCodes;

public class Count {
    public static void main(String[] args) {

    }
    public static int digits(long arr) {
        if (arr < 0) {
            arr *= -1;
        }
        if (arr == 0) {
            return 1;
        }
        int count = 0;
        while (arr > 0) {
            count++;
            arr /= 10;
        }
        return count;
    }
    public static int digits2(long arr) {
        return (int) Math.log10(arr) + 1;
    }
    public static int string(String word) {
        return word.length();
    }
}
