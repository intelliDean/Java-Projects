package funtional_interface;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    //TODO: This take 2 parameters plus a return type and it returns a  value
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction =
                (firstAge, secondAge) -> compareAge(firstAge, secondAge); //BiFunctionInterface :: compareAge;

        System.out.println(biFunction.apply(34, 24));

    //==================================================================================================================

        BiFunction<Integer, Integer, Integer> subtraction = (num1, num2) -> num1 - num2;

        System.out.println("The difference is:: "+subtraction.apply(548, 232));

    }

    private static String compareAge(Integer firstAge, Integer secondAge) {
        if (firstAge > secondAge) {
            return String.format("%d is older than %d%n", firstAge, secondAge);
        } else if (secondAge > firstAge) {
            return String.format("%d is younger than %d%n", firstAge, secondAge);
        } else {
            return String.format("%d and %d the same age%n", firstAge, secondAge);
        }
    }
}
