package chapter02;

public class NumberWithSpace {
    public static void main(String[] args) {
        withSpace(1234567890);
    }
    public static void withSpace(int number) {
        String num = String.valueOf(number);
        char[] ch = num.toCharArray();
        for(char i : ch) {
            System.out.print(i+ ",  ");
        }
    }
}
