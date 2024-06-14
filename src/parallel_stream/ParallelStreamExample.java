package parallel_stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformance(Supplier<Integer> supplier, int numberOfTimes){
        long  startTime = System.currentTimeMillis();
        for(int i = 0; i< numberOfTimes; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static int sum_sequential_stream() {
        return IntStream.rangeClosed(1,100000)
                .sum();
    }

    public static int sum_parallel_stream() {
        return IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(checkPerformance(ParallelStreamExample::sum_sequential_stream, 20));
        System.out.println(checkPerformance(ParallelStreamExample::sum_parallel_stream,20));
    }
}
