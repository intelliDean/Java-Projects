package streams_io.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FilesInputClass {
    public static void main(String[] args) {
        byte[] bytes = new byte[500];
        try (FileInputStream stream = new FileInputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\File2.txt")) {
           stream.read(bytes);      //method read reads the contents of the files (name.txt) into the byte array
            for (byte b : bytes) {      //the byte array then prints out the contents stored in it
                if (b != 0) {
                    System.out.print(Character.toString(b));    //the contents stored in byte array are stored in numeric values, which are then converted toString
                }
            }
        } catch (IOException ex) {      //to use the class FileInputStream, you need to try and catch exceptions
            System.out.println(ex.getMessage());
        }
    }
}
