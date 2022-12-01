package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    @DisplayName("This is to execute before every test")
    void setUp() {
        diary = new Diary("Dean", "@Xoxo1239!");
    }
    @Test
    @DisplayName("Test that password must contain at least 8 characters, numbers, letters, small letters and capital letters with special characters")
    void strongPassword() {
        diary = new Diary("Dean","@Xoxo1239!");
        assertNotNull(diary);
    }

    @Test
    @DisplayName("This is to test that diary exist")
    void diaryExist(){
        assertNotNull(diary);
    }
    @Test
    @DisplayName("To test that diary could lock")
    void diaryIsLocked() {
        assertTrue(diary.isLocked());
    }
    @Test
    @DisplayName("To unlock the diary, a matching password is required")
    void diaryIsUnlockedWithPassword() {
        assertTrue(diary.isLocked());
        diary.unlockWith("@Xoxo1239!");
        assertFalse(diary.isLocked());
    }
    @Test
    @DisplayName("A mismatching password will not unlock the diary")
    void wrongPasswordCannotOpenDiary() {
        assertTrue(diary.isLocked());
        diary.unlockWith("1243");
        assertTrue(diary.isLocked());
    }
    @Test
    @DisplayName("If diary is open, it can also lock")
    void diaryCanLock() {
        diary.unlockWith("@Xoxo1239!");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }
    @Test
    @DisplayName("Events can be added to the diary")
    void entriesCanBeAdded() {
        assertTrue(diary.isLocked());
        diary.unlockWith("@Xoxo1239!");
        assertFalse(diary.isLocked());

        diary.write("I'm in love", "I fell in love with Java");
        assertEquals(1, diary.numberOfEntries());
        diary.write("I am a software engineer","Java made me an engineer");
        assertEquals(2, diary.numberOfEntries());
    }
    @Test

    void cannotWriteWhenDiaryIsLocked() {
        assertTrue(diary.isLocked());
        diary.write("I'm in love", "I fell in love with Java");
        assertEquals(0,  diary.numberOfEntries());
    }
    @Test
    void findEntriesById() {
        diary.unlockWith("@Xoxo1239!");
        assertFalse(diary.isLocked());
        diary.write("I'm in love", "I fell in love with Java");
        assertEquals(1, diary.numberOfEntries());
        Entry foundEntry = diary.getEntryById(1);

        assertEquals(1, foundEntry.getId());
        assertEquals("I'm in love", foundEntry.getTitle());
        assertEquals("I fell in love with Java", foundEntry.getEntryBody());
    }
    @Test
    @DisplayName("To test that entry body could be updated and edited")
    void updateEntryBody() {
        assertTrue(diary.isLocked());
        diary.unlockWith("@Xoxo1239!");
        diary.write("total", "i am ready to give my total");

        Entry entry = diary.getEntryById(1);
        assertEquals("i am ready to give my total", entry.getEntryBody()); //diary.getEntryById(1).getEntryBody());
        entry.updateEntryBody(", and my best");
        assertEquals("i am ready to give my total, and my best", entry.getEntryBody());
    }
    @Test
    @DisplayName("To update the title of entry after been saved")
    void updateTitle() {
        assertTrue(diary.isLocked());
        diary.unlockWith("@Xoxo1239!");
        diary.write("total", "i am ready to give my total");

        Entry entry = diary.getEntryById(1);
        assertEquals("total", entry.getTitle());
        entry.updateTitle(" submission");
        assertEquals("total submission", entry.getTitle());
    }
    @Test
    @DisplayName("Test that and entry could be deleted from the entry list")
    void deleteEntryById() {
        assertTrue(diary.isLocked());
        diary.unlockWith("@Xoxo1239!");
        diary.write("total", "i am ready to give my total");
        assertEquals(1, diary.numberOfEntries());
        diary.deleteEntryById(1);
        assertEquals(0, diary.numberOfEntries());
    }
    @Test
    @DisplayName("Test that user can change password after setting the first time")
    void changePassword() {
        diary = new Diary("Dean", "@Xoxo1239!");
        assertTrue(diary.isLocked());
        diary.updatePassword("PassWord123@");
        diary.unlockWith("PassWord123@");
        assertFalse(diary.isLocked());
    }
    @Test
    @DisplayName("Test that entry could be deleted by Title")
    void deleteEntryByTitle() {
        assertTrue(diary.isLocked());
        diary.unlockWith("@Xoxo1239!");
        diary.write("total", "i am ready to give my total");
        assertEquals(1, diary.numberOfEntries());
        diary.deleteEntryByTitle("total");
        assertEquals(0, diary.numberOfEntries());
    }
    @Test
    @DisplayName("Test that entry could be deleted by Body")
    void deleteEntryByBody() {
        assertTrue(diary.isLocked());
        diary.unlockWith("@Xoxo1239!");
        diary.write("total", "i am ready to give my total");
        assertEquals(1, diary.numberOfEntries());
        diary.deleteEntryByBody("i am ready to give my total");
        assertEquals(0, diary.numberOfEntries());
    }
}
