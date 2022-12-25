package chapter17;

import java.io.Serializable;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {
        IntStream numbers = IntStream.rangeClosed(1, 6)
                .map((int num)->{
                            if (num % 2 == 0) {
                                return num * 23;
                            } else {
                                return num * 20;
                            }
                        }
                );

        int[] numArrays = numbers.toArray();
        //List<Integer> numberList = new ArrayList<>(Integer.valueOf(numArrays));
        System.out.println(Arrays.toString(numArrays));


        Stream<? extends Serializable> grades = IntStream.rangeClosed(1, 6)
                .mapToObj((int num)->{
                            if (num >= 30) {
                                return "You scored A";
                            } else {
                                return "You scored B";
                            }
                        }
                );

        System.out.println(Arrays.toString(grades.toArray()));
    }
}
