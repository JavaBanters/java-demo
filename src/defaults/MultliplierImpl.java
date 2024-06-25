package defaults;

import java.util.List;

public class MultliplierImpl implements  Multiplier{
    @Override
    public int multliply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(x,y) -> x * y);
    }

    @Override
    public int size(List<Integer> integerList) {
        System.out.println("Override");
        return integerList.size();
    }
}
