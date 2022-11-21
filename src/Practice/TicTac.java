package Practice;

import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] ch = {{' ',' ',' '}, {' ', ' ',' '},{' ', ' ', ' '}};
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                System.out.print(ch[i][j] = input.next().charAt(0));

            }
            System.out.println();
        }
    }
}
