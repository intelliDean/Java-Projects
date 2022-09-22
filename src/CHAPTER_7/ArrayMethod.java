package CHAPTER_7;

public class ArrayMethod {
    public double average(int [] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return (double) total/ numbers.length;
    }
    public int multiply (int [] numbers) {
        int total = 1;
        for (int number : numbers) {
            total *= number;
        }
        return total;
    }
    public int add(int [] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
