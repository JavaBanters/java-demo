package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    static Predicate<String> filterByGender = (student) ->
            student.equals("female");
    public static void filterStudents() {
         StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> filterByGender.negate().test(student.getGender())).collect(Collectors.toList())
                 .forEach(System.out::println);
    }
    public static void main(String[] args) {
        filterStudents();
    }

}
