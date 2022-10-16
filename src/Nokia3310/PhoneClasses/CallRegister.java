package Nokia3310.PhoneClasses;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.*;

public class CallRegister {
    public static void callRegister() {
        System.out.print("""
                
                ***CALL REGISTER***"
                1: Missed calls
                2: Received calls
                3: Dialled numbers
                4: Erase recent call lists
                5: Show call durations 💕
                6: Show call cost 💕
                7: Call cost settings 💕
                8: Prepaid credits
                
                99: Back""");
        switch (enter()) {
            case 1 -> missedCalls();
            case 2 -> receivedCalls();
            case 3 -> dialledNumbers();
            case 4 -> eraseRecentCallsList();
            case 5 -> showCallDuration();
            case 6 -> showCallCost();
            case 7 -> callCostSetting();
            case 8 -> prepaidCredit();
            case 99 -> menu();
            default -> {
                System.out.println(display);
                callRegister();
            }
        }
    }
    public static void missedCalls() {
        System.out.printf("%n%s%n%d: %s%n",
                "***MISSED CALLS***", 1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }

    public static void receivedCalls() {
        System.out.printf("%n%s%n%d: %s%n",
                "***RECEIVED CALLS***", 1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }

    public static void dialledNumbers() {
        System.out.printf("%n%s%n%d: %s%n",
                "***DIALLED NUMBERS***", 1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }

    public static void eraseRecentCallsList() {
        System.out.printf("%n%s%n%d: %s%n",
                "***ERASE RECENT CALLS***", 1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }

    public static void prepaidCredit() {
        System.out.printf("%n%s%n%d: %s%n",
                "***PREPAID CREDIT***", 1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }

    public static void showCallCost() {
        System.out.print("""
                        
                ***SHOW CALL COSTS***
                1: Last call cost
                2: All call cost
                3: Clear counters
                
                99: Back""");
        switch (enter()) {
            case 1 -> lastCallCost();
            case 2 -> allCallsCost();
            case 3 -> clearCounters();
            case 99 -> callRegister();
            default -> {
                System.out.println(display);
                showCallCost();
            }
        }
    }

    public static void lastCallCost() {
        System.out.printf("%n%s%n%d: %s%n",
                "***LAST CALL COST***", 1, "Go back");
        if (enter() == 1) {
            showCallCost();
        }
    }

    public static void allCallsCost() {
        System.out.printf("%n%s%n%d: %s%n",
                "***ALL CALLS COST***", 1, "Go back");
        if (enter() == 1) {
            showCallCost();
        }
    }

    public static void clearCounters() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CLEAR COUNTERS***", 1, "Go back");
        if (enter() == 1) {
            showCallCost();
        }
    }

    public static void callCostSetting() {
        System.out.print("""
                        
                ***CALL COST SETTINGS***
                1: Call cost limit
                2: Show cost in
                
                99: Back""");
        switch (enter()) {
            case 1 -> costCallLimit();
            case 2 -> showCostIn();
            case 99 -> callRegister();
            default -> {
                System.out.println(display);
                callCostSetting();
            }
        }
    }

    public static void costCallLimit() {
        System.out.printf("%n%s%n%d: %s%n",
                "***COST CALL LIMIT***", 1, "Go back");
        if (enter() == 1) {
            callCostSetting();
        }
    }

    public static void showCostIn() {
        System.out.printf("%n%s%n%d: %s%n",
                "***SHOW COST IN***", 1, "Go back");
        if (enter() == 1) {
            callCostSetting();
        }
    }

    public static void showCallDuration() {
        System.out.print("""
                ***SHOW CALL DURATION***
                1: Last call duration
                2: All calls duration
                3: Received call duration
                4: Dialled call duration
                5: Clear Timers
                
                99: Back""");
        switch (enter()) {
            case 1 -> lastCallDuration();
            case 2 -> allCallsDuration();
            case 3 -> receivedCallsDuration();
            case 4 -> dialledCallsDuration();
            case 5 -> callTimers();
            case 99 -> callRegister();
            default -> {
                System.out.println(display);
                showCallDuration();
            }
        }
    }

    public static void lastCallDuration() {
        System.out.printf("%n%s%n%d: %s%n",
                "***LAST CALL DURATION***", 1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }

    public static void allCallsDuration() {
        System.out.printf("%n%s%n%d: %s%n",
                "***ALL CALL DURATION***", 1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }

    public static void receivedCallsDuration() {
        System.out.printf("%n%s%n%d: %s%n",
                "***RECEIVED CALLS DURATION***", 1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }

    public static void dialledCallsDuration() {
        System.out.printf("%n%s%n%d: %s%n",
                "***DIALLED CALL DURATION***", 1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }

    public static void callTimers() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CALL TIMERS***", 1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }
}
