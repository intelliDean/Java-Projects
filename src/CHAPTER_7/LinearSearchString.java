package CHAPTER_7;

public class LinearSearchString {
    public static void main(String[] args) {
        String word = "Dean is a very good person";
        char target = 'r';
        int result = linearSearchCount(word, target);
        System.out.println(result);
    }
    public static int linearSearchIndex(String word, char target) {
        if (word.length() == 0) {
            return -1;
        }
        for (int i = 0; i < word.length(); i++) {
            if (target == word.charAt(i)) {
                return i;
            }
        }

        return -1;
    }
    public static int linearSearchCount(String word, char target) {
        if (word.length() == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (target == word.charAt(i)) {
                count++;

            }
        }

        return count;
    }
    public static boolean linearSearchBool(String word, char target) {
        if (word.length() == 0) {
            return false;
        }
        for (char ch : word.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
}
