package assignment;

public class NumberSquareCube {
    public static void numberManipulation(int number) {
        System.out.printf("%n%s%10s%10s", "Numbers", "Squares", "Cubes");
        int square, cube;
        for (int i = 1; i <= number; i++){
            square = i * i;
            cube = i * i * i;

            System.out.printf("%n%3d%11d%12d", i, square, cube);
        }
    }
}
