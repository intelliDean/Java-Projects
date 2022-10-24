package Nokia3310.PhoneClasses;

import java.util.Scanner;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.*;

public class Message {
    public static void message() {
        System.out.print("""
                
               ☆꧁ 𝓜𝓔𝓢𝓢𝓐𝓖𝓔𝓢 ꧂☆
                1: 𝓦𝓻𝓲𝓽𝓮 𝓜𝓮𝓼𝓼𝓪𝓰𝓮𝓼
                2: 𝓘𝓷𝓫𝓸𝔁
                3: 𝓞𝓾𝓽𝓫𝓸𝔁
                4: 𝓟𝓲𝓬𝓽𝓾𝓻𝓮 𝓜𝓮𝓼𝓼𝓪𝓰𝓮𝓼
                5: 𝓣𝓮𝓶𝓹𝓵𝓪𝓽𝓮𝓼
                6: 𝓢𝓶𝓲𝓵𝓮𝔂𝓼
                7: 𝓜𝓮𝓼𝓼𝓪𝓰𝓮 𝓢𝓮𝓽𝓽𝓲𝓷𝓰𝓼 💕
                8: 𝓘𝓷𝓯𝓸 𝓢𝓮𝓻𝓿𝓲𝓬𝓮",
                9: 𝓥𝓸𝓲𝓬𝓮 𝓶𝓪𝓲𝓵𝓫𝓸𝔁 𝓝𝓾𝓶𝓫𝓮𝓻
                10: 𝓢𝓮𝓻𝓿𝓲𝓬𝓮 𝓬𝓸𝓶𝓶𝓪𝓷𝓭 𝓮𝓭𝓲𝓽𝓸𝓻
                
                99: 𝓑𝓪𝓬𝓴""");
        switch (enter()) {
            case 1 -> writeMessages();
            case 2 -> inbox();
            case 3 -> outbox();
            case 4 -> pictureMessages();
            case 5 -> templates();
            case 6 -> smileys();
            case 7 -> messageSetting();
            case 8 -> infoService();
            case 9 -> voiceMailboxNumber();
            case 10 -> serviceCommandEditor();
            case 99 -> menu();
            default -> {
                System.out.println(DISPLAY);
                message();
            }
        }
    }
    public static void writeMessages() {
        System.out.print("""
                        
                ***WRITE MESSAGE***
                1: Send Message
                2: Back""");
        switch (enter()) {
            case 1 -> sendMessage();
            case 2 -> message();
        }
    }
    public static void sendMessage() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter number");
        String number = input.nextLine();
        System.out.println("\nWrite Message");
        String text = input.nextLine();

        System.out.printf(
                "%n%s%n sent to %s%n successfully%n",
                text, number);
        writeMessages();
    }
    public static void inbox() {
        System.out.printf("%n%s%n%d: %s%n",
                "***INBOX***", 1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void outbox() {
        System.out.printf("%n%s%n%d: %s%n",
                "***OUTBOX***", 1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void pictureMessages() {
        System.out.printf("%n%s%n%d: %s%n",
                "***PICTURE MESSAGES***", 1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void templates() {
        System.out.printf("%n%s%n%d: %s%n",
                "***TEMPLATES***", 1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void smileys() {
        System.out.printf("%n%s%n%d: %s%n",
                "***SMILEYS***", 1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void messageSetting() {
        System.out.print("""
                        
                ***MESSAGE SETTINGS***
                1: Set 1 💕
                2: Common 💕
                
                99: Back""");
        switch (enter()) {
            case 1 -> set1();
            case 2 -> common();
            case 99 -> message();
            default -> {
                System.out.println(DISPLAY);
                menu();
            }
        }
    }
    public static void set1() {
        System.out.print("""
                
                ***SET 1***
                1: Message centre number
                2: Message sent as
                3: Message validity
                
                99: Back""");
        switch (enter()) {
            case 1 -> messageCentreNumber();
            case 2 -> messageSentAs();
            case 3 -> messageValidity();
            case 99 -> messageSetting();
            default -> {
                System.out.println(DISPLAY);
                menu();
            }
        }
    }
    public static void messageCentreNumber() {
        System.out.printf("%n%s%n%d: %s%n",
                "***MESSAGE CENTRE NUMBER***", 1, "Go back");
        if (enter() == 1) {
            set1();
        }
    }

    public static void messageSentAs() {
        System.out.printf("%n%s%n%d: %s%n",
                "***MESSAGE SENT AS***", 1, "Go back");
        if (enter() == 1) {
            set1();
        }
    }

    public static void messageValidity() {
        System.out.printf("%n%s%n%d: %s%n",
                "***MESSAGE VALIDITY***", 1, "Go back");
        if (enter() == 1) {
            set1();
        }
    }
    public static void common() {
        System.out.print("""
                
                ***COMMON***
                1: Delivery Report
                2: Reply Via Same Centre
                3: Character Support
                
                99: Go back""");
        switch (enter()) {
            case 1 -> deliveryReport();
            case 2 -> replyViaSameCentre();
            case 3 -> characterSupport();
            case 99 -> messageSetting();
            default -> {
                System.out.println(DISPLAY);
                menu();
            }
        }
    }
    public static void deliveryReport() {
        System.out.printf("%n%s%n%d: %s%n",
                "***DELIVERY REPORT***", 1, "Go back");
        if (enter() == 1) {
            common();
        }
    }
    public static void replyViaSameCentre() {
        System.out.printf("%n%s%n%d: %s%n",
                "***REPLY VIA SAME CENTRE***", 1, "Go back");
        if (enter() == 1) {
            common();
        }
    }
    public static void characterSupport() {
        System.out.printf("%n%s%n%d: %s%n",
                "***CHARACTER SUPPORT***", 1, "Go back");
        if (enter() == 1) {
            common();
        }
    }
    public static void infoService() {
        System.out.printf("%n%s%n%d: %s%n",
                "***INFO SERVICE***", 1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void voiceMailboxNumber() {
        System.out.printf("%n%s%n%d: %s%n",
                "***VOICE MAILBOX NUMBER***", 1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void serviceCommandEditor() {
        System.out.printf("%n%s%n%d: %s%n",
                "***SERVICE COMMAND EDITOR***", 1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
}
