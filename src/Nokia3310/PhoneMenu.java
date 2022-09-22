package Nokia3310;

import java.util.Scanner;

public class PhoneMenu {
    static Scanner input = new Scanner(System.in);
    static String display = "No information to display";
        public static void real(){
        System.out.printf("%n%34s%n%s%n", "WELCOME TO DEAN'S PHONE MENU",
                "Press 1 to view menu or any number to exit");
        int start = input.nextInt();
        if (start == 1) {
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n",
                "***PHONE MENU***", 1, "📗 Phonebook 🔂", 2, "💌 Message 🔂", 3, "💬 Chat",
                4, "☎️Call Register 🔂", 5, "🎵 Tones 🔂", 6, "⚙️Settings 🔂", 7,
                "↪️Call Diverts", 8, "🎮 Games",9 , "🧮 Calculator", 10, "🎗️ Reminders",
                11, "🕐 Clock 🔂", 12, "🌈 Profile", 13, "🈂️ SIM Service");
        switch (enter()) {
            case 1-> {
                phonebook();
            }
            case 2-> {
                message();
            }
            case 3-> {
                chat();
            }
            case 4-> {
                callRegister();
            }
            case 5-> {
                tone();
            }
            case 6-> {
                settings();
            }
            case 7-> {
                callDivert();
            }
            case 8-> {
                games();
            }
            case 9-> {
                calculator();
            }
            case 10-> {
                reminders();
            }
            case 11-> {
                clock();
            }
            case 12-> {
                profile();
            }
            case 13-> {
                simService();
            }
            default -> {
                System.out.printf("%n%s%n", display);
                menu();
            }
        }
    }
}
    public static int enter(){
        System.out.printf("%nSelect Option%n");
        return input.nextInt();
    }
    public static void chat(){
        System.out.printf("%n%s%n%d:%s%n", "***CHAT***",1, "Back");
        if (enter() == 1) {
            menu();
        }
    }
    public static void tone(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%n%d:%s%n",
                "***TONES***", 1, "Ringing tone", 2, "Ringing volume",
                3, " Incoming call alert", 4, "Composer", 5,
                "Message alert tone", 6, "Keypad tones", 7, "Warning and game tones",
                8, "Vibrating alert", 9, "Screen Saver", 99, "Go back");
        switch (enter()) {
            case 1-> {
                ringingTone();
            }
            case 2-> {
                ringingVolume();
            }
            case 3-> {
                incomingCallAlert();
            }
            case 4-> {
                composer();
            }
            case 5-> {
                messageAlertTones();
            }
            case 6-> {
                keypadTones();
            }
            case 7-> {
                warningAndGameTones();
            }
            case 8-> {
                vibratingAlert();
            }
            case 9-> {
                screenSaver();
            }
            case 99-> {
                menu();
            }
            default -> {
                System.out.println(display);
                tone();
            }
        }
    }
    public static void ringingTone(){
        System.out.printf("%n%s%n%d:%s%n",
                "***RINGING TONE***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }
    public static void ringingVolume(){
        System.out.printf("%n%s%n%d:%s%n",
                "***RINGING VOLUME***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }
    public static void incomingCallAlert(){
        System.out.printf("%n%s%n%d:%s%n",
                "***INCOMING CALL ALERT***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }
    public static void composer(){
        System.out.printf("%n%s%n%d:%s%n",
                "***COMPOSER***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }
    public static void messageAlertTones(){
        System.out.printf("%n%s%n%d:%s%n",
                "***MESSAGE ALERT TONES***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }
    public static void keypadTones(){
        System.out.printf("%n%s%n%d:%s%n",
                "***KEYPAD TONES***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }
    public static void warningAndGameTones(){
        System.out.printf("%n%s%n%d:%s%n",
                "***WARNING AND GAME TONES***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }
    public static void vibratingAlert(){
        System.out.printf("%n%s%n%d:%s%n",
                "***VIBRATING ALERT***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }
    public static void screenSaver(){
        System.out.printf("%n%s%n%d:%s%n",
                "***SCREEN SAVER***",1, "Go back");
        if (enter() == 1) {
            tone();
        }
    }

    public static void phonebook(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%n%d: %s%n", "***PHONE BOOK***",
                1, "Search", 2, "Service Numbers", 3, "Add contact", 4, "Erase",
                5, "Edit", 6, "Assign tone", 7, "Send b.card", 8, "Options 💕",
                9, "Speed dials", 10, "Voice tags", 99, "Go back");
        switch(enter()) {
            case 1-> {
                search();
            }
            case 2-> {
                serviceNumbers();
            }
            case 3-> {
                addName();
            }
            case 4-> {
                erase();
            }
            case 5-> {
                edit();
            }
            case 6-> {
                assignTone();
            }
            case 7-> {
                sendBcard();
            }
            case 8 -> {
                options();
            }
            case 9-> {
                speedDials();
            }
            case 10-> {
                voiceTags();
            }
            case 99-> {
                menu();
            }
            default -> {
                System.out.println(display);
                phonebook();
            }
        }
    }
    public static void search(){
        System.out.printf("%n%s%n%d: %s%n",
                "***SEARCH***",1, "Go back");
        if (enter() == 1) {
            phonebook();
        }
    }
    public static void serviceNumbers(){
        System.out.printf("%n%s%n%d: %s%n",
                "***SERVICE NUMBERS***",1, "Go back");
        if (enter() == 1) {
            phonebook();
        }
    }
    public static void addName(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n",
                "***ADD NAME***",1, "Add Number", 2, "Go back");
        switch (enter()) {
            case 1 -> {
            System.out.println("\nEnter name");
            String name = input.nextLine();
            System.out.println("\nEnter number");
            String number = input.nextLine();

            System.out.printf("%n%s%n 🧑 %s%n 📞 %s%n","Contact Saved successfully!", name, number);
            addName();
            }
            case 2 -> {
                phonebook();
            }
        }
    }
    public static void erase(){
        System.out.printf("%n%s%n%d: %s%n",
                "***ERASE***",1, "Go back");
        if (enter() == 1) {
            phonebook();
        }
    }
    public static void edit(){
        System.out.printf("%n%s%n%d: %s%n",
                "***EDIT***",1, "Go back");
        if (enter() == 1) {
            phonebook();
        }
    }
    public static void sendBcard(){
        System.out.printf("%n%s%n%d: %s%n",
                "***SEND BCARD***",1, "Go back");
        if (enter() == 1) {
            phonebook();
        }
    }

    public static void assignTone(){
        System.out.printf("%n%s%n%d: %s%n",
                "***ASSIGN TONE***",1, "Back");
        if (enter() == 1) {
            phonebook();
        }
    }
    public static void options() {
     System.out.printf("%n%s%n%d:%s%n%d:%s%n%n%d:%s%n",
             "***OPTIONS***", 1, "Type of view",
             2, "Memory status", 99, "Back");
         switch (enter()) {
              case 1 -> {
                        typeOfView();
                }
              case 2 -> {
                        memoryStatus();
                }
              case 99 -> {
                        phonebook();
                }
              default -> {
                        System.out.printf("%n%s%n", display);
                        menu();
                }
              }
    }
    public static void typeOfView(){
        System.out.printf("%n%s%n%d: %s%n",
                "***TYPE OF VIEW***",1, "Go back");
        if (enter() == 1) {
            options();
        }
    }
    public static void memoryStatus(){
        System.out.printf("%n%s%n%d: %s%n",
                "***MEMORY STATUS***",1, "Go back");
        if (enter() == 1) {
            options();
        }
    }

    public static void speedDials(){
        System.out.printf("%n%s%n%d: %s%n",
                "***SPEED DIALS***",1, "Go back");
        if (enter() == 1) {
            phonebook();
        }
    }
    public static void voiceTags(){
        System.out.printf("%n%s%n%d: %s%n",
                "***VOICE TAGS***",1, "Go back");
        if (enter() == 1) {
            phonebook();
        }
    }
    public static void message(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%n%d: %s%n", "***MESSAGES***",
                1, "Write Messages", 2, "Inbox", 3, "Outbox", 4, "Picture Messages",
                5, "Templates", 6, "Smileys", 7, "Message Settings 💕", 8, "Info Service",
                9, "Voice mailbox Number", 10, "Service command editor", 99, "Go back");
        switch (enter()) {
            case 1-> {
                writeMessages();
            }
            case 2-> {
                inbox();
            }
            case 3-> {
                outbox();
            }
            case 4-> {
                pictureMessages();
            }
            case 5-> {
                templates();
            }
            case 6-> {
                smileys();
            }
            case 7-> {
                messageSetting();
            }
            case 8-> {
                infoService();
            }
            case 9-> {
                voiceMailboxNumber();
            }
            case 10-> {
                serviceCommandEditor();
            }
            case 99-> {
                menu();
            }
            default -> {
                System.out.println(display);
               message();
            }
        }
    }
    public static void writeMessages(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n",
                "***WRITE MESSAGE***",1, "Send Message", 2, "Back");
        switch (enter()) {
            case 1-> {
                System.out.println("\nEnter number");
                String number = input.nextLine();
                System.out.println("\nWrite Message");
                String text = input.nextLine();

                System.out.printf("%nMessage sent to %s successfully%n", number);
                writeMessages();
            }
            case 2->{
                message();
            }
        }
    }
    public static void inbox(){
        System.out.printf("%n%s%n%d: %s%n",
                "***INBOX***",1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void outbox(){
        System.out.printf("%n%s%n%d: %s%n",
                "***OUTBOX***",1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void pictureMessages(){
        System.out.printf("%n%s%n%d: %s%n",
                "***PICTURE MESSAGES***",1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void templates(){
        System.out.printf("%n%s%n%d: %s%n",
                "***TEMPLATES***",1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void smileys(){
        System.out.printf("%n%s%n%d: %s%n",
                "***SMILEYS***",1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
    public static void infoService(){
        System.out.printf("%n%s%n%d: %s%n",
                "***INFO SERVICE***",1, "Go back");
        if (enter() == 1) {
            message();
        }
    }
        public static void voiceMailboxNumber(){
        System.out.printf("%n%s%n%d: %s%n",
                "***VOICE MAILBOX NUMBER***",1, "Go back");
        if (enter() == 1) {
            message();
        }
    }

    public static void serviceCommandEditor (){
        System.out.printf("%n%s%n%d: %s%n",
                "***SERVICE COMMAND EDITOR***",1, "Go back");
        if (enter() == 1) {
            message();
        }
    }

    //message settings method
    public static void messageSetting(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%n%d: %s%n",
                "***MESSAGE SETTINGS***", 1, "Set 1 💕",
                2, "Common 💕", 99, "Go back");
        String display = "No information to display";
        switch (enter()) {
            case 1-> {
                set1();
            }
            case 2-> {
                common();
            }
            case 99-> {
                message();
            }
            default -> {
                System.out.println(display);
                menu();
            }
        }

    }
    public static void common () {
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%n%d: %s%n",
                "***COMMON***", 1, "Delivery Report", 2, "Reply Via Same Centre",
                3, "Character Support", 99, "Go back");
        switch (enter()) {
            case 1 -> {
                deliveryReport();
            }
            case 2 -> {
                replyViaSameCentre();
            }
            case 3 -> {
                characterSupport();
            }
            case 99 -> {
                messageSetting();
            }
            default -> {
                System.out.println(display);
                menu();
            }
        }
    }
    public static void replyViaSameCentre(){
        System.out.printf("%n%s%n%d: %s%n",
                "***REPLY VIA SAME CENTRE***",1, "Go back");
        if (enter() == 1) {
            common();
        }
    }
    public static void deliveryReport(){
        System.out.printf("%n%s%n%d: %s%n",
                "***DELIVERY REPORT***",1, "Go back");
        if (enter() == 1) {
            common();
        }
    }
    public static void characterSupport(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CHARACTER SUPPORT***",1, "Go back");
        if (enter() == 1) {
            common();
        }
    }

    public static void set1() {
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%n%d: %s%n",
                "***SET 1***", 1, "Message centre number",
                2, "Message sent as", 3, "Message validity", 99, "Go back");
        switch (enter()) {
            case 1 -> {
                messageCentreNumber();
            }
            case 2 -> {
                messageSentAs();
            }
            case 3 -> {
                messageValidity();
            }
            case 99 -> {
                messageSetting();
            }
            default -> {
                System.out.println(display);
                menu();
            }
        }
    }
    public static void messageCentreNumber(){
        System.out.printf("%n%s%n%d: %s%n",
                "***MESSAGE CENTRE NUMBER***",1, "Go back");
        if (enter() == 1) {
            set1();
        }
    }
    public static void messageSentAs(){
        System.out.printf("%n%s%n%d: %s%n",
                "***MESSAGE SENT AS***",1, "Go back");
        if (enter() == 1) {
            set1();
        }
    }
    public static void messageValidity(){
        System.out.printf("%n%s%n%d: %s%n",
                "***MESSAGE VALIDITY***",1, "Go back");
        if (enter() == 1) {
            set1();
        }
    }
    public static void callRegister(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%d: %s%n%n%d: %s%n", "***CALL REGISTER***",
                1, " Missed calls", 2, "Received calls", 3, "Dialled numbers",
                4, "Erase recent call lists", 5, "Show call durations 💕",
                6, "Show call cost 💕", 7, "Call cost settings 💕",
                8, "Prepaid credits", 99, "Go back");
                switch (enter()) {
        case 1-> {
            missedCalls();
        }
        case 2-> {
            receivedCalls();
        }
        case 3-> {
            dialledNumbers();
        }
        case 4-> {
            eraseRecentCallsList();
        }
        case 5->{
            showCallDuration();
        }
        case 6-> {
            showCallCost();
        }
        case 7-> {
            callCostSetting();
        }
        case 8-> {
            prepaidCredit();
        }
        case 99-> {
            menu();
        }
        default -> {
            System.out.println(display);
            callRegister();
        }
    }
    }
    public static void missedCalls(){
        System.out.printf("%n%s%n%d: %s%n",
                "***MISSED CALLS***",1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }
    //received calls method
    public static void receivedCalls(){
        System.out.printf("%n%s%n%d: %s%n",
                "***RECEIVED CALLS***",1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }
    public static void dialledNumbers(){
        System.out.printf("%n%s%n%d: %s%n",
                "***DIALLED NUMBERS***",1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }
    public static void eraseRecentCallsList(){
        System.out.printf("%n%s%n%d: %s%n",
                "***ERASE RECENT CALLS***",1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }
    public static void prepaidCredit(){
        System.out.printf("%n%s%n%d: %s%n",
                "***PREPAID CREDIT***",1, "Go back");
        if (enter() == 1) {
            callRegister();
        }
    }
    public static void showCallCost(){
     System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%n%d: %s%n",
             "***SHOW CALL COSTS***", 1, " Last call cost",
             2, "All call cost", 3, "Clear counters", 99, "Back");
    switch (enter()) {
        case 1-> {
            lastCallCost();
        }
        case 2-> {
            allCallsCost();
        }
        case 3-> {
            clearCounters();
        }
        case 99->{
            callRegister();
        }
        default -> {
            System.out.println(display);
            showCallCost();
        }
    }
}
    public static void lastCallCost(){
        System.out.printf("%n%s%n%d: %s%n",
                "***LAST CALL COST***",1, "Go back");
        if (enter() == 1) {
            showCallCost();
        }
    }
    public static void allCallsCost(){
        System.out.printf("%n%s%n%d: %s%n",
                "***ALL CALLS COST***",1, "Go back");
        if (enter() == 1) {
            showCallCost();
        }
    }
    public static void clearCounters(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CLEAR COUNTERS***",1, "Go back");
        if (enter() == 1) {
            showCallCost();
        }
    }
    public static void callCostSetting(){
    System.out.printf("%n%s%n%d: %s%n%d: %s%n%n%d: %s%n",
            "***CALL COST SETTINGS***", 1, "Call cost limit",
            2, "Show cost in", 99, "Go back");
    switch (enter()) {
        case 1-> {
            costCallLimit();
        }
        case 2->{
            showCostIn();
        }
        case 99-> {
            callRegister();
        }
        default -> {
            System.out.println(display);
            callCostSetting();
        }
    }
    }
    public static void costCallLimit(){
        System.out.printf("%n%s%n%d: %s%n",
                "***COST CALL LIMIT***",1, "Go back");
        if (enter() == 1) {
            callCostSetting();
        }
    }
    public static void showCostIn(){
        System.out.printf("%n%s%n%d: %s%n",
                "***SHOW COST IN***",1, "Go back");
        if (enter() == 1) {
            callCostSetting();
        }
    }
    public static void showCallDuration(){
     System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%n%d: %s%n",
             "***SHOW CALL DURATION***", 1, "Last call duration",
             2, "All calls duration", 3, "Received call duration",
             4, "Dialled call duration", 5, "Clear Timers", 99, "Go back");

     switch (enter()) {
        case 1-> {
            lastCallDuration();
        }
        case 2-> {
            allCallsDuration();
        }
        case 3-> {
            receivedCallsDuration();
        }
        case 4-> {
            dialledCallsDuration();
        }
        case 5-> {
            callTimers();
        }
        case 99-> {
            callRegister();
        }
        default -> {
            System.out.println(display);
            showCallDuration();

        }
    }
}
    public static void lastCallDuration(){
        System.out.printf("%n%s%n%d: %s%n",
                "***LAST CALL DURATION***",1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }
    public static void allCallsDuration(){
        System.out.printf("%n%s%n%d: %s%n",
                "***ALL CALL DURATION***",1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }
    public static void receivedCallsDuration(){
        System.out.printf("%n%s%n%d: %s%n",
                "***RECEIVED CALLS DURATION***",1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }
    public static void dialledCallsDuration(){
        System.out.printf("%n%s%n%d: %s%n",
                "***DIALLED CALL DURATION***",1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }
    public static void callTimers(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CALL TIMERS***",1, "Go back");
        if (enter() == 1) {
            showCallDuration();
        }
    }
    //settings method
    public static void settings(){
     System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%n%d: %s%n",
             "***SETTINGS***", 1, "Call settings 💕", 2, "Phone settings 💕",
             3, "Security settings 💕", 4, "Restore factory settings", 99, "Back");
     switch (enter()) {
        case 1-> {
               callSetting();
        }
        case 2-> {
               phoneSetting();
        }
        case 3-> {
               securitySettings();
        }
        case 4-> {
                restoreFactorySettings();
        }
        case 99-> {
               menu();
        }
        default -> {
            System.out.println(display);
            settings();
        }
     }
}
    public static void restoreFactorySettings(){
        System.out.printf("%n%s%n%d: %s%n",
                "***RESTORE FACTORY SETTINGS***",1, "Back");
        if (enter() == 1) {
            settings();
        }
    }
    //security settings
    public static void securitySettings(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%n%d: %s%n", "***SECURITY SETTINGS***",
                1, "PIN code settings", 2, "Call barring service", 3,
                "Fixed dialing", 4, "Closed user group", 5, "Phone security",
                6, "Change access codes", 99, "Back");
    switch (enter()) {
        case 1-> {
            pINCodeSetting();
        }
        case 2-> {
            callBarringService();
        }
        case 3-> {
            fixedDialing();
        }
        case 4-> {
            closedUserGroup();
        }
        case 5-> {
            phoneSecurity();
        }
        case 6-> {
            changeAccessCode();
        }
        case 99-> {
            settings();
        }
        default -> {
            System.out.println(display);
            securitySettings();
        }
    }
}
    public static void pINCodeSetting(){
        System.out.printf("%n%s%n%d: %s%n",
                "***PIN CODE SETTING***",1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }
    public static void callBarringService(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CALL BARRING SERVICE***",1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }
    public static void fixedDialing(){
        System.out.printf("%n%s%n%d: %s%n",
                "***FIXED DIALING***",1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }
    public static void closedUserGroup(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CLOSED USER GROUP***",1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }
    public static void phoneSecurity(){
        System.out.printf("%n%s%n%d: %s%n",
                "***PHONE SECURITY***",1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }
    public static void changeAccessCode(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CHANGE ACCESS CODE***",1, "Go back");
        if (enter() == 1) {
            securitySettings();
        }
    }
    public static void phoneSetting(){
    System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
            "%s%n%d: %s%n%d: %s%n%n%d: %s%n", "***PHONE SETTING***",
            1, "Language", 2, "Cell info display", 3, "Welcome note",
            4, "Network selection", 5, "Lights",
            6, "Confirm SIM service actions", 99, "Back");
        switch (enter()) {
            case 1-> {
                language();
            }
            case 2-> {
                 cellInfoDisplay();
            }
            case 3-> {
                 welcomeNote();
            }
            case 4-> {
                 networkSelection();
            }
            case 5-> {
                lights();
            }
            case 6-> {
                 confirmSIMServiceAction();
            }
            case 99-> {
                 settings();
            }
            default -> {
                 System.out.println(display);
                 phoneSetting();
            }
        }
    }
    public static void language(){
        System.out.printf("%n%s%n%d: %s%n",
                "***LANGUAGE***",1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }
    public static void cellInfoDisplay(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CELL INFO DISPLAY***",1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }
    public static void welcomeNote(){
        System.out.printf("%n%s%n%d: %s%n",
                "***WELCOME NOTE***",1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }
    public static void networkSelection(){
        System.out.printf("%n%s%n%d: %s%n",
                "***NETWORK SELECTION***",1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }
    public static void lights(){
        System.out.printf("%n%s%n%d: %s%n",
                "***LIGHT***",1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }
    public static void confirmSIMServiceAction(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CONFIRM SIM SERVICE ACTION***",1, "Go back");
        if (enter() == 1) {
            phoneSetting();
        }
    }
    public static void callSetting(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%d: %s%n%n%d: %s%n", "***CALL SETTING***",
                1, "Automatic redial", 2, "Speed dialing",
                3, "Call waiting options", 4, "Own number sending",
                5, "Phone line in use", 6, "Automatic answer", 99, "Back");
        switch (enter()) {
             case 1-> {
                 automaticRedial();
             }
             case 2-> {
                speedDialing();
             }
             case 3-> {
                callWaitingOptions();
                 }
             case 4-> {
                ownNumberSending();
             }
             case 5-> {
                phoneLineInUse();
             }
             case 6-> {
                automaticAnswer();
             }
             case 99-> {
                settings();
             }
             default -> {
                System.out.println(display);
                callSetting();
            }
        }
    }
public static void automaticRedial(){
    System.out.printf("%n%s%n%d: %s%n",
            "***AUTOMATIC REDIALING***",1, "Go back");
    if (enter() == 1) {
          callSetting();
    }
}
    public static void speedDialing(){
        System.out.printf("%n%s%n%d: %s%n",
                "***SPEED DIALING***",1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }
    public static void callWaitingOptions(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CALL WAITING OPTIONS***",1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }
    public static void ownNumberSending(){
        System.out.printf("%n%s%n%d: %s%n",
                "***OWN NUMBER SENDING***",1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }
    public static void phoneLineInUse(){
        System.out.printf("%n%s%n%d: %s%n",
                "***PHONE LINE IN USE***",1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }
    public static void automaticAnswer(){
        System.out.printf("%n%s%n%d: %s%n",
                "***AUTOMATIC ANSWER***",1, "Go back");
        if (enter() == 1) {
            callSetting();
        }
    }
    //clock settings
    public static void clock(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%d: %s%n%d: %s%n%n%d: %s%n",
                "***CLOCK***", 1, "Alarm clock", 2, "Clock settings",
                3, "Date settings", 4, "Stopwatch", 5, "Countdown timer",
                6, "Auto update of time and date", 99, "Go back");
        switch (enter()) {
            case 1-> {
                alarmClock();
            }
            case 2-> {
                clockSetting();
            }
            case 3-> {
                dateSetting();
            }
            case 4-> {
                stopwatch();
            }
            case 5-> {
                countdownTimer();
            }
            case 6-> {
                autoUpdateOfDateAndTime();
            }
            case 99-> {
                menu();
            }
            default -> {
                System.out.println(display);
                clock();
            }
        }
    }
    public static void alarmClock(){
        System.out.printf("%n%s%n%d: %s%n",
                "***ALARM CLOCK***",1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }
    public static void clockSetting(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CLOCK SETTING***",1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }
    public static void dateSetting(){
        System.out.printf("%n%s%n%d:%s%n",
                "***DATE SETTING***",1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }
    public static void stopwatch(){
        System.out.printf("%n%s%n%d: %s%n",
                "***STOPWATCH***",1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }
    public static void countdownTimer(){
        System.out.printf("%n%s%n%d: %s%n",
                "***COUNTDOWN TIMER***",1, "Go back");
        if (enter() == 1) {
            clock();
        }
    }
    public static void autoUpdateOfDateAndTime(){
        System.out.printf("%n%s%n%d: %s%n",
                "***AUTO UPDATE OF DATE AND TIME***",1, "Back");
        if (enter() == 1) {
            clock();
        }
    }
    public static void menu(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: " +
                "%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d:" +
                " %s%n%d: %s%n%d: %s%n%n%d: %s%n","***PHONE MENU***",
                1, "Phonebook 💕", 2, "Message 💕", 3, "Chat",
                4, "Call Register 💕", 5, "Tones 💕", 6, "Settings 💕",
                7, "Call Diverts", 8, "Games",9, "Calculator",
                10, "Reminders", 11, "Clock 💕", 12, "Profile",
                13, "SIM Service", 99, "Exit");
        switch (enter()){
            case 1-> {
                phonebook();
            }
            case 2-> {
                message();
            }
            case 3-> {
            }
            case 4-> {
                callRegister();
            }
            case 5-> {
                tone();
            }
            case 6-> {
                settings();
            }
            case 7-> {
                callDivert();
            }
            case 8-> {
                games();
            }
            case 9-> {
                calculator();
            }
            case 10-> {
                reminders();
            }
            case 11-> {
                clock();
            }
            case 12-> {
                profile();
            }
            case 13-> {
                simService();
            }
            default -> {
                break;
            }
        }
    }
    public static void callDivert(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CALL DIVERT***",1, "Go back");
        if (enter() == 1) {
            menu();
        }
    }
    public static void games() {
        System.out.printf("%n%s%n%d: %s%n",
                "***GAMES***", 1, "Back");
            if (enter() == 1) {
                menu();
            }
        }
    public static void calculator(){
        System.out.printf("%n%s%n%d: %s%n",
                "***CALCULATOR***", 1, "Go back");
        if (enter() == 1) {
            menu();
        }
    }
    public static void reminders(){
        System.out.printf("%n%s%n%d: %s%n",
                "***REMINDERS***", 1, "Go back");
        if (enter() == 1) {
            menu();
        }
    }
    public static void profile(){
        System.out.printf("%n%s%n%d: %s%n",
                "***PROFILE***",1, "Go back");
        if (enter() == 1) {
            menu();
        }
    }
    public static void simService(){
        System.out.printf("%n%s%n%d: %s%n",
                "***SIM SERVICE***",1, "Go back");
        if (enter() == 1) {
            menu();
        }
    }
}


