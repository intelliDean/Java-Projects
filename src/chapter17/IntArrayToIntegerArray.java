package chapter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntArrayToIntegerArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 6};
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(integerArray);
        System.out.println(integerArray);




        IntStream n = Arrays.stream(new int[] {1,2,3,4,5,5});

    }
}
