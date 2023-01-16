package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPlay {
    public static void main(String[] args) {
        String text = """
                The more famous version of the Pandora myth comes from another of Hesiod's poems, 
                Works and Days. In this version of the myth (lines 60–105),[8] Hesiod expands upon
                 her origin and moreover widens the scope of the misery she inflicts on humanity. 
                 As before, she is created by Hephaestus, but now more gods contribute to her completion 
                 (63–82): Athena taught her needlework and weaving (63–4); Aphrodite "shed grace upon her 
                 head and cruel longing and cares that weary the limbs" (65–6); Hermes gave her "a shameless 
                 mind and a deceitful nature" (67–8); Hermes also gave her the power of speech, putting in
                  her "lies and crafty words" (77–80); Athena the5n clothed her (72); next Persuasion and the 
                  Charites adorned her with necklaces and other finery (72–4); the Horae adorned her with a garland 
                  crown (75). Finally, Hermes gives this woman a name: "Pandora [i.e. "All-Gift"], because all they 
                  who dwelt on Olympus gave each a gift, a plague to men who eat bread" (81–2).[9]
                """;

       // System.out.println(stringDigits(text));
        String word = "endangered man ended his endered";

        //lazyMatch(word);

        greedyMatch(word);

    }

    private static void lazyMatch(String word) {
        Pattern pattern = Pattern.compile("e.+d");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()){
            System.out.println("lazy match -> "+ matcher.group());
        }
    }

    private static void greedyMatch(String word) {
        Pattern pattern = Pattern.compile("e.+?d");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()){
            System.out.println("lazy match -> "+ matcher.group());
        }
    }

    public static String stringDigits(String text) {
        StringBuilder digits = new StringBuilder(" ");

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                digits.append(text.charAt(i)).append(", ");
            }
        }

        return digits.toString();
    }
}
