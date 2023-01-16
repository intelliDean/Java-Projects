package streams_io.stream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndRead {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(1000);
        Scanner input = new Scanner(System.in);
        try (FileOutputStream stream = new FileOutputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\File1.txt")) {  //try with resources
            System.out.println("Enter text");
            while (input.hasNext()) {
                sb.append(input.nextLine());
            }
            stream.write(sb.toString().getBytes());
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }


        byte[] bytes = new byte[500];
        try (FileInputStream stream = new FileInputStream("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\File1.txt")) {
            System.out.println("№ of bytes-> "+stream.read(bytes));      //method read reads the contents of the files (name.txt) into the byte array
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
