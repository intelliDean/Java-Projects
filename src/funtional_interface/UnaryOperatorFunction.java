package funtional_interface;

import java.util.function.UnaryOperator;

public class UnaryOperatorFunction {
    //TODO: This takes a parameter and returns a value of the same type as the parameter received
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (name) -> String.format("The length of your name is %d%n", name.length());

        System.out.println(unaryOperator.apply("Michael Dean"));
    //==================================================================================================================

    UnaryOperator<Integer> intUnary = integer -> integer * integer;

        System.out.println(intUnary.apply(23));
    }
}
