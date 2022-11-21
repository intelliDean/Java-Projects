package Nokia3310.PhoneClasses;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.*;

public class Settings {
    public static void settings() {
        System.out.println("""
                
                ***SETTINGS***
                1: Call settings 💕
                2: Phone settings 💕
                3: Security settings 💕
                4: Restore factory settings
                
                99: Back""");
        switch (enter()) {
            case 1 ->  callSetting();
            case 2 ->  phoneSetting();
            case 3 ->  securitySettings();
            case 4 ->  restoreFactorySettings();
            case 99 -> menu();
            default -> {
                System.out.println(DISPLAY);
                settings();
            }
        }
    }
    public static void restoreFactorySettings() {
        System.out.println("""
                
                ***RESTORE FACTORY SETTINGS***
                1: Back""");
        if (enter() == 1) {
            settings();
        }
    }

    public static void securitySettings() {
        System.out.println("""
                
                ***SECURITY SETTINGS***
                1: PIN code settings
                2: Call barring service
                3: Fixed dialing
                4: Closed user group
                5: Phone security
                6: Change access codes
                
                99: Back""");
        switch (enter()) {
            case 1 -> pINCodeSetting();
            case 2 -> callBarringService();
            case 3 -> fixedDialing();
            case 4 -> closedUserGroup();
            case 5 -> phoneSecurity();
            case 6 -> changeAccessCode();
            case 99 -> settings();
            default -> {
                System.out.println(DISPLAY);
                securitySettings();
            }
        }
    }

    public static void pINCodeSetting() {
        System.out.printf("%n%s%n%d: %s%n",
                "***PIN CODE SETTING***", 1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }

    public static void callBarringService() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CALL BARRING SERVICE***", 1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }

    public static void fixedDialing() {
        System.out.printf("%n%s%n%d: %s%n",
                "***FIXED DIALING***", 1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }

    public static void closedUserGroup() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CLOSED USER GROUP***", 1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }

    public static void phoneSecurity() {
        System.out.printf("%n%s%n%d: %s%n",
                "***PHONE SECURITY***", 1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }

    public static void changeAccessCode() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CHANGE ACCESS CODE***", 1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }

    public static void phoneSetting() {
        System.out.print("""
                
                ***PHONE SETTING***
                1: Language
                2: Cell info display
                3: Welcome note
                4: Network selection
                5: Lights
                6: Confirm SIM service actions
                
                99: Back""");
        switch (enter()) {
            case 1 -> language();
            case 2 -> cellInfoDisplay();
            case 3 -> welcomeNote();
            case 4 -> networkSelection();
            case 5 -> lights();
            case 6 -> confirmSIMServiceAction();
            case 99 -> settings();
            default -> {
                System.out.println(DISPLAY);
                phoneSetting();
            }
        }
    }

    public static void language() {
        System.out.printf("%n%s%n%d: %s%n",
                "***LANGUAGE***", 1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }

    public static void cellInfoDisplay() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CELL INFO DISPLAY***", 1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }

    public static void welcomeNote() {
        System.out.printf("%n%s%n%d: %s%n",
                "***WELCOME NOTE***", 1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }

    public static void networkSelection() {
        System.out.printf("%n%s%n%d: %s%n",
                "***NETWORK SELECTION***", 1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }

    public static void lights() {
        System.out.printf("%n%s%n%d: %s%n",
                "***LIGHT***", 1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }

    public static void confirmSIMServiceAction() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CONFIRM SIM SERVICE ACTION***", 1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }

    public static void callSetting() {
        System.out.print("""
                
                ***CALL SETTING***
                1: Automatic redial
                2: Speed dialing
                3: Call waiting options
                4: Own number sending
                5: Phone line in use
                6: Automatic answer
                
                99: Back""");
        switch (enter()) {
            case 1 -> automaticRedial();
            case 2 -> speedDialing();
            case 3 -> callWaitingOptions();
            case 4 -> ownNumberSending();
            case 5 -> phoneLineInUse();
            case 6 -> automaticAnswer();
            case 99 -> settings();
            default -> {
                System.out.println(DISPLAY);
                callSetting();
            }
        }
    }

    public static void automaticRedial() {
        System.out.printf("%n%s%n%d: %s%n",
                "***AUTOMATIC REDIALING***", 1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }

    public static void speedDialing() {
        System.out.printf("%n%s%n%d: %s%n",
                "***SPEED DIALING***", 1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }

    public static void callWaitingOptions() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CALL WAITING OPTIONS***", 1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }

    public static void ownNumberSending() {
        System.out.printf("%n%s%n%d: %s%n",
                "***OWN NUMBER SENDING***", 1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }

    public static void phoneLineInUse() {
        System.out.printf("%n%s%n%d: %s%n",
                "***PHONE LINE IN USE***", 1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }

    public static void automaticAnswer() {
        System.out.printf("%n%s%n%d: %s%n",
                "***AUTOMATIC ANSWER***", 1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }
}
