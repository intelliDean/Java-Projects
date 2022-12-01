package chapter02;

class SquareAndCubeTest {
    public static void main(String[] args) {


        System.out.printf("%-10s%-10s%-10s%n", "Numbers", "Squares", "Cubes");
        int square, cube;
        for (int i = 1; i <= 10; i++){
            square = i * i;
            cube = i * i * i;

            System.out.printf("%-13d%-10d%-10d%n", i, square, cube);
        }
    }
    public static void square(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i * i);
        }
    }
    public static void cube(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(i * i * i);
        }
    }
}