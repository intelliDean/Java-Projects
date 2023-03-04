package streams_io.dean_file_writer_and_reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateContentOfAFile {
    public static void main(String[] args) {
        //StringBuffer buffer = new StringBuffer();
        List<String> toRead = new ArrayList<>(1000);
        Scanner input = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\dean_file_writer_and_reader\\goal.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                toRead.add(line+"\n");
            }
            System.out.println("enter words and press 'ctrl D' when done");
            while (input.hasNext()) {
                line = input.nextLine();
                toRead.add(line+"\n");
            }
            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\dean_file_writer_and_reader\\goal.txt"))) {
                for (String word : toRead) {
                    if (word.equals("i")){
                        word = word.replace('i', 'I');
                    }
                    writer.write(word);
                }

            } catch (IOException e){
                System.out.println(e.getMessage());
            }

//            int i = 1;
//            for (String string : toRead) {
//                System.out.printf("%d: %s%n",i, string);
//                i++;
//            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
