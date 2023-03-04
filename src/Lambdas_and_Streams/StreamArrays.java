package Lambdas_and_Streams;

import java.security.SecureRandom;
import java.util.stream.Stream;

public class StreamArrays {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(12, 32, 43, 89, 54, 78);
        stream.forEach(System.out :: println);

        Stream<Integer> emptyStream = Stream.empty();
        System.out.println("sksfjbs "+emptyStream);

        Stream<Integer> integerStream = Stream.generate(() -> new SecureRandom()
                .nextInt(80)).limit(20);

        integerStream.forEach((n)->System.out.print(n+" "));
    }
}
