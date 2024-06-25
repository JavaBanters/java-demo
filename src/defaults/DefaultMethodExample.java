package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");

        ///Collections.sort(stringList);
        System.out.println(stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println(stringList);

        stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);

    }

}
