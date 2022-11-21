package Nokia3310.PhoneClasses;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.*;

public class Clock {
    public static void clock() {
        System.out.print("""
                        
                ***CLOCK***"
                1: Date & Time
                2: Clock settings
                3: Date settings
                4: Stopwatch
                5: Countdown timer
                6: Auto update of time and date
                99: Back""");
        switch (enter()) {
            case 1 -> TimeAndDate();
            case 2 -> clockSetting();
            case 3 -> dateSetting();
            case 4 -> stopwatch();
            case 5 -> countdownTimer();
            case 6 -> autoUpdateOfDateAndTime();
            case 99 -> menu();
            default -> {
                System.out.println(DISPLAY);
                clock();
            }
        }
    }

    public static void TimeAndDate() {
        System.out.print("""
                
                1: Check time
                2: Back""");
        switch (enter()) {
            case 1-> time();
            case 2-> clock();
        }
    }
    public static void time() {
        long millis = System.currentTimeMillis();
        // creating a new object of the class Date
        java.util.Date date = new java.util.Date(millis);
        System.out.printf("%n%21s%n%s%n", "Date & Time is", date);
        TimeAndDate();
    }

    public static void clockSetting() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CLOCK SETTING***", 1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }

    public static void dateSetting() {
        System.out.printf("%n%s%n%d:%s%n",
                "***DATE SETTING***", 1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }

    public static void stopwatch() {
        System.out.printf("%n%s%n%d: %s%n",
                "***STOPWATCH***", 1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }

    public static void countdownTimer() {
        System.out.printf("%n%s%n%d: %s%n",
                "***COUNTDOWN TIMER***", 1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }

    public static void autoUpdateOfDateAndTime() {
        System.out.printf("%n%s%n%d: %s%n",
                "***AUTO UPDATE OF DATE AND TIME***", 1, "Back");
        if (enter() == 1) {
            clock();
        }
    }

}
