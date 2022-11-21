package Practice;

import org.jetbrains.annotations.NotNull;

import java.security.SecureRandom;
import java.util.ArrayList;

public class MultiArrayList {
    public static void main(String[] args) {
        System.out.println(multi());
    }
    public static @NotNull ArrayList<Integer> printArrayList() {
        SecureRandom rand = new SecureRandom();
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 9; i++) {
            list.add(rand.nextInt(1 + 100));
        }
        return list;
    }
    public static @NotNull ArrayList<ArrayList<Integer>> multi() {
        SecureRandom rand = new SecureRandom();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            lists.add(new ArrayList<>());
        }
        for (ArrayList<Integer> list : lists) {
            for (int j = 0; j < 4; j++) {
                list.add(rand.nextInt(120));
            }
        }
        return lists;
    }
}
