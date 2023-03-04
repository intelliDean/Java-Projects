package Practice;

public class EasyPalindrome {
    public static void main(String[] args) {

    }

    public static boolean pali(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        String newWord = stringBuilder.reverse().toString();
        return newWord.equals(word);
    }

    public static String rev(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        if (stringBuilder.toString().equals(word)) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }
}
