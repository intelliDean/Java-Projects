package CHAPTER_7;

import java.util.Arrays;
import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arrays of char");
        String ray = input.nextLine(); //String is actually an array of char. so passing a string into an array of char will put them into an array of string
        System.out.println("\nThis is the string of the char array");
        System.out.println(charArray(ray.toCharArray()));   //this will output the string of chains of array
        System.out.println("\nThe array version\n"+Arrays.toString(ray.toCharArray()));
        System.out.println("\nat index[3]\n"+ray.charAt(3));    //this will output the char array at index 3
    }
    public static char[] charArray(char[] word) {
        return word;
                //{'D', 'e', 'a', 'n', ' ', 'i', 's', ' ', 'a', ' ', 'm', 'a', 'n'};
    }
}
