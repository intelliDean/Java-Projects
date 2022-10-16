package chapter8;

public class TimeOverloadedDriver {
    public static void main(String[] args) {
        TimeOverloaded time1 = new TimeOverloaded(); // 00:00:00
        TimeOverloaded time2 = new TimeOverloaded(2); // 02:00:00
        TimeOverloaded time3 = new TimeOverloaded(25, 34); // 21:34:00
        TimeOverloaded time4 = new TimeOverloaded(12, 25, 42); // 12:25:42
        TimeOverloaded time5 = new TimeOverloaded(time4); // 12:25:42


         System.out.println("Constructed with:");
         displayTime("Time1: all default arguments", time1);
         displayTime("Time2: hour specified; default minute and second", time2);
        displayTime("Time3: hour and minute specified; default second", time3);
         displayTime("Time4: hour, minute and second specified", time4);
         displayTime("Time5: Time2 object t4 specified", time5);
        // attempt to initialize t6 with invalid values
         try {
            TimeOverloaded time6 = new TimeOverloaded(20, 74, 99); // invalid values
         }
         catch (IllegalArgumentException ex) {
             System.out.printf("%nException while initializing Time6: %s%n",
                    ex.getMessage());
             }
         }

         // displays a Time2 object in 24-hour and 12-hour formats
         private static void displayTime(String header, TimeOverloaded time) {
         System.out.printf("%s%n %s%n %s%n", header, time.toUniversalString(), time.toString());
         }
}