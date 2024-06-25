package defaults;

import java.util.Arrays;
import java.util.List;

public class MultlipierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultliplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);
        int result = multiplier.multliply(integerList);
        System.out.println(result);
        System.out.println(multiplier.size(integerList));
        System.out.println(Multiplier.isEmpty(integerList));
    }
}
