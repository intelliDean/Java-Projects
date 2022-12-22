package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sync {
    public static void main(String[] args) {
        String[] names = {"Dean", "Michael", "Mike", "John", "Tobi", "Ayanfe"};
        System.out.println(Arrays.toString(names));
        List<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);
        List<String> syncNames = Collections.synchronizedList(namesList);
        System.out.println(syncNames);
        List<String> unmodName = Collections.unmodifiableList(namesList);
        System.out.println(unmodName);

        List<String> na  = new ArrayList<>(unmodName);
        na.add("king");
        System.out.println(na);
    }
}
