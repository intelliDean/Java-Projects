package CHAPTER_7.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutAppFunctions {
    private static ArrayList<String> item = new ArrayList<>();
    private static int count = 0;
    public static void setItem(String itemName) {
        for (int i = 0; i < item.size(); i++) {
            CheckOutAppFunctions.item.add(itemName);
            ++count;
        }
    }
    public static void getItem(ArrayList<String> item){
        for (int i = 0; i < count; i++) {
            item.get(i);
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




    }
}
