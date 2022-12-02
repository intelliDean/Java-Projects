package assignment;

public class Diagonal {

    public static void main(String[] args) {
        int total = 0;
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }
        System.out.println(total);

        int total1 = 0;
        for (int i = array.length - 1; i > 0; i--) {
            total1 += array[i][i];
        }
        System.out.println(total);
    }
}
