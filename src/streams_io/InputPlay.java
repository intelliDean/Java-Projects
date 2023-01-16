package streams_io;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputPlay {
    public static void main(String[] args) {

        try (FileOutputStream stream = new FileOutputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\NewFile.txt")) {
            stream.write("This file does not exist but I want to use FileOutputStream to create it and write this text to it".getBytes());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileInputStream stream = new FileInputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\NewFile.txt")) {
            stream.read();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileOutputStream stream = new FileOutputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\NewFile.txt")) {
            stream.write("This is a new file text i want to write into the same text file, i want to check if it'll append or override".getBytes());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
