package streams;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
       return integerList.stream()
                .reduce(Integer.MIN_VALUE, (a,b) -> Math.max(a,b));
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b) -> Math.max(a,b));
    }

    public static int findMinValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer.MAX_VALUE, (a,b) -> Math.min(a,b));
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b) -> Math.min(a,b));
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println(findMaxValue(integerList));
        System.out.println(findMinValue(integerList));
        System.out.println(findMaxValueOptional(integerList).get());
        System.out.println(findMinValueOptional(integerList).get());
    }

}
