package Chapter2;

import static org.junit.jupiter.api.Assertions.*;

class SquareAndCubeTest {
    public static void main(String[] args) {


        System.out.printf("%n%s%10s%10s", "Numbers", "Squares", "Cubes");
        int square = 0;
        int cube = 0;
        for (int i = 1; i <= 10; i++){
            square = i * 10;
            cube = i * 100;

            System.out.printf("%n%3d%11d%12d%n", i, square, cube);
        }
    }
}