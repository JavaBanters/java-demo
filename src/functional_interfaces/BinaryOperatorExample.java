package functional_interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
    static  BinaryOperator<Integer> binaryOperator = (a,b) -> a * b;
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(2,3));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(5,10));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(5,10));

    }

}
