import java.util.Scanner;

public class Braille {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter letter in the alphabet e.g 'c' or full-stop to quit\n-> ");
        char letter = input.next().trim().charAt(0);

        char[][] post = {
                {' ', ' '},
                {' ', ' '},
                {' ', ' '}
        };
        while (letter != '.') {
            choose(post, letter);
            choose(post, ' ');

            System.out.print("-> ");
            letter = input.next().trim().charAt(0);
        }

        System.out.print("Enter word -> ");
        String word = input.next();
        word(post, word);
    }
    public static void word(char[][] arrays, String word) {
        for (int i = 0; i < word.length(); i++) {
            choose(new char[3][2], word.charAt(i));
        }
    }

    public static void choose(char[][] arrays, char letter) {

        switch (letter) {
            case ' ' -> {
                arrays[0][0] = ' ';
                arrays[0][1] = ' ';
                arrays[1][0] = ' ';
                arrays[1][1] = ' ';
                arrays[2][0] = ' ';
                arrays[2][1] = ' ';
                apply(arrays);
            }
            case 'a' -> {
                arrays[0][0] = '*';
                apply(arrays);
            }
            case 'b' -> {
                arrays[0][0] = '*';
                arrays[1][0] = '*';
                apply(arrays);
            }
            case 'c' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                apply(arrays);
            }
            case 'd' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[1][1] = '*';
                apply(arrays);
            }
            case 'e' -> {
                arrays[0][0] = '*';
                arrays[1][1] = '*';
                apply(arrays);
            }
            case 'f' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                apply(arrays);
            }
            case 'g' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                arrays[1][1] = '*';
                apply(arrays);
            }
            case 'h' -> {
                arrays[0][0] = '*';
                arrays[1][0] = '*';
                arrays[1][1] = '*';
                apply(arrays);
            }
            case 'i' -> {
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                apply(arrays);
            }
            case 'j' -> {
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                arrays[1][1] = '*';
                apply(arrays);
            }
            case 'k' -> {
                arrays[0][0] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 'l' -> {
                arrays[0][0] = '*';
                arrays[1][0] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 'm' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 'n' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[1][1] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 'o' -> {
                arrays[0][0] = '*';
                arrays[1][1] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 'p' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 'q' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                arrays[1][1] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 'r' -> {
                arrays[0][0] = '*';
                arrays[1][0] = '*';
                arrays[1][1] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 's' -> {
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 't' -> {
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                arrays[1][1] = '*';
                arrays[2][0] = '*';
                apply(arrays);
            }
            case 'u' -> {
                arrays[0][0] = '*';
                arrays[2][0] = '*';
                arrays[2][1] = '*';
                apply(arrays);
            }
            case 'v' -> {
                arrays[0][0] = '*';
                arrays[1][0] = '*';
                arrays[2][0] = '*';
                arrays[2][1] = '*';
                apply(arrays);
            }
            case 'w' -> {
                arrays[0][1] = '*';
                arrays[1][0] = '*';
                arrays[1][1] = '*';
                arrays[2][1] = '*';
                apply(arrays);
            }
            case 'x' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[2][0] = '*';
                arrays[2][1] = '*';
                apply(arrays);
            }
            case 'y' -> {
                arrays[0][0] = '*';
                arrays[0][1] = '*';
                arrays[1][1] = '*';
                arrays[2][0] = '*';
                arrays[2][1] = '*';
                apply(arrays);
            }
            case 'z' -> {
                arrays[0][0] = '*';
                arrays[1][1] = '*';
                arrays[2][0] = '*';
                arrays[2][1] = '*';
                apply(arrays);
            }
        }
    }

    public static void apply(char[][] arrays) {
        for (char[] array : arrays) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]);
                if (j % 2 == 1) {
                    System.out.println();
                }
            }
        }
    }

}
