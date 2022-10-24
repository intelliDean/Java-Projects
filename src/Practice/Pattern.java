package Practice;

public class Pattern {
    static void square() {
        int columnLength = 18;
        int rowLength = columnLength / 2;
        for (int row = 1; row <= rowLength; row++) {
            for (int column = 1; column <= columnLength; column++) {
                if (row == 1 || row == rowLength || column == 1 || column == columnLength)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        square();
    }
}
