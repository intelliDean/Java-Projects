package streams_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class FFormatter {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        try (Formatter formatter = new Formatter("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\dean.txt")) {
            Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\dean.txt"));
            while (scanner.hasNext()) {
                buffer.append(scanner.next());
            }
            String str = buffer.append(" and I will succeed").toString();
            formatter.format("file updated to %s", str);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
