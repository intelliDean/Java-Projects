package streams_io;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BFReader2 {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(BFReader2.class);      //this is a logger to log on the terminal
        try(BufferedReader buffer = new BufferedReader(
                new FileReader("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\man.txt"))) {
            System.out.println(buffer.readLine());
        } catch (IOException ex) {
            log.error(ex :: getMessage);        //the logger is to log error
            //the log could be redirected to another resource,
        }
    }
}
