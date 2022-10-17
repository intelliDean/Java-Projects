package CHAPTER_7.exercise;

import java.util.Scanner;

public class VowelArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arrays of char");
        String ray = input.nextLine(); //String is actually an array of char. so passing a string into an array of char will put them into an array of string
        for (int i = 0; i < ray.length(); i++) {
            if(ray.charAt(i) == 'a' || ray.charAt(i) == 'e' || ray.charAt(i) == 'i' || ray.charAt(i) == 'o' || ray.charAt(i) == 'u') {
                System.out.print(ray.charAt(i)+", ");
            }
        }
    }
    public static char[] vowel(char[] word) {
        return word;
    }
}
