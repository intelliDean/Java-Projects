package chapter17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamToArray {
    public static void main(String[] args) {
        IntStream numbers = IntStream.rangeClosed(1, 6).map((int num)->{
                    if (num % 2 == 0) {
                        return num * 23;
                    } else {
                        return num * 20;
                    }
                }
        );
        System.out.println(Arrays.toString(numbers.toArray()));
    }
}
