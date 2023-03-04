package streams_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BWritter {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))){
            //System.out is passed in the constructor hence, it becomes where the output will be written
            writer.write("I am a man on a mission");
            //the string or text passed as an argument into the write method will be displayed or output on the terminal
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\dean.txt"))){
            //if the file path is not stated in the constructor but only the file name, the file will be created in the source root
            writer.write("My name Dean and I am a man on a very serious mission");
            //the text or string written into the write method, will be written to the file pointed at above
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
