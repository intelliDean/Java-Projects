package chapter03.exercises;

public class Debug {  // i used this class to learn how to debug
    public static int sum(int... num) {
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
          System.out.println(sum(6,8,8,6,9,6,8,9,6,7,9,8,7,5,89,90));
    }
}
