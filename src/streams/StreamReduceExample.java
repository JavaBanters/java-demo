package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
       return integerList.stream()
                .reduce(1, (a,b) -> a *b);
    }

    public static Optional<Integer> performMultiplicationWithooutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce( (a,b) -> a *b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents()
                .stream().reduce((s1,s2) ->  s1.getGpa() > s2.getGpa() ? s1: s2);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList();
        System.out.println(performMultiplication(integers));
        System.out.println(performMultiplicationWithooutIdentity(integers).isPresent());
        System.out.println(getHighestGPAStudent().get());
    }

}
