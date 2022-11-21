package Practice;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        boolean test = "440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}");
        System.out.println(test);

        System.out.println(Pattern.matches(
                "geeksforge*ks", "geeksforgeeks"));

        System.out.println(
                Pattern.matches("g*geeks*", "geeksfor"));
    }
}
