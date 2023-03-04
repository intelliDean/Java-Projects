package funtional_interface;

import java.util.function.BiPredicate;

public class BiPredicateInterface {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (name, earning) -> name.length() < earning;

        System.out.println(biPredicate.test("Michael Dean Oyewole", 123));
    }
}
