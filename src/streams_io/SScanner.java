package streams_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SScanner {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\word.txt")) {
            Scanner scanner = new Scanner(file);
            String input = scanner.nextLine();
            System.out.println("File contains -> "+input);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
