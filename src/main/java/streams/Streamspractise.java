package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streamspractise {

    public static void main(String[] args) {


        // 1. Using Stream.of()
        Stream<String> stream1 = Stream.of("A", "B", "C");

        // 2. Using Arrays.stream()
        String[] arr = {"A", "B", "C"};
        Stream<String> stream2 = Arrays.stream(arr);

        // 3. Using Collection.stream()
        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> stream3 = list.stream();

        // 4. Using Stream.generate()
        Stream<Integer> stream4 = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);

        // 5. Using Stream.iterate()
        Stream<Integer> stream5 = Stream.iterate(0, n -> n + 1).limit(10);

        // 6. Using IntStream.range()
        IntStream stream6 = IntStream.range(1, 10); // inclusive start, exclusive end

        // 7. Using LongStream.range()
        LongStream stream7 = LongStream.range(1, 5);

        // 8. Using DoubleStream.of()
        DoubleStream stream8 = DoubleStream.of(1.1, 2.2, 3.3);

        // 9. Using Files.lines() to read lines from a file
     //   Stream<String> stream9 = Files.lines(Paths.get("file.txt"));

        // 10. Using Stream.concat() to combine streams
        Stream<String> combinedStream = Stream.concat(stream1, stream2);

    }
}