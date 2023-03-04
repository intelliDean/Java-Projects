package funtional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterface {
    //TODO: Bi-consumer takes two parameters and consume them in the implementation but returns no value, returns VOID
    public static void main(String[] args) {
    //==================================================================================================================
        BiConsumer<int[], int[]> doubleArrays =
                (array1, array2) -> System.arraycopy(array1, 0, array2, 0, array1.length);

        int[] array1 = {23, 54, 65, 76, 87, 23, 65, 34};
        int[] array2 = new int[array1.length];

        System.out.println(Arrays.toString(array2));

        doubleArrays.accept(array1, array2);
        System.out.println(Arrays.toString(array2));

    //==================================================================================================================
    BiConsumer<String, Integer> biConsumer =
            (name, salary) ->System.out.printf("My name is %s and I earn $%d%n", name, salary);


    biConsumer.accept("Dean", 2343890);

    //==================================================================================================================


    BiConsumer<List<String>, int[]> consumer1 = BiConsumerInterface :: doSomething;   // BiConsumerInterface::doSomething;

        List<String> name = new ArrayList<>();
        name.add("Mike");
        name.add("Dean");
        name.add("James");
        name.add("Jym");
        name.add("Shegz");
        name.add("Michael");
        int[] salary = {23400, 748393, 493970, 533432, 435383, 234312};

        consumer1.accept(name, salary);
    }
    public static void doSomething(List<String> name, int[] salary) {
        for (int i = 0; i < salary.length; i++) {
            System.out.printf("%-8s: %,-8d%n",name.get(i), salary[i]);
        }
    }
}
