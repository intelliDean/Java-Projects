package assignment;

public class SquareNumber {
    public int squareNumber(double number){
        return (int) (number * number);
    }
    public int squareAndNumber(double number) {
        return (int) (number + squareNumber(number));
    }
    public int numberIsGreaterThan100(double i) {
        int a = 0;
        if (squareAndNumber(i) > 100) {
            a = 1;
        }
        return a;
    }
    public int numberIsEqualsTo100(double i) {
       int a = 1;
       if (squareAndNumber(i) == 100) {
           a = 0;
       }
        return a;
    }
}
