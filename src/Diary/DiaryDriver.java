package Diary;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DiaryDriver {
    private static Diary diary;
    private static Scanner input = new Scanner(System.in);
    private static Entry entry;

    public static void main(String[] args) {
        createDiary();
        displayLockMenu();

    }

    private static void createDiary() {
        String mainDiary = """
                This is Mai Dia Diary!!!
                       Welcome!
                Set up your own Diary.
                """;

        print(mainDiary);
        String username = in("Enter Your Name");
        String password = in("""
                       ENTER PASSWORD
                Password must not be less than
                8 characters and must contain,
                numbers, lowercase and uppercase
                letters, and special characters""");

        while (!Diary.isValidPassword(password)) {
            print("""
                            ENTER PASSWORD
                    Password must not be less than
                    8 characters and must contain,
                    numbers, lowercase and uppercase
                    letters, and special characters""");
            password = in("enter strong password");
        }
        diary = new Diary(username, password);
        print("Diary created for " + username);
    }

    private static String in(String prompt) {
//        print(prompt);
//        return input.nextLine();
        return JOptionPane.showInputDialog(null, prompt);
    }

    private static void print(String prompt) {
        //System.out.println(prompt);
        JOptionPane.showMessageDialog(null, prompt);
    }
    private static void print(Entry entry) {
        //System.out.println(prompt);
        JOptionPane.showMessageDialog(null, entry);
    }

    private static void displayLockMenu() {
        String mainDiary = """
                1 -> Unlock Diary
                2 -> Lock Diary
                3 -> exit
                """;
        String userInput = in(mainDiary);
        switch (Integer.parseInt(userInput)) {
            case 1 -> unlockDiary();
            case 2 -> lockDiary();
            case 3 -> exitApplication();
        }
    }

    private static void lockDiary() {
        diary.lock();
        print("locked successfully");
        displayLockMenu();
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void unlockDiary() {
        String password = in("enter password");
        diary.unlockWith(password);
        if (diary.isLocked()) {
            print("wrong password");
            displayLockMenu();
        }
        displayDiaryMenu(); //if it doesn't work, take this back up
    }

    public static void displayDiaryMenu() {
        String diaryMenu = """
                1 -> Create Entry
                2 -> Entry Time Created
                3 -> Open Entry (By ID)
                4 -> Get Total Number of Entries
                5 -> View All Entries
                6 -> Update Entry
                7 -> Update Title
                8 -> Delete Entry
                9 -> Lock Diary
                """;
        String userInput = in(diaryMenu);
        switch (Integer.parseInt(userInput)) {
            case 1 -> createEntry();
            case 2 -> getTimeCreated();
            case 3 -> findById();
            case 4 -> getTotalNumberOfEntries();
            case 5 -> updateEntry();
            case 6 -> updateTitle();
            case 7 -> delete();
            case 8 -> lockDiary();
        }
    }

    public static void getTimeCreated() {
        Entry entry = diary.getEntryById(Integer.parseInt(in("Enter ID")));
        LocalDateTime time = entry.getTimeOfEntry();
        System.out.println(time);
        displayDiaryMenu();
    }

    public static void updateEntry() {
        Entry entry = diary.getEntryById(Integer.parseInt(in("Enter ID")));
        entry.updateEntryBody(in("Enter entry update"));
        displayDiaryMenu();
    }

    public static void updateTitle() {
        String id = in("Enter ID");
        Entry entry = diary.getEntryById(Integer.parseInt(id));
        entry.updateTitle(in("Update Entry Title"));
        displayDiaryMenu();
    }

    public static void delete() {
        String deleteFiles = """
                1 - Delete by Id
                2 - Delete by Title
                3 - Delete by Body
                4 - Main Menu
                """;
        String userInput = in(deleteFiles);
        switch (Integer.parseInt(userInput)) {
            case 1 -> deleteById();
            case 2 -> deleteByTitle();
            case 3 -> deleteByBody();
            case 4 -> displayDiaryMenu();
        }
    }

    public static void deleteByTitle() {
        String foundTitle = in("Enter Title");
        if (entry.getTitle().equals(foundTitle)) {
            diary.deleteEntryByTitle(foundTitle);
        }
        delete();
    }
    public static void deleteByBody() {
        String body = in("Enter body");
        if (entry.getEntryBody().equals(body)) {
            diary.deleteEntryByBody(body);
        }
        delete();
    }
    public static void deleteById() {
        String id = in("Enter ID");
        if (diary.numberOfEntries() > 0) {
            diary.deleteEntryById(Integer.parseInt(id));
            delete();
        } else {
            print("Diary contains no entry");
            delete();
        }
    }

    private static void createEntry() {
        String title = in("enter title");
        String body = in("enter body");
        diary.write(title, body);
        print("written successfully");
        displayDiaryMenu();
    }

    public static void findById() {
        String id = in("enter id");
        Entry foundById = diary.getEntryById(Integer.parseInt(id));
        print(foundById.toString());
        displayDiaryMenu();
    }

    public static void getTotalNumberOfEntries() {
        int totalNumberOfEntries = diary.numberOfEntries();
        print("you have" + totalNumberOfEntries + " entries");
        displayDiaryMenu();
    }
}