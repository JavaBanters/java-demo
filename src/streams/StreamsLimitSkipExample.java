package streams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream()
                .limit(3)
                .reduce((x,y) -> x+y);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                .skip(4)
                .reduce((x,y) -> x+y);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println(limit(integerList).get());
        System.out.println(skip(integerList).get());
    }

}
