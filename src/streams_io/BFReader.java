package streams_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BFReader {
    public static void main(String[] args) {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the number");
            String string = buffer.readLine();      //buffer.readline acts as input.nextLine in Scanner, that takes input from a user on the terminal
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '_') {
                    System.out.print(string.charAt(i+1)+" ");
                }
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
