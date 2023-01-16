package streams_io.read_and_write;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Write {
    public static void main(String... args) {
        writeToAFile();
    }
    private static void writeToAFile() {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(1000);
        try (PrintStream print = new PrintStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\stream\\data_output.txt");) {  //this creates the file to write to
            System.setOut(print);       //it writes to the file instead of the terminal
            try (DataOutputStream output = new DataOutputStream(System.out)) {

                while (input.hasNext()) {
                    sb.append(input.nextLine());        //this keeps taking in the text until an end-of-the-line breaker is inputted
                }
                output.write(sb.toString().getBytes());     //the text appended is written to the file eventually
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
