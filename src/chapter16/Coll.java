package chapter16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coll {
    public static void main(String[] args) {
        List<String> collections = new ArrayList<>();

//        collections.add("My");
//        collections.add("name");
//        collections.add("is");
//        collections.add("Dean");
//        Collections.sort(collections);
//        System.out.println(collections);
//        for (String collection : collections) {
//            System.out.print(collection+" ");
//        }
//        System.out.println();
//        for (int i = 0; i < collections.size(); i++) {
//            System.out.print(collections.get(i)+" ");
//        }
//        // type casting (casting between same class)
//        double a = 3.8;
//        double b = 8.6;
//        int c = (int) (a + b);
//        System.out.println(c);
//
//        //boxing
//        int d = 4;
//        int e = 8;
//        Double f = (double)(d + e);
//        System.out.println(f);
//
//        //unboxing (casting between object and primitive type)
//        Double m = 9.8;
//        Double n = 2.9;
//        int o = (int) (m + n);
//        System.out.println(o);
//        Object name = 7;
//        name = "Dean";
//        System.out.println(name);
//        name = new int[]{3, 5, 6, 7};
//        name = 3.90;
//        
//        final int NUM = 59;




        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }
         int target = 12;
        int result = search(numbers, target);
        System.out.println(result);
    }
    public static int search(List<Integer> numbers, int target){
        int start = 0;
        int end = numbers.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbers.get(mid) < target) {
                start = mid + 1;
            } else if (numbers.get(mid) > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
