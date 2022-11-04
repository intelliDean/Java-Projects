//package chapter8;
//
//public class Time1Driver {
//    public static void main(String[] args) {
//         // create and initialize a Time1 object
//        Time time = new Time(); // invokes Time1 constructor
//         // output string representations of the time
//        displayTime("After time object is created", time);
//        System.out.println();
//
//            // change time and output updated time
//        time.setTime(13, 27, 6);
//        displayTime("After calling method setTime", time);
//        System.out.println();
//
//         // attempt to set time with invalid values
//        try {
//            time.setTime(99, 99, 99); // all values out of range
//        }
//        catch (IllegalArgumentException e) {
//             System.out.printf("Exception: %s%n%n", e.getMessage());
//        }
//         // display time after attempt to set invalid values
//        displayTime("After calling setTime with invalid values", time);
//    }
//
//         // displays a Time1 object in 24-hour and 12-hour formats
//    private static void displayTime(String header, Time aago) {
//        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
//                 header,aago.toUniversalString(), aago.toString());
//    }
//}
