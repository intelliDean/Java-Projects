package chapter15;

import java.io.FileInputStream;
import java.io.InputStream;

public class SystemSet {
    public static void main(String[] args) throws Exception {

        String name = "My name is Dean";

        InputStream stream = new FileInputStream(name);
        System.setIn(stream);

        char ch = (char) System.in.read();
        System.out.println(ch);
    }
}
