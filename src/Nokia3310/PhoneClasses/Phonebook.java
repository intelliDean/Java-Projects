package Nokia3310.PhoneClasses;

import java.util.Scanner;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.display;
import static Nokia3310.PhoneDriver.enter;

public class Phonebook {
    public static void phone() {
        System.out.print("""
                
                ***PHONE BOOK***
                1: Search
                2: Service Numbers
                3: Add contact
                4: Erase
                5: Edit
                6: Assign tone
                7: Send b.card
                8: Options 💕
                9: Speed dials
                10: Voice tags
                
                99: Back""");
        switch (enter()) {
            case 1 -> search();
            case 2 -> serviceNumbers();
            case 3 -> updateContact();
            case 4 -> erase();
            case 5 -> edit();
            case 6 -> assignTone();
            case 7 -> sendBcard();
            case 8 -> options();
            case 9 -> speedDials();
            case 10 -> voiceTags();
            case 99 -> menu();
            default -> {
                System.out.println(display);
                phone();
            }
        }
    }
    public static void search() {
        System.out.printf("%n%s%n%d: %s%n",
                "***SEARCH***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            phone();
        }
    }
    public static void serviceNumbers() {
        System.out.printf("%n%s%n%d: %s%n",
                "***SERVICE NUMBERS***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            phone();
        }
    }
    public static void updateContact() {
        System.out.print("""
                        
                ***ADD NAME***
                1: Add Number
                2: 𝓑𝓪𝓬𝓴""");
        switch (enter()) {
            case 1 -> addContact();
            case 2 -> phone();
        }
    }
    public static void addContact() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nᴇɴᴛᴇʀ ɴᴀᴍᴇ");
        String name = input.nextLine();

        System.out.println("\nᴇɴᴛᴇʀ ɴᴜᴍʙᴇʀ");
        String number = input.nextLine();

        System.out.printf("%n%s%n 🧑 %s%n 📞 %s%n",
                "ᴄᴏɴᴛᴀᴄᴛ ꜱᴀᴠᴇᴅ ꜱᴜᴄᴄᴇꜱꜱꜰᴜʟʟʏ!",
                name, number);
        updateContact();
    }
    public static void erase() {
        System.out.printf("%n%s%n%d: %s%n",
                "***ERASE***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            phone();
        }
    }
    public static void edit() {
        System.out.printf("%n%s%n%d: %s%n",
                "***EDIT***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            phone();
        }
    }
    public static void assignTone() {
        System.out.printf("%n%s%n%d: %s%n",
                "***ASSIGN TONE***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            phone();
        }
    }
    public static void sendBcard() {
        System.out.printf("%n%s%n%d: %s%n",
                "***SEND BCARD***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            phone();
        }
    }
    public static void options() {
        System.out.print("""
                        
                ***OPTIONS***
                1: Type of view
                2: Memory status
                
                99: 𝓑𝓪𝓬𝓴""");
        switch (enter()) {
            case 1 -> typeOfView();
            case 2 -> memoryStatus();
            case 99 -> phone();
            default -> {
                System.out.printf("%n%s%n", display);
                menu();
            }
        }
    }
    public static void typeOfView() {
        System.out.printf("%n%s%n%d: %s%n",
                "***TYPE OF VIEW***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            options();
        }
    }

    public static void memoryStatus() {
        System.out.printf("%n%s%n%d: %s%n",
                "***MEMORY STATUS***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            options();
        }
    }
    public static void speedDials() {
        System.out.printf("%n%s%n%d: %s%n",
                "***SPEED DIALS***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            phone();
        }
    }
    public static void voiceTags() {
        System.out.printf("%n%s%n%d: %s%n",
                "***VOICE TAGS***", 1, "𝓑𝓪𝓬𝓴");
        if (enter() == 1) {
            phone();
        }
    }
}
