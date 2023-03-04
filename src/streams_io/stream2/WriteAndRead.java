package streams_io.stream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndRead {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of file to create and write into ending with '.txt'");
        String fileName = input.next();
        createNewFileAndWriteIntoIt(fileName);

        System.out.println("Please enter the name to create and write into ending with '.txt'");
        String fileName1 = input.next();
        System.out.println(readFromAnExistingFile(fileName1));
    }

    public static void createNewFileAndWriteIntoIt(String fileName) {
        StringBuffer sb = new StringBuffer(1000);
        Scanner input = new Scanner(System.in);
        try (FileOutputStream stream = new FileOutputStream(String.format("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\%s", fileName))) {  //try with resources
            System.out.println("Enter text");
            while (input.hasNext()) {
                sb.append(input.nextLine());        //stop with end-of-line break
            }
            stream.write(sb.toString().getBytes());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String readFromAnExistingFile(String fileName) {
        byte[] bytes = new byte[500];
        StringBuffer sb = new StringBuffer(1000);
        try (FileInputStream stream = new FileInputStream(String.format("C:\\Users\\Dean\\IdeaProjects\\Java-Projects\\src\\streams_io\\files\\%s", fileName))) {
            System.out.println("№ of bytes-> " + stream.read(bytes));      //method read reads the contents of the files (name.txt) into the byte array
            for (byte b : bytes) {      //the byte array then prints out the contents stored in it
                if (b != 0) {
                    sb.append(Character.toString(b));   //the contents stored in byte array are stored in numeric values, which are then converted toString
                }
            }
        } catch (IOException ex) {      //to use the class FileInputStream, you need to try and catch exceptions
            System.out.println(ex.getMessage());
        }
        return sb.toString();
    }
}
