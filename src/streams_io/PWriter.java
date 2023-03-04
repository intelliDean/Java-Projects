package streams_io;

import java.io.IOException;
import java.io.PrintWriter;

public class PWriter {
    public static void main(String[] args) {
        try(PrintWriter print = new PrintWriter("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\word.txt")) {
            print.print("word and opposite");
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
