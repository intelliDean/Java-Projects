import java.util.Scanner;

public class PhoneMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int phoneMenu = 0;
        int phonebook = 1;
        int message = 2;
        int chat = 3;
        int callRegister = 4;
        int tones = 5;
        int settings = 6;
        int callDivert = 7;
        int games = 8;
        int calculator = 9;
        int reminders = 10;
        int clock = 11;
        int profile = 12;
        int simService = 13;
        int menu = 0;
        String display = "No information to display";
        System.out.printf("%n%34s%n%s%n", "WELCOME TO DEAN'S PHONE MENU", "Press 1 to view menu or any number to exit");
        int start = input.nextInt();
        if (start == 1) {
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n","***PHONE MENU***", 1, "Phonebook", 2, "Message", 3, "Chat", 4, "Call Register", 5, "Tones", 6, "Settings", 7, "Call Diverts", 8, "Games",9, "Calculator", 10, "Reminders", 11, "Clock", 12, "Profile", 13, "SIM Service");
        switch (enter()) {
            case 0-> {
                menu();
            }
            case 1-> {
                menu = phonebook;
                phonebook();
            }
            case 2-> {
                menu = message;
                message();
            }
            case 3-> {
                menu = chat;
                chat();
            }
            case 4-> {
                menu = callRegister;
                callRegister();
            }
            case 5-> {
                menu = tones;
                tone();
            }
            case 6-> {
                menu = settings;
                settings();
            }
            case 7-> {
                menu = callDivert;
                callDivert();
            }
            case 8-> {
                menu = games;
                games();
            }
            case 9-> {
                menu = calculator;
                calculator();
            }
            case 10-> {
                menu = reminders;
                reminders();
            }
            case 11-> {
                menu = clock;
                clock();
            }
            case 12-> {
                menu = profile;
                profile();
            }
            case 13-> {
                menu = simService;

                simService();
            }
            default -> {
                System.out.println("This is not part of the options.");
                menu();
            }
        }
    }
}




