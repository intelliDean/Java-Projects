package Diary;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Diary {

    private boolean isLocked;
    private final List<Entry> entries;
    private String password;


    public Diary(String name, String password) {
        if (isValidPassword(password)) {
            this.password = password;
        }
//        this.password = password;
        isLocked = true;
        entries = new ArrayList<>();
    }
    public static boolean isValidPassword(String password) {
        // At least          0 - 9      /       a - z  /   A - Z   / Special Characters    /   20 <= >= 8
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";

        Pattern pattern = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher match = pattern.matcher(password);
        return match.matches();
    }
    public boolean isLocked() {         //query method to get the state of the diary
        return isLocked;
    }

    public void lock() {            //update method to change the state of the diary
        isLocked = true;
    }
    public void  unlockWith(String password) {           //update method
        boolean passwordMatch = password.equals(this.password);
        if (passwordMatch) {
            this.isLocked = false;
        }
    }
    public void write(String title, String bodyOfEntry) {
        if (isLocked) throw new IllegalArgumentException("You dey mad abi? Diary is locked joor");
        writeIntoDiary(title, bodyOfEntry);
    }
    private void writeIntoDiary(String title, String bodyOfEntry) {
        int id = numberOfEntries() + 1;
        Entry newEntry = new Entry(id, title, bodyOfEntry);
        entries.add(newEntry);
    }
    public int numberOfEntries() {
        return entries.size();
    }
    public Entry getEntryById(int id) {
        for (Entry entry : entries) {
           if (entry.getId() == id) {
               return entry;
           }
        }
        return null;
    }
    public void deleteEntryById(int id) {
        entries.removeIf(entry -> entry.getId() == id);
//        for (Entry entry : entries) {
//            if (entry.getId() == id) {
//                entries.remove(entry);
//                break;
//            }
//        }
    }

    public void updatePassword(String newPassword) {
        this.password = newPassword;
    }

    public void deleteEntryByTitle(String title) {
        entries.removeIf(entry -> entry.getTitle().equals(title));
    }

    public void deleteEntryByBody(String body) {
        entries.removeIf(entry -> entry.getEntryBody().equals(body));
    }
    public Entry viewAllEntries() {
        for (Entry entry : entries) {
            return entry;
        }
        return null;
    }
}
