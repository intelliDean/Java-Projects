package chapter14;

import java.util.Scanner;

public class Tokenization {
    public static void main(String[] args) {
        // get sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();

        // process user sentence
        String[] tokens = sentence.split(" ");
        StringBuilder[] newToken = new StringBuilder[tokens.length];
        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);

        System.out.println("StringBuilder version");
        for (int i = 0; i < newToken.length; i++) {
            newToken[i] = new StringBuilder(tokens[i]);
            System.out.print(newToken[i].append("!").append(" "));
        }
        System.out.println();

        System.out.println("String version");
        for (String token : tokens) {
            System.out.print(token+" "); //every word is detached from each other hence you could manipulate each of them
        }

    }
}