//------------------METHODS-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   //input method
    public static int enter(){
        Scanner put = new Scanner(System.in);
        System.out.printf("%nSelect Menu%n");
        return put.nextInt();
    }
    public static void chat(){
        System.out.printf("%n%s%n%d:%s%n", "***CHAT***",1, "Go back");
        int goBack = 1;
        int ch = 1;
        if (enter() == 1) {
            ch = goBack;
            menu();
        }
    }
    public static void tone(){
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***TONES***", 1, "Ringing tone", 2, "Ringing volume", 3, " Incoming call alert", 4, "Composer", 5, "Message alert tone", 6, "Keypad tones", 7, "Warning and game tones", 8, "Vibrating alert", 9, "Screen Saver", 10, "Go back");
        int ringingTone = 1;
        int ringingVolume = 2;
        int incomingCallAlert = 3;
        int composer = 4;
        int messageAlertTone = 5;
        int keypadTones = 6;
        int warningAndGameTones = 7;
        int vibratingAlert = 8;
        int screenSaver = 9;
        int goBack = 10;
        int tone = 0;
        String display = "No information to display";
        switch (enter()) {
            case 1-> {
                tone = ringingTone;
                ringingTone();
            }
            case 2-> {
                tone = ringingVolume;
                ringingVolume();
            }
            case 3-> {
                tone = incomingCallAlert;
                incomingCallAlert();
            }
            case 4-> {
                tone =composer;
                composer();
            }
            case 5-> {
                tone = messageAlertTone;
                messageAlertTones();
            }
            case 6-> {
                tone = keypadTones;
                keypadTones();
            }
            case 7-> {
                tone = warningAndGameTones;
                warningAndGameones();
            }
            case 8-> {
                tone = vibratingAlert;
                vibratingAlert();
            }
            case 9-> {
                tone = screenSaver;
                screenSaver();
            }
            case 10-> {
                tone = goBack;
                menu();
            }
            default -> {
                System.out.println(display);
            }
        }
    }
    public static void ringingTone(){
        System.out.printf("%n%s%n%d:%s%n", "***RINGING TONE***",1, "Go back");
        int goBack = 1;
        int rt = 0;
        if (enter() == 1) {
            rt = goBack;
            tone();
        }
    }
    public static void ringingVolume(){
        System.out.printf("%n%s%n%d:%s%n", "***RINGING VOLUME***",1, "Go back");
        int goBack = 1;
        int rv = 0;
        if (enter() == 1) {
            rv = goBack;
            tone();
        }
    }
    public static void incomingCallAlert(){
        System.out.printf("%n%s%n%d:%s%n", "***INCOMING CALL ALERT***",1, "Go back");
        int goBack = 1;
        int ica = 0;
        if (enter() == 1) {
            ica = goBack;
            tone();
        }
    }
    public static void composer(){
        System.out.printf("%n%s%n%d:%s%n", "***COMPOSER***",1, "Go back");
        int goBack = 1;
        int comp = 0;
        if (enter() == 1) {
            comp = goBack;
            tone();
        }
    }
    public static void messageAlertTones(){
        System.out.printf("%n%s%n%d:%s%n", "***MESSAGE ALERT TONES***",1, "Go back");
        int goBack = 1;
        int mat = 0;
        if (enter() == 1) {
            mat = goBack;
            tone();
        }
    }
    public static void keypadTones(){
        System.out.printf("%n%s%n%d:%s%n", "***KEYPAD TONES***",1, "Go back");
        int goBack = 1;
        int kt = 0;
        if (enter() == 1) {
            kt = goBack;
            tone();
        }
    }
    public static void warningAndGameones(){
        System.out.printf("%n%s%n%d:%s%n", "***WARNING AND GAME TONES***",1, "Go back");
        int goBack = 1;
        int wag = 0;
        if (enter() == 1) {
            wag = goBack;
            tone();
        }
    }
    public static void vibratingAlert(){
        System.out.printf("%n%s%n%d:%s%n", "***VIBRATING ALERT***",1, "Go back");
        int goBack = 1;
        int va = 0;
        if (enter() == 1) {
            va = goBack;
            tone();
        }
    }
    public static void screenSaver(){
        System.out.printf("%n%s%n%d:%s%n", "***SCREEN SAVER***",1, "Go back");
        int goBack = 1;
        int ss = 0;
        if (enter() == 1) {
            ss = goBack;
            tone();
        }
    }

    public static void phonebook(){
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***PHONE BOOK***", 1, "Search", 2, "Service Numbers", 3, "Add name", 4, "Erase", 5, "Edit", 6, "Assign tone", 7, "Send b.card", 8, "Options", 9, "Speed dials", 10, "Voice tags", 11, "Go back");
        Scanner input = new Scanner(System.in);
        int search = 1;
        int serviceNumbers = 2;
        int addName = 3;
        int erase = 4;
        int edit = 5;
        int assignTone = 6;
        int sendBcard = 7;
        int options = 8;
        int speedDials = 9;
        int voiceTags = 10;
        int goBack = 11;
        int book = 0;
        String display = "No information to display";
        switch(enter()) {
            case 1-> {
                book = search;
                search();
            }
            case 2-> {
                book = serviceNumbers;
                serviceNumbers();
            }
            case 3-> {
                book = addName;
                addName();
            }
            case 4-> {
                book = erase;
                erase();
            }
            case 5-> {
                book = edit;
                edit();
            }
            case 6-> {
                book = assignTone;
                assignTone();
            }
            case 7-> {
                book = sendBcard;
                sendBcard();
            }
            case 8 -> {
                book = options;
                options();
            }
            case 9-> {
                book = speedDials;
                speedDials();
            }
            case 10-> {
                book = voiceTags;
                voiceTags();
            }
            case 11-> {
                book = goBack;
                menu();
            }
            default -> {
                System.out.println("This is not part of the options");
            }
        }
    }
    public static void search(){
        System.out.printf("%n%s%n%d:%s%n", "***SEARCH***",1, "Go back");
        int goBack = 1;
        int src = 0;
        if (enter() == 1) {
            src = goBack;
            phonebook();
        }
    }
    public static void serviceNumbers(){
        System.out.printf("%n%s%n%d:%s%n", "***SERVICE NUMBERS***",1, "Go back");
        int goBack = 1;
        int snm = 0;
        if (enter() == 1) {
            snm = goBack;
            phonebook();
        }
    }
    public static void addName(){
        System.out.printf("%n%s%n%d:%s%n", "***ADD NAME***",1, "Go back");
        int goBack = 1;
        int add = 0;
        if (enter() == 1) {
            add = goBack;
            phonebook();
        }
    }
    public static void erase(){
        System.out.printf("%n%s%n%d:%s%n", "***ERASE***",1, "Go back");
        int goBack = 1;
        int er = 0;
        if (enter() == 1) {
            er = goBack;
            phonebook();
        }
    }
    public static void edit(){
        System.out.printf("%n%s%n%d:%s%n", "***EDIT***",1, "Go back");
        int goBack = 1;
        int edt = 0;
        if (enter() == 1) {
            edt = goBack;
            phonebook();
        }
    }
    public static void sendBcard(){
        System.out.printf("%n%s%n%d:%s%n", "***SEND BCARD***",1, "Go back");
        int goBack = 1;
        int sbc = 0;
        if (enter() == 1) {
            sbc = goBack;
            phonebook();
        }
    }

    public static void assignTone(){
        System.out.printf("%n%s%n%d:%s%n", "***ASSIGN TONE***",1, "Go back");
        int goBack = 1;
        int ast = 0;
        if (enter() == 1) {
            ast = goBack;
            phonebook();
        }
    }
    public static void options() {
     System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n", "***OPTIONS***", 1, "Type of view", 2, "Memory status", 3, "Go back");
    int typeOfView = 1;
    int memoryStatus = 2;
    int goBack = 3;
        String display = "No information to display";
    int opt = 0;
         switch (enter()) {
              case 1 -> {
                        opt = typeOfView;
                        typeOfView();
                }
              case 2 -> {
                        opt = memoryStatus;
                        memoryStatus();
                }
              case 3 -> {
                        opt = goBack;
                        phonebook();
                }
              default -> {
                        System.out.printf("%n%s%n", display);
                        menu();
                }
              }
    }
    public static void typeOfView(){
        System.out.printf("%n%s%n%d:%s%n", "***TYPE OF VIEWT***",1, "Go back");
        int goBack = 1;
        int tov = 0;
        if (enter() == 1) {
            tov = goBack;
            options();
        }
    }
    public static void memoryStatus(){
        System.out.printf("%n%s%n%d:%s%n", "***MEMORY STATUS***",1, "Go back");
        int goBack = 1;
        int ms = 0;
        if (enter() == 1) {
            ms = goBack;
            options();
        }
    }

    public static void speedDials(){
        System.out.printf("%n%s%n%d:%s%n", "***SPEED DIALS***",1, "Go back");
        int goBack = 1;
        int sd = 0;
        if (enter() == 1) {
            sd = goBack;
            phonebook();
        }
    }
    public static void voiceTags(){
        System.out.printf("%n%s%n%d:%s%n", "***VOICE TAGS***",1, "Go back");
        int goBack = 1;
        int vt = 0;
        if (enter() == 1) {
            vt = goBack;
            phonebook();
        }
    }
    public static void message(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***MESSAGES***", 1, "Write Messages", 2, "Inbox", 3, "Outbox", 4, "Picture Messages", 5, "Templates", 6, "Smileys", 7, "Message Settings", 8, "Info Service", 9, "Voice mailbox Number", 10, "Service command editor", 11, "Go back");
        int writeMessages = 1;
        int inbox = 2;
        int outbox = 3;
        int pictureMessages = 4;
        int templates = 5;
        int smileys = 6;
        int messageSettings = 7;
        int infoService = 8;
        int voiceMailboxNumber = 9;
        int serviceCommandEditor = 10;
        int goBack = 11;
        int mess = 0;
        String display = "No information to display";
        switch (enter()) {
            case 1-> {
                mess = writeMessages;
                writeMessages();
            }
            case 2-> {
                mess = inbox;
                inbox();
            }
            case 3-> {
                mess = outbox;
                outbox();
            }
            case 4-> {
                mess = pictureMessages;
                pictureMessages();
            }
            case 5-> {
                mess = templates;
                templates();
            }
            case 6-> {
                mess = smileys;
                smileys();
            }
            case 7-> {
                mess = messageSettings;
                messageSetting();
            }
            case 8-> {
                mess = infoService;
                infoService();
            }
            case 9-> {
                mess = voiceMailboxNumber;
                voiceMailboxNumber();
            }
            case 10-> {
                mess = serviceCommandEditor;
                serviceCommandEditor();
            }
            case 11-> {
                mess = goBack;
                menu();
            }
            default -> {
                System.out.println(display);
            }
        }
    }
    public static void writeMessages(){
        System.out.printf("%n%s%n%d:%s%n", "***WRITE MESSAGE***",1, "Go back");
        int goBack = 1;
        int wm = 0;
        if (enter() == 1) {
            wm = goBack;
            message();
        }
    }
    public static void inbox(){
        System.out.printf("%n%s%n%d:%s%n", "***INBOX***",1, "Go back");
        int goBack = 1;
        int ib = 0;
        if (enter() == 1) {
            ib = goBack;
            message();
        }
    }
    public static void outbox(){
        System.out.printf("%n%s%n%d:%s%n", "***OUTBOX***",1, "Go back");
        int goBack = 1;
        int out = 0;
        if (enter() == 1) {
            out = goBack;
            message();
        }
    }
    public static void pictureMessages(){
        System.out.printf("%n%s%n%d:%s%n", "***PICTURE MESSAGES***",1, "Go back");
        int goBack = 1;
        int pm = 0;
        if (enter() == 1) {
            pm = goBack;
            message();
        }
    }
    public static void templates(){
        System.out.printf("%n%s%n%d:%s%n", "***TEMPLATES***",1, "Go back");
        int goBack = 1;
        int tm = 0;
        if (enter() == 1) {
            tm = goBack;
            message();
        }
    }
    public static void smileys(){
        System.out.printf("%n%s%n%d:%s%n", "***SMILEYS***",1, "Go back");
        int goBack = 1;
        int sm = 0;
        if (enter() == 1) {
            sm = goBack;
            message();
        }
    }
    public static void infoService(){
        System.out.printf("%n%s%n%d:%s%n", "***INFO SERVICE***",1, "Go back");
        int goBack = 1;
        int ins = 0;
        if (enter() == 1) {
            ins = goBack;
            message();
        }
    }
        public static void voiceMailboxNumber(){
        System.out.printf("%n%s%n%d:%s%n", "***VOICE MAILBOX NUMBER***",1, "Go back");
        int goBack = 1;
        int smn = 0;
        if (enter() == 1) {
            smn = goBack;
            message();
        }
    }

    public static void serviceCommandEditor (){
        System.out.printf("%n%s%n%d:%s%n", "***SERVICE COMMAND EDITOR***",1, "Go back");
        int goBack = 1;
        int svc = 0;
        if (enter() == 1) {
            svc = goBack;
            message();
        }
    }

    //message settings method
    public static void messageSetting(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n", "***MESSAGE SETTINGS***", 1, "Set 1", 2, "Common", 3, "Go back");
        int set1 = 1;
        int common = 2;
        int goBack = 3;
        int msc = 0;
        String display = "No information to display";
        switch (enter()) {
            case 1-> {
                msc = set1;
                set1();
            }
            case 2-> {
                msc = common;
                common();
            }
            case 3-> {
                msc = goBack;
                message();
            }
        }

    }
    public static void common () {
        String display = "No information to display";
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***COMMON***", 1, "Delivery Report", 2, "Reply Via Same Centre", 3, "Character Support", 4, "Go back");
        int deliveryReports = 1;
        int replyViaSameCentre = 2;
        int characterSupport = 3;
        int goBack = 4;
        int cum = 0;
        switch (enter()) {
            case 1 -> {
                cum = deliveryReports;
                deliveryReport();
            }
            case 2 -> {
                cum = replyViaSameCentre;
                replyViaSameCentre();
            }
            case 3 -> {
                cum = characterSupport;
                characterSupport();
            }
            case 4 -> {
                cum = goBack;
                messageSetting();
            }
            default -> {
                System.out.println(display);
                menu();
            }
        }
    }
    public static void replyViaSameCentre(){
        System.out.printf("%n%s%n%d:%s%n", "***REPLY VIA SAME CENTRE***",1, "Go back");
        int goBack = 1;
        int rep = 0;
        if (enter() == 1) {
            rep = goBack;
            common();
        }
    }
    public static void deliveryReport(){
        System.out.printf("%n%s%n%d:%s%n", "***DELIVERY REPORT***",1, "Go back");
        int goBack = 1;
        int dr = 0;
        if (enter() == 1) {
            dr = goBack;
            common();
        }
    }
    public static void characterSupport(){
        System.out.printf("%n%s%n%d:%s%n", "***CHARACTER SUPPORT***",1, "Go back");
        int goBack = 1;
        int ch = 0;
        if (enter() == 1) {
            ch = goBack;
            common();
        }
    }

    public static void set1() {
        String display = "No information to display";
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***SET 1***", 1, "Message centre number", 2, "Message sent as", 3, "Message validity", 4, "Go back");
        int messageCentreNumber = 1;
        int messageSentAs = 2;
        int messageValidity = 3;
        int goBack = 4;
        int msn = 0;
        switch (enter()) {
            case 1 -> {
                msn = messageCentreNumber;
                messageCentreNumber();
            }
            case 2 -> {
                msn = messageSentAs;
                messageSentAs();
            }
            case 3 -> {
                msn = messageValidity;
                messageValidity();
            }
            case 4 -> {
                msn = goBack;
                messageSetting();
            }
            default -> {
                System.out.println(display);
            }
        }
    }
    public static void messageCentreNumber(){
        System.out.printf("%n%s%n%d:%s%n", "***MESSAGE CENTRE NUMBER***",1, "Go back");
        int goBack = 1;
        int mc = 0;
        if (enter() == 1) {
            mc = goBack;
            set1();
        }
    }
    public static void messageSentAs(){
        System.out.printf("%n%s%n%d:%s%n", "***MESSAGE SENT AS***",1, "Go back");
        int goBack = 1;
        int sent = 0;
        if (enter() == 1) {
            sent = goBack;
            set1();
        }
    }
    public static void messageValidity(){
        System.out.printf("%n%s%n%d:%s%n", "***MESSAGE VALIDITY***",1, "Go back");
        int goBack = 1;
        int val = 0;
        if (enter() == 1) {
            val = goBack;
            set1();
        }
    }
    //Call Register method
    public static void callRegister(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***CALL REGISTER***", 1, " Missed calls", 2, "Received calls", 3, "Dialled numbers", 4, "Erase recent call lists", 5, "Show call durations", 6, "Show call cost", 7, "Call cost settings", 8, "Prepaid credits", 9, "Go back");
        int missedCalls = 1;
        int receivedCalls = 2;
        int dialledNumbers = 3;
        int eraseRecentCallLists = 4;
        int showCallDuration = 5;
        int showCallCosts = 6;
        int callCostSettings = 7;
        int prepaidCredit = 8;
        int goBack = 9;
        int reg = 0;
        String display = "No information to display";
                switch (enter()) {
        case 1-> {
            reg = missedCalls;
            missedCalls();
        }
        case 2-> {
            reg = receivedCalls;
            receivedCalls();
        }
        case 3-> {
            reg = dialledNumbers;
            dialledNumbers();
        }
        case 4-> {
            reg = eraseRecentCallLists;
            eraseRecentCallsList();
        }
        case 5->{
            reg = showCallDuration;
            showCallDuration();
        }
        case 6-> {
            reg = showCallCosts;
            showCallCost();
        }
        case 7-> {
            reg = callCostSettings;
            callCostSetting();
        }
        case 8-> {
            reg = prepaidCredit;
            prepaidCredit();
        }
        case 9-> {
            reg = goBack;
            menu();
        }
        default -> {
            System.out.println(display);
        }
    }
    }
    //missed calls method
    public static void missedCalls(){
        System.out.printf("%n%s%n%d:%s%n", "***MISSED CALLS***",1, "Go back");
        int goBack = 1;
        int mcall = 0;
        if (enter() == 1) {
            mcall = goBack;
            callRegister();
        }
    }
    //received calls method
    public static void receivedCalls(){
        System.out.printf("%n%s%n%d:%s%n", "***RECEIVED CALLS***",1, "Go back");
        int goBack = 1;
        int rcall = 0;
        if (enter() == 1) {
            rcall = goBack;
            callRegister();
        }
    }
    //dialled numbers method
    public static void dialledNumbers(){
        System.out.printf("%n%s%n%d:%s%n", "***DIALLED NUMBERS***",1, "Go back");
        int goBack = 1;
        int dn = 0;
        if (enter() == 1) {
            dn = goBack;
            callRegister();
        }
    }
    //erase recent call list method
    public static void eraseRecentCallsList(){
        System.out.printf("%n%s%n%d:%s%n", "***ERASE RECENT CALLS***",1, "Go back");
        int goBack = 1;
        int er = 0;
        if (enter() == 1) {
            er = goBack;
            callRegister();
        }
    }
    public static void prepaidCredit(){
        System.out.printf("%n%s%n%d:%s%n", "***PREPAID CREDIT***",1, "Go back");
        int goBack = 1;
        int pr = 0;
        if (enter() == 1) {
            pr = goBack;
            callRegister();
        }
    }
    //show call cost method
    public static void showCallCost(){
     System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n","***SHOW CALL COSTS***", 1, " Last call cost", 2, "All call cost", 3, "Clear counters", 4, "Go back");
    int lastCallCost = 1;
    int allCallsCost = 2;
    int clearCounters = 3;
    int goBack = 4;
    int cost = 0;
    String display = "No information to display";
    switch (enter()) {
        case 1-> {
            cost = lastCallCost;
            lastCallCost();
        }
        case 2-> {
            cost = allCallsCost;
            allCallsCost();
        }
        case 3-> {
            cost = clearCounters;
            clearCounters();
        }
        case 4->{
            cost = goBack;
            callRegister();
        }
        default -> {
            System.out.println(display);
            menu();
        }
    }
}
    public static void lastCallCost(){
        System.out.printf("%n%s%n%d:%s%n", "***LAST CALL COST***",1, "Go back");
        int goBack = 1;
        int lcc = 0;
        if (enter() == 1) {
            lcc = goBack;
            showCallCost();
        }
    }
    public static void allCallsCost(){
        System.out.printf("%n%s%n%d:%s%n", "***ALL CALLS COST***",1, "Go back");
        int goBack = 1;
        int acc = 0;
        if (enter() == 1) {
            acc = goBack;
            showCallCost();
        }
    }
    public static void clearCounters(){
        System.out.printf("%n%s%n%d:%s%n", "***CLEAR COUNTERS***",1, "Go back");
        int goBack = 1;
        int cc = 0;
        if (enter() == 1) {
            cc = goBack;
            showCallCost();
        }
    }
    //call cost setting
    public static void callCostSetting(){
    System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n", "***CALL COST SETTINGS***", 1, "Call cost limit", 2, "Show cost in", 3, "Go back");
    int callCostLimit = 1;
    int showCostsIn = 2;
    int goBack = 3;
    int in = 0;
        String display = "No information to display";
            switch (enter()) {
        case 1-> {
            in = callCostLimit;
            costCallLimit();
        }
        case 2->{
            in = showCostsIn;
            showCostIn();
        }
        case 3-> {
            in = goBack;
            callRegister();
        }
        default -> {
            System.out.println(display);
            menu();
        }
    }
    }
    public static void costCallLimit(){
        System.out.printf("%n%s%n%d:%s%n", "***COST CALL LIIMIT***",1, "Go back");
        int goBack = 1;
        int ccl = 0;
        if (enter() == 1) {
            ccl = goBack;
            callCostSetting();
        }
    }
    public static void showCostIn(){
        System.out.printf("%n%s%n%d:%s%n", "***SHOW COST IN***",1, "Go back");
        int goBack = 1;
        int sci = 0;
        if (enter() == 1) {
            sci = goBack;
            callCostSetting();
        }
    }
    //show call duration
    public static void showCallDuration(){
     System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***SHOW CALL DURATION***", 1, "Last call duration", 2, "All calls duration", 3, "Received call duration", 4, "Dialled call duration", 5, "Clear Timers", 6, "Go back");
    int lastCallDuration = 1;
    int allCallsDuration = 2;
    int receivedCallsDuration =3;
    int dialledCallsDuration = 4;
    int clearTimers = 5;
    int goBack = 6;
    int show = 0;
        String display = "No information to display";
            switch (enter()) {
        case 1-> {
            show = lastCallDuration;
            lastCallDuration();
        }
        case 2-> {
            show = allCallsDuration;
            allCallsDuration();
        }
        case 3-> {
            show = receivedCallsDuration;
            receivedCallsDuration();
        }
        case 4-> {
            show = dialledCallsDuration;
            dialledCallsDuration();
        }
        case 5-> {
            show = clearTimers;
            callTimers();
        }
        case 6-> {
            show = goBack;
            callRegister();
        }
        default -> {
            System.out.println(display);
            menu();

        }
    }
    }
    public static void lastCallDuration(){
        System.out.printf("%n%s%n%d:%s%n", "***LAST CALL DURATION***",1, "Go back");
        int goBack = 1;
        int lcd = 0;
        if (enter() == 1) {
            lcd = goBack;
            showCallDuration();
        }
    }
    public static void allCallsDuration(){
        System.out.printf("%n%s%n%d:%s%n", "***CHARACTER SUPPORT***",1, "Go back");
        int goBack = 1;
        int acd = 0;
        if (enter() == 1) {
            acd = goBack;
            showCallDuration();
        }
    }
    public static void receivedCallsDuration(){
        System.out.printf("%n%s%n%d:%s%n", "***RECEIVED CALLS DURATION***",1, "Go back");
        int goBack = 1;
        int rcd = 0;
        if (enter() == 1) {
            rcd = goBack;
            showCallDuration();
        }
    }
    public static void dialledCallsDuration(){
        System.out.printf("%n%s%n%d:%s%n", "***DIALLED CALL DURATION***",1, "Go back");
        int goBack = 1;
        int dcd = 0;
        if (enter() == 1) {
            dcd = goBack;
            showCallDuration();
        }
    }
    public static void callTimers(){
        System.out.printf("%n%s%n%d:%s%n", "***CALL TIMERS***",1, "Go back");
        int goBack = 1;
        int ct = 0;
        if (enter() == 1) {
            ct = goBack;
            showCallDuration();
        }
    }
    //settings method
    public static void settings(){
     System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***SETTINGS***", 1, "Call settings", 2, "Phone settings", 3, "Security settings", 4, "Restore factory settings", 5, "Go back");
        int callSettings = 1;
        int phoneSettings = 2;
        int securitySettings = 3;
        int restoreFactorySettings = 4;
        int goBack = 5;
        int set = 0;
        String display = "No information to display";
        switch (enter()) {
            case 1-> {
               set = callSettings;
               callSetting();
        }
        case 2-> {
            set = phoneSettings;
               phoneSetting();
        }
        case 3-> {
            set = securitySettings;
               securitySettings();
        }
        case 4-> {
                set = restoreFactorySettings;
                restoreFactorySettings();
        }
        case 5-> {
            set = goBack;
               menu();
        }
        default -> {
            System.out.println(display);
               menu();
        }
     }
}
    public static void restoreFactorySettings(){
        System.out.printf("%n%s%n%d:%s%n", "***RESTORE FACTORY SETTINGS***",1, "Go back");
        int goBack = 1;
        int rfs = 0;
        if (enter() == 1) {
            rfs = goBack;
            settings();
        }
    }
    //security settings
    public static void securitySettings(){
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***SECURITY SETTINGS***", 1, "PIN code settings", 2, "Call barring service", 3, "Fixed dialing", 4, "Closed user group", 5, "Phone security", 6, "Change access codes", 7, "Go back");
        int pINCodeSettings = 1;
        int callBarringService =  2;
        int fixedDialliing = 3;
        int closedUserGroup = 4;
        int phoneSecurity = 5;
        int changeAccessCodes = 6;
        int goBack = 7;
        int cso = 0;
        String display = "No information to display";
                        switch (enter()) {
        case 1-> {
            cso = pINCodeSettings;
            pINCodeSetting();
        }
        case 2-> {
            cso = callBarringService;
            callBarringService();
        }
        case 3-> {
            cso = fixedDialliing;
            fixedDialing();
        }
        case 4-> {
            cso = closedUserGroup;
            closedUserGroup();
        }
        case 5-> {
            cso = phoneSecurity;
            phoneSecurity();
        }
        case 6-> {
            cso = changeAccessCodes;
            changeAccessCode();
        }
        case 7-> {
            cso = goBack;
            settings();
        }
        default -> {
            System.out.println(display);
            messageCentreNumber();
        }
    }
}
    public static void pINCodeSetting(){
        System.out.printf("%n%s%n%d:%s%n", "***PIN CODE SETTING***",1, "Go back");
        int goBack = 1;
        int pcs = 0;
        if (enter() == 1) {
            pcs = goBack;
            securitySettings();
        }
    }
    public static void callBarringService(){
        System.out.printf("%n%s%n%d:%s%n", "***CALL BARRING SERVICE***",1, "Go back");
        int goBack = 1;
        int cbs = 0;
        if (enter() == 1) {
            cbs = goBack;
            securitySettings();
        }
    }
    public static void fixedDialing(){
        System.out.printf("%n%s%n%d:%s%n", "***FIXED DIALING***",1, "Go back");
        int goBack = 1;
        int fxd = 0;
        if (enter() == 1) {
            fxd = goBack;
            securitySettings();
        }
    }
    public static void closedUserGroup(){
        System.out.printf("%n%s%n%d:%s%n", "***CLOSED USER GROUP***",1, "Go back");
        int goBack = 1;
        int cug = 0;
        if (enter() == 1) {
            cug = goBack;
            securitySettings();
        }
    }
    public static void phoneSecurity(){
        System.out.printf("%n%s%n%d:%s%n", "***PHONE SECURITY***",1, "Go back");
        int goBack = 1;
        int ps = 0;
        if (enter() == 1) {
            ps = goBack;
            securitySettings();
        }
    }
    public static void changeAccessCode(){
        System.out.printf("%n%s%n%d:%s%n", "***CHANGE ACCESS CODE***",1, "Go back");
        int goBack = 1;
        int cad = 0;
        if (enter() == 1) {
            cad= goBack;
            securitySettings();
        }
    }
    public static void phoneSetting(){
    System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***PHONE SETTING***", 1, "Language", 2, "Cell info display", 3, "Welcome note", 4, "Network selection", 5, "Lights", 6, "Confirm SIM service actions", 7, "Go back");
        int language = 1;
        int cellInfoDisplay = 2;
        int welcomeNote = 3;
        int networkSelection = 4;
        int lights = 5;
        int confirmSIMServiceActions = 6;
        int goBack = 7;
        int phone = 0;
        String display = "No information to display";
        switch (enter()) {
            case 1-> {
                phone =  language;
                language();
            }
            case 2-> {
                 phone = cellInfoDisplay;
                 cellInfoDisplay();
            }
            case 3-> {
                 phone = welcomeNote;
                 welcomeNote();
            }
            case 4-> {
                 phone = networkSelection;
                 networkSelection();
            }
            case 5-> {
                 phone = lights;
                lights();
            }
            case 6-> {
                 phone = confirmSIMServiceActions;
                 confirmSIMServiceAction();
            }
            case 7-> {
                 phone = goBack;
                 settings();
            }
            default -> {
                 System.out.println(display);
                 menu();
            }
        }
    }
    public static void language(){
        System.out.printf("%n%s%n%d:%s%n", "***LANGUAGE***",1, "Go back");
        int goBack = 1;
        int lang = 0;
        if (enter() == 1) {
            lang = goBack;
            phoneSetting();
        }
    }
    public static void cellInfoDisplay(){
        System.out.printf("%n%s%n%d:%s%n", "***CELL INFO DISPLAY***",1, "Go back");
        int goBack = 1;
        int cid = 0;
        if (enter() == 1) {
            cid = goBack;
            phoneSetting();
        }
    }
    public static void welcomeNote(){
        System.out.printf("%n%s%n%d:%s%n", "***WELCOME NOTE***",1, "Go back");
        int goBack = 1;
        int ch = 0;
        if (enter() == 1) {
            ch = goBack;
            phoneSetting();
        }
    }
    public static void networkSelection(){
        System.out.printf("%n%s%n%d:%s%n", "***NETWORK SELECTION***",1, "Go back");
        int goBack = 1;
        int ns = 0;
        if (enter() == 1) {
            ns = goBack;
            phoneSetting();
        }
    }
    public static void lights(){
        System.out.printf("%n%s%n%d:%s%n", "***LIGHT***",1, "Go back");
        int goBack = 1;
        int lit = 0;
        if (enter() == 1) {
            lit = goBack;
            phoneSetting();
        }
    }
    public static void confirmSIMServiceAction(){
        System.out.printf("%n%s%n%d:%s%n", "***CONFIRM SIM SERVICE ACTION***",1, "Go back");
        int goBack = 1;
        int conf = 0;
        if (enter() == 1) {
            conf = goBack;
            phoneSetting();
        }
    }

    //call setting method
    public static void callSetting(){
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***CALL SETTING***", 1, "Automatic redial", 2, "Speed dialing", 3, "Call waiting options", 4, "Own number sending", 5, "Phone line in use", 6, "Automatic answer", 7, "Go back");
        int automaticRedial = 1;
        int speedDialing = 2;
        int callWaitingOptions = 3;
        int ownNumberSending = 4;
        int phoneLineInUse = 5;
        int automaticAnswer = 6;
        int goBack = 7;
        String display = "No information to display";
        int call = 0;
        switch (enter()) {
        case 1-> {
            call = automaticRedial;
            automaticRedial();
        }
        case 2-> {
            call = speedDialing;
            speedDialing();
        }
        case 3-> {
            call = callWaitingOptions;
            callWaitingOptions();
        }
        case 4-> {
            call = ownNumberSending;
            ownNumberSending();
        }
        case 5-> {
            call = phoneLineInUse;
            phoneLineInUse();
        }
        case 6-> {
            call = automaticAnswer;
            automaticAnswer();
        }
        case 7-> {
            call = goBack;
            settings();
        }
        default -> {
            System.out.println(display);
        }
    }
}
public static void automaticRedial(){
    System.out.printf("%n%s%n%d:%s%n", "***AUTOMATIC REDIALING***",1, "Go back");
    int goBack = 1;
    int ar = 0;
    if (enter() == 1) {
          ar = goBack;
          callSetting();
    }
}
    public static void speedDialing(){
        System.out.printf("%n%s%n%d:%s%n", "***SPEED DIALING***",1, "Go back");
        int goBack = 1;
        int spd = 0;
        if (enter() == 1) {
            spd = goBack;
            callSetting();
        }
    }
    public static void callWaitingOptions(){
        System.out.printf("%n%s%n%d:%s%n", "***CALL WAITING OPTIONS***",1, "Go back");
        int goBack = 1;
        int cw = 0;
        if (enter() == 1) {
            cw = goBack;
            callSetting();
        }
    }
    public static void ownNumberSending(){
        System.out.printf("%n%s%n%d:%s%n", "***OWN NUMBER SENDING***",1, "Go back");
        int goBack = 1;
        int own = 0;
        if (enter() == 1) {
            own = goBack;
            callSetting();
        }
    }
    public static void phoneLineInUse(){
        System.out.printf("%n%s%n%d:%s%n", "***PHONE LINE IN USE***",1, "Go back");
        int goBack = 1;
        int pliu = 0;
        if (enter() == 1) {
            pliu = goBack;
            callSetting();
        }
    }
    public static void automaticAnswer(){
        System.out.printf("%n%s%n%d:%s%n", "***AUTOMATIC ANSWER***",1, "Go back");
        int goBack = 1;
        int aa = 0;
        if (enter() == 1) {
            aa = goBack;
            callSetting();
        }
    }
    //clock settings
    public static void clock(){
        System.out.printf("%n%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n%d:%s%n", "***CLOCK***", 1, "Alarm clock", 2, "Clock settings", 3, "Date settings", 4, "Stopwatch", 5, "Countdown timer", 6, "Auto update of time and date", 7, "Go back");
        int alarmClock = 1;
        int clockSetttings = 2;
        int dateSetting = 3;
        int stopwatch = 4;
        int countdownTimer = 5;
        int autoUpdateOfDateAndTime = 6;
        int goBack = 7;
        String display = "No information to display";
        int time = 0;
        switch (enter()) {
            case 1-> {
                time = alarmClock;
                alarmClock();
            }
            case 2-> {
                time = clockSetttings;
                clockSetting();
            }
            case 3-> {
                time = dateSetting;
                dateSetting();
            }
            case 4-> {
                time = stopwatch;
                stopwatch();
            }
            case 5-> {
                time = countdownTimer;
                countdownTimer();
            }
            case 6-> {
                time = autoUpdateOfDateAndTime;
                autoUpdateOfDateAndTime();
            }
            case 7-> {
                time = goBack;
                menu();
            }
            default -> {
                System.out.println(display);
                menu();
            }
        }
    }
    public static void alarmClock(){
        System.out.printf("%n%s%n%d:%s%n", "***ALARM CLOCK***",1, "Go back");
        int goBack = 1;
        int ac = 0;
        if (enter() == 1) {
            ac = goBack;
            clock();
        }
    }
    public static void clockSetting(){
        System.out.printf("%n%s%n%d:%s%n", "***CLOCK SETTING***",1, "Go back");
        int goBack = 1;
        int cs = 0;
        if (enter() == 1) {
            cs = goBack;
            clock();
        }
    }
    public static void dateSetting(){
        System.out.printf("%n%s%n%d:%s%n", "***DATE SETTING***",1, "Go back");
        int goBack = 1;
        int ds = 0;
        if (enter() == 1) {
            ds = goBack;
            clock();
        }
    }
    public static void stopwatch(){
        System.out.printf("%n%s%n%d:%s%n", "***STOPWATCH***",1, "Go back");
        int goBack = 1;
        int st = 0;
        if (enter() == 1) {
            st = goBack;
            clock();
        }
    }
    public static void countdownTimer(){
        System.out.printf("%n%s%n%d:%s%n", "***COUNTDOWN TIMER***",1, "Go back");
        int goBack = 1;
        int cdt = 0;
        if (enter() == 1) {
            cdt = goBack;
            clock();
        }
    }
    public static void autoUpdateOfDateAndTime(){
        System.out.printf("%n%s%n%d:%s%n", "***AUTO UPDATE OF DATE AND TIME***",1, "Go back");
        int goBack = 1;
        int auto = 0;
        if (enter() == 1) {
            auto = goBack;
            clock();
        }
    }
    public static void menu(){
        System.out.printf("%n%s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d: %s%n%d:%s%n","***PHONE MENU***", 1, "Phonebook", 2, "Message", 3, "Chat", 4, "Call Register", 5, "Tones", 6, "Settings", 7, "Call Diverts", 8, "Games",9, "Calculator", 10, "Reminders", 11, "Clock", 12, "Profile", 13, "SIM Service", 14, "Exit");
        int phonebook = 1;
        int message = 2;
        int chat = 3;
        int callRegister = 4;
        int tones = 5;
        int settings = 6;
        int callDivert = 7;
        int games = 8;
        int calculator = 9;
        int reminders = 10;
        int clock = 11;
        int profile = 12;
        int simService = 13;
        int menu = 0;
        switch (enter()){
            case 1-> {
                menu = phonebook;
                phonebook();
            }
            case 2-> {
                menu = message;
                message();
            }
            case 3-> {
                menu = chat;
            }
            case 4-> {
                menu = callRegister;
                callRegister();
            }
            case 5-> {
                menu = tones;
                tone();
            }
            case 6-> {
                menu = settings;
                settings();
            }
            case 7-> {
                menu = callDivert;
                callDivert();
            }
            case 8-> {
                menu = games;
                games();
            }
            case 9-> {
                menu = calculator;
                calculator();
            }
            case 10-> {
                menu = reminders;
                reminders();
            }
            case 11-> {
                menu = clock;
                clock();
            }
            case 12-> {
                menu = profile;
                profile();
            }
            case 13-> {
                menu = simService;
                simService();
            }
            default -> {
                break;
            }
        }
    }
    public static void callDivert(){
        System.out.printf("%n%s%n%d:%s%n", "***CALL DIVERT***",1, "Go back");
        int goBack = 1;
        int div = 0;
        if (enter() == 1) {
            div = goBack;
            menu();
        }
    }
    public static void games() {
        System.out.printf("%n%s%n%d:%s%n", "***GAMES***", 1, "Go back");
            int goBack = 1;
            int gam = 0;
            if (enter() == 1) {
                gam = goBack;
                menu();
            }
        }
    public static void calculator(){
        System.out.printf("%n%s%n%d:%s%n", "***CALCULATOR***", 1, "Go back");
        int goBack = 1;
        int calc = 0;
        if (enter() == 1) {
            calc = goBack;
            menu();
        }
    }
    public static void reminders(){
        System.out.printf("%n%s%n%d:%s%n", "***REMINDERS***", 1, "Go back");
        int goBack = 1;
        int rem = 0;
        if (enter() == 1) {
            rem = goBack;
            menu();
        }
    }
    public static void profile(){
        System.out.printf("%n%s%n%d:%s%n", "***PROFILE***",1, "Go back");
        int goBack = 1;
        int prof = 0;
        if (enter() == 1) {
            prof = goBack;
            menu();
        }
    }
    public static void simService(){
        System.out.printf("%n%s%n%d:%s%n", "***SIM SERVICE***",1, "Go back");
        int goBack = 1;
        int serv = 0;
        if (enter() == 1) {
            serv = goBack;
            menu();
        }
    }
}


