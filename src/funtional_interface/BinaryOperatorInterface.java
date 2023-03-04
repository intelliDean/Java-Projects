package funtional_interface;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (name1, name2)-> binOperator(name1, name2); // BinaryOperatorInterface :: binOperator;

        System.out.println(binaryOperator.apply("Micf", "Femi"));
    }

    private static String binOperator(String name1, String name2) {
        if (name1.length() > name2.length()) {
            return String.format("Length of %s is greater than %s%n", name1, name2);
        } else if (name1.length() < name2.length()) {
            return String.format("Length of %s is greater than %s%n", name2, name1);
        } else {
            return String.format("Length of %s is equal to %s%n", name1, name2);
        }
    }
}
