package CHAPTER_7;

public class XOXArray {
    public static void main(String[] args) {
        char[][] xoxo = new char[3][3];
        xoxo[0][0] = 'X';
        xoxo[0][1] = 'O';
        xoxo[0][2] = 'X';
        xoxo[1][0] = 'X';
        xoxo[1][1] = 'O';
        xoxo[1][2] = 'X';
        xoxo[2][0] = 'X';
        xoxo[2][1] = 'X';
        xoxo[2][2] = 'X';

        ticTacToe(xoxo);
    }
    public static char[][] xox(){
        char[][] xoxo = new char[3][3];
        xoxo[0][0] = 'X';
        xoxo[0][1] = 'O';
        xoxo[0][2] = 'X';
        xoxo[1][0] = 'X';
        xoxo[1][1] = 'O';
        xoxo[1][2] = 'X';
        xoxo[2][0] = 'X';
        xoxo[2][1] = 'X';
        xoxo[2][2] = 'X';
        return xoxo;
    }
    public static void xoxo(){
        char[][] xoxo = new char[3][3];
        for (int i = 0; i < xoxo.length; i++) {
            for (int j = 0; j < xoxo[i].length; j++) {
                if ( (i < 2 & j % 2 == 0) | (i == 2 & j < 2)) {
                    System.out.print('x'+"   ");
                } else {
                    System.out.print('o'+"   ");
                }
            }
            System.out.println();
        }
    }
    public static void ticTacToe(char[][] xoxo){
        for (char[] xo : xoxo) {
            for (char x : xo) {
                System.out.print(x + "  ");
            }
            System.out.println();
        }
    }
}
