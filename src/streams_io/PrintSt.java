package streams_io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintSt {
    public static void main(String[] args) {
        // Class PrintStream is used to write to a file instead of the terminal like System.out
        //System.out writes to the terminal, PrintStream redirects that writing to a file or resources pointed by PrintStream
        try(PrintStream printStream =
                    new PrintStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\File2.txt");) {
            printStream.println("this is the file i want to write to");
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
