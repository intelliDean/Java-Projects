package Practice;
/*Print multiplication table of 24, 50 and 29 using loop.*/
public class Multiplications {
    public static void main(String[] args) {
      for (int i = 1; i <= 12; i++) {
          int total1 = i * 12;
          int total2 = i * 50;
          int total3 = i * 29;
          System.out.printf("%d x %d = %d %7d x %d = %d %7d x %d = %d%n", 12, i, total1, 29, i, total3, 50, i, total2);
      }
    }
}
