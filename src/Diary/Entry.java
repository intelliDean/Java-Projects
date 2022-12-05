package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
   private String bodyOfEntry;
   private LocalDateTime timeOfEntry;
    public Entry(int id, String title, String bodyOfEntry) {
        this.id = id;
        this.title = title;
        this.bodyOfEntry = bodyOfEntry;
        timeOfEntry = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void updateTitle(String title) {
        this.title = getTitle() + title;
    }

    public String getEntryBody() {
        return bodyOfEntry;
    }

    public void updateEntryBody(String bodyOfEntry) {
        this.bodyOfEntry = getEntryBody() + bodyOfEntry;
    }

    public LocalDateTime getTimeOfEntry() {
        return timeOfEntry;
    }
    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss a").format(timeOfEntry);
        return String.format("""
                =======================================
                Entry   %s
                Written on %s
                Title:  %s
                Body:   %s
                =======================================
                """, id, time, title, bodyOfEntry);
    }
}
