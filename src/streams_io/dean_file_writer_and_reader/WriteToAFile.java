package streams_io.dean_file_writer_and_reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args) {
        String[] goals = {"Be the best I can in Java","Secure a good job in software engineering", "Have a career mentor", "Discover purpose", "Find a woman whose purpose i share", "Finish my passport processing", "Have other means of revenue"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\dean_file_writer_and_reader\\goal.txt"))) {
            for (String goal : goals) {
                writer.write(goal+"\n");
            }
        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public static void write(String... words) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\dean_file_writer_and_reader\\word.txt"))) {
            for (String word : words) {
                writer.write(word+"\n");
            }
        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
