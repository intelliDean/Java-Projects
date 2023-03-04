package Lambdas_and_Streams;

import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Collectors;

public class SetPlay {
    public static void main(String[] args) {
        Set<Dean> child = Set.of(
                new Dean("Ife", 23),
                new Dean("Ayo", 12),
                new Dean("Oyin", 6)
        );

        System.out.println(child);

        System.out.println(child.stream().
                sorted().
                collect(Collectors.toList()));


    }
    record Dean(String name, int age) implements Comparable<Dean>{
        @Override
        public int compareTo(@NotNull Dean o) {
            return this.name.compareTo(o.name());
        }
    }
}
