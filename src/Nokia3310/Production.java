package Nokia3310;

// important import statements

public class Production
{
    // main method
    public static void time() {
        long millis = System.currentTimeMillis();

        // creating a new object of the class Date
        java.util.Date date = new java.util.Date(millis);
        System.out.printf("%nToday's date and time is %n%n%s%n", date);


    }

}