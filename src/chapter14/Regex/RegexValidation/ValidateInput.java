package chapter14.Regex.RegexValidation;

import org.jetbrains.annotations.Contract;

public class ValidateInput {
    // validate first name
    @Contract(pure = true)
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    // validate last name
    @Contract(pure = true)
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }

    // validate address
    @Contract(pure = true)
    public static boolean validateAddress(String address) {
        return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate city
    @Contract(pure = true)
    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate state
    @Contract(pure = true)
    public static boolean validateState(String state) {
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate zip
    @Contract(pure = true)
    public static boolean validateZip( String zip) {
        return zip.matches("\\d{5}");
    }

    // validate phone
    public static boolean validatePhone( String phone) {
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}
