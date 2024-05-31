package functional_interfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = name -> name.toUpperCase();
    static Function<String, String> addSomeString = name -> name.toLowerCase().concat(" majhi");
    public static void main(String[] args) {
        System.out.println(function.apply("anant"));
        System.out.println(function.andThen(addSomeString).apply("anant"));
        System.out.println(function.compose(addSomeString).apply("anant"));
    }

}
