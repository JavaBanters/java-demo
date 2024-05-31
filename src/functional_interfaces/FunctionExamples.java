package functional_interfaces;

public class FunctionExamples {

    public static String performConcat(String str) {
       return FunctionExample.addSomeString.apply(str);
    }
    public static void main(String[] args) {
        String result = performConcat("hello");
        System.out.println(result);
    }

}
