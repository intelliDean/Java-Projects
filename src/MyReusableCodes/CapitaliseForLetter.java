package MyReusableCodes;

public class CapitaliseForLetter {
    public static void main(String[] args) {
        String word = "dean";
        String result = capitaliseFirstLetter(word);
        System.out.println(result);
    }
    public static String capitaliseFirstLetter(String userInput) {
        String firstLetter = (""+ userInput.charAt(0)).toUpperCase();
        StringBuilder otherLetters = new StringBuilder();
        for (int i = 1; i < userInput.length(); i++) {
            otherLetters.append(userInput.charAt(i));
        }
        return firstLetter + otherLetters.toString().toLowerCase();
    }
    public static String capitalise(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);

    }
}
