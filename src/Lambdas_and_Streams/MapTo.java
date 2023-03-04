package Lambdas_and_Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MapTo {
    public static void main(String[] args) {
        Integer[] numbers = {12, 13, 14, 15, 17};

        System.out.println(Arrays.stream(numbers).map(x->age(x))
                .collect(Collectors.toList()));

        int[] arrays = {12, 18, 14, 9, 29};
        System.out.println(Arrays.stream(arrays)
                .mapToObj(x->age(x))
                .collect(Collectors.toList()));

    }
    public static DeanHuman  age(int age) {
        return new DeanHuman("Dean", age);
    }

    record DeanHuman(String name, int age) {}
}
