package chapter14;

import java.util.Arrays;

public class StringConstructor {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");
// use String constructors
        String s1 = new String();   // no arg constructor
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 3, 6);
        System.out.printf(
                "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
    }
}
