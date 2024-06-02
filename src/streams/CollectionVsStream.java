package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");
        names.add("Peter");

        names.remove(0);
        System.out.println(names);


       Stream<String> nameStream =  names.stream();
       nameStream.forEach(System.out::println);
       //nameStream.forEach(System.out::println);
    }

}
