package streams_io.read_and_write;

import java.io.FileInputStream;
import java.io.IOException;

public class Read {
    public static void main(String... args) {
        readFromAFile();
    }
    private static void readFromAFile() {
        byte[] bytes = new byte[1000];
        try (FileInputStream stream = new FileInputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\stream\\data_output.txt")) {
            System.out.println(stream.read(bytes));
            for (byte by : bytes) {
                if (by != 0) {
                    System.out.print(Character.toString(by));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
