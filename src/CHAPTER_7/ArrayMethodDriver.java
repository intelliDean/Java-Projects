package CHAPTER_7;

public class ArrayMethodDriver {
    public static void main(String[] args) {
        int [] numbers = {3,2,6,7,8,4,9,2,};

        ArrayMethod calculate = new ArrayMethod();
        System.out.printf("%n%s: %d%n%s: %.2f%n%s: %d%n",
                "Addition", calculate.add(numbers),
                "Average", calculate.average(numbers),
                "Multiplication", calculate.multiply(numbers));


    }
}
