package chapter14.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");

        String string1 = """
                Jane's Birthday is 05-12-1975
                Dave's Birthday is 11-04-1968
                Joe's Birthday is 12-17-1977
                John's Birthday is 04-28-1973
                """;

        // match regular expr
        Matcher matcher = expression.matcher(string1);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}