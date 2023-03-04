package dean_file;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DeanFileTest {
    DeanFile dean;

    @BeforeEach
    void setUp() {
        dean = DeanFile.of("practice.txt");
    }
    @Test
    void getFileName() {
        assertEquals("practice.txt", dean.getFileName());
    }
    @Test
    void getFilePath() {
        assertEquals("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\dean_file\\practice.txt", dean.getFilePath());
    }
    @Test
    void onlyOneObjectCanBeCreated() {
        assertNotNull(dean);
        assertEquals("practice.txt", dean.getFileName());

        DeanFile newFile = DeanFile.of("another.txt");
        assertEquals("practice.txt", newFile.getFileName());
    }
    @Test
    void writeToFileWithArrays() throws IOException {
        String[] word = {"first word", "second word", "third word"};
        //dean.writeToFile(Arrays.toString(word));
        //assertArrayEquals(new String[]{"first word", "second word", "third word"}, dean.getInputs());
    }
    @Test
    void writeToAFile() {
        dean.writeToFile();

    }


}