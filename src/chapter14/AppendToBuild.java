package chapter14;

import java.util.Scanner;

public class AppendToBuild {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input name");
        String name = input.nextLine();

        System.out.println(appendToString(name));


    }
    public static String appendToString(String name) {
        String n = name.replace(name.charAt(0), toChar(name).charAt(0));
        StringBuilder nameTag = new StringBuilder(n);
        nameTag.append(name.length() > 8 ? "!" : "->");
        return nameTag.toString();
    }
    public static String toChar(String word) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (word.charAt(0) == i) {
                return  String.valueOf(i).toUpperCase();
            }
        }
        return null;
    }
}
