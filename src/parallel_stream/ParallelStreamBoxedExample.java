package parallel_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static long sequentialSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        integerList.stream()
                .reduce(0, (x,y) -> x +y);
        return System.currentTimeMillis() - start;
    }

    public static long parallelSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        integerList.stream()
                .parallel()
                .reduce(0, (x,y) -> x +y);
        return System.currentTimeMillis() - start;
    }
    public static void main(String[] args) {
       List<Integer> integerList =  IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(sequentialSum(integerList));
        System.out.println(parallelSum(integerList));
    }

}
