package streams_io;

import java.io.DataInputStream;
import java.io.IOException;

public class Stream3 {
    public static void main(String[] args) {
        byte[] bytes = new byte[50];
        try(var data = new DataInputStream(System.in)) {
            System.out.println("Number Of Bytes Read -> "+data.read(bytes));
            for (byte aByte : bytes) {
                if (aByte != 0) {
                    System.out.print(Character.toString(aByte));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
