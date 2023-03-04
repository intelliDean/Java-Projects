package funtional_interface;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<String> predicate = (word) -> word.length() > 3;      //a one-liner expression does not need return type and the coil braces

        System.out.println(predicate.test("madam"));

    //==================================================================================================================

    Predicate<String> compare = (phrase) -> phrase.length() > 20;


        System.out.println(compare.test("It is a very good day over here and i love it"));

    }
}
