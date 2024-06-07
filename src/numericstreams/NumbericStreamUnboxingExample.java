package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbericStreamUnboxingExample {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integerList) {
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(boxing());
        System.out.println(unboxing(boxing()));
        //unboxing(boxing()).forEach(value -> System.out.println(value));
    }

}
