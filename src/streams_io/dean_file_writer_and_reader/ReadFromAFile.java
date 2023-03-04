package streams_io.dean_file_writer_and_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromAFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\dean_file_writer_and_reader\\goal.txt"))) {
            String line;
            int i = 1;
            while ((line = reader.readLine()) != null) {
                System.out.printf("%d: %s%n",i, line);
                i++;
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
