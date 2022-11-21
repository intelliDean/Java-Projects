package CHAPTER_7;

public class Digits {
    public static void main(String[] args) {
        int result = isDigit("igj7jfj768fj");
        System.out.println(result);
    }
    public static int isDigit(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                count++;
            }
        }
        return count;
    }
    public static int digits(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static int digit(String word) {
        String digits = "1234567890";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (digits.contains(String.valueOf(word.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
