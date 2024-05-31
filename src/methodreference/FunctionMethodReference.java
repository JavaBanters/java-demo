package methodreference;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();

    static Function<String, String> toUpperCaseLambdaWithMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("anant"));
        System.out.println(toUpperCaseLambdaWithMethodReference.apply("majhi"));
    }

}
