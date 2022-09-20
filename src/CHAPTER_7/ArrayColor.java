package CHAPTER_7;

public class ArrayColor {
    public static void main(String[] args) {

//        String [] color = new String[7];

        String [] color  = {"Blue", "Green", "Yellow", "White", "Black", "Red", "Indigo"};

        for (int i = 0; i < color.length; i++ ) {
            int num = 1 + i;
            System.out.printf("%n%d: %s", num, color[i]);
        }
    }
}
