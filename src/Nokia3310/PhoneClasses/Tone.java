package Nokia3310.PhoneClasses;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.*;

public class Tone {
    public static void tone() {
        System.out.println("""
                
                ☆꧁  𝓣𝓞𝓝𝓔𝓢  ꧂☆
                1: 𝓡𝓲𝓷𝓰𝓲𝓷𝓰 𝓽𝓸𝓷𝓮
                2, 𝓡𝓲𝓷𝓰𝓲𝓷𝓰 𝓿𝓸𝓵𝓾𝓶𝓮
                3: 𝓘𝓷𝓬𝓸𝓶𝓲𝓷𝓰 𝓬𝓪𝓵𝓵 𝓪𝓵𝓮𝓻𝓽
                4: 𝓒𝓸𝓶𝓹𝓸𝓼𝓮𝓻
                5: 𝓜𝓮𝓼𝓼𝓪𝓰𝓮 𝓪𝓵𝓮𝓻𝓽 𝓽𝓸𝓷𝓮
                6: 𝓚𝓮𝔂𝓹𝓪𝓭 𝓽𝓸𝓷𝓮𝓼
                7: 𝓦𝓪𝓻𝓷𝓲𝓷𝓰 𝓪𝓷𝓭 𝓰𝓪𝓶𝓮 𝓽𝓸𝓷𝓮𝓼
                8: 𝓥𝓲𝓫𝓻𝓪𝓽𝓲𝓷𝓰 𝓪𝓵𝓮𝓻𝓽
                9: 𝓢𝓬𝓻𝓮𝓮𝓷 𝓢𝓪𝓿𝓮𝓻
                
                99: 𝓑𝓪𝓬𝓴""");
        switch (enter()) {
            case 1 -> ringingTone();
            case 2 -> ringingVolume();
            case 3 -> incomingCallAlert();
            case 4 -> composer();
            case 5 -> messageAlertTones();
            case 6 -> keypadTones();
            case 7 -> warningAndGameTones();
            case 8 -> vibratingAlert();
            case 9 -> screenSaver();
            case 99 -> menu();
            default -> {
                System.out.println(DISPLAY);
                tone();
            }
        }
    }
    public static void ringingTone() {
        System.out.printf("%n%s%n%d:%s%n",
                "***RINGING TONE***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }

    public static void ringingVolume() {
        System.out.printf("%n%s%n%d:%s%n",
                "***RINGING VOLUME***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }

    public static void incomingCallAlert() {
        System.out.printf("%n%s%n%d:%s%n",
                "***INCOMING CALL ALERT***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }

    public static void composer() {
        System.out.printf("%n%s%n%d:%s%n",
                "***COMPOSER***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }

    public static void messageAlertTones() {
        System.out.printf("%n%s%n%d:%s%n",
                "***MESSAGE ALERT TONES***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }

    public static void keypadTones() {
        System.out.printf("%n%s%n%d:%s%n",
                "***KEYPAD TONES***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }

    public static void warningAndGameTones() {
        System.out.printf("%n%s%n%d:%s%n",
                "***WARNING AND GAME TONES***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }

    public static void vibratingAlert() {
        System.out.printf("%n%s%n%d:%s%n",
                "***VIBRATING ALERT***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }

    public static void screenSaver() {
        System.out.printf("%n%s%n%d:%s%n",
                "***SCREEN SAVER***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            tone();
        }
    }
}
