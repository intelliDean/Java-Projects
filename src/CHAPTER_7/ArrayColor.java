package CHAPTER_7;

public class ArrayColor {
    public static void main(String[] args) {
        String [] color  = {"Blue", "Green", "Yellow", "White", "Black", "Red", "Indigo"};
        for (int i = 0; i < color.length; i++ ) {
            System.out.printf("%d: %s%n", i + 1, color[i]);
        }
    }
}
