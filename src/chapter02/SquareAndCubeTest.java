package chapter02;

class SquareAndCubeTest {
    public static void main(String[] args) {


        System.out.printf("%n%s%10s%10s", "Numbers", "Squares", "Cubes");
        int square = 0;
        int cube = 0;
        for (int i = 1; i <= 10; i++){
            square = i * i;
            cube = i * i * i;

            System.out.printf("%n%3d%11d%12d%n", i, square, cube);
        }
    }
}