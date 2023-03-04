package funtional_interface;

import org.jetbrains.annotations.NotNull;

import java.util.function.Function;
//TODO: Function takes a parameter and and returns a value
public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, String> function = (age) ->  ageVerification(age); //FunctionInterface :: ageVerification;

        System.out.println(function.apply(34));

    //==================================================================================================================
    // TODO: 26-Jan-23 i will check if function does the same as unary operator
        //todo: This serves like UnaryOperator Interface
    Function<Integer, Integer> upgrade = (salary) -> salary * 2;

    int result = upgrade.apply(345500);
        System.out.printf("Salary is doubled to $%,d%n", result);

    //==================================================================================================================
        Function<String, String> string = (name) -> spacedWord(name);  //TODO: FunctionInterface :: spacedWord;

        System.out.println(string.apply("Michael"));

    //==================================================================================================================
    }

    @NotNull
    private static String spacedWord(String name) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < name.length(); i++) {
            buffer.append(name.charAt(i)).append(" ");
        }
        return buffer.toString();
    }

    @NotNull
    private static String ageVerification(Integer age) {
        if (age > 45) return "This is an old person";
        else if (age < 45) {
            return "This is a youth";
        }
        else return "neutral man";
    }
}
