package numericstreams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregate {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is"+ sum);
        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println(max.getAsInt());

        OptionalLong min = LongStream.rangeClosed(50,100).min();
        System.out.println(min.isPresent() ? min.getAsLong(): 0);

        OptionalDouble average = IntStream.rangeClosed(1,50).average();
        System.out.println(average.isPresent() ? average.getAsDouble(): 0);
    }
}
