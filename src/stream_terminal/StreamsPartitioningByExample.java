package stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {

    public static  Map<Boolean, List<Student>>  partitioningBy_1() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> partioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        return partioningMap;
    }

    public static  Map<Boolean, Set<Student>>  partitioningBy_2() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> partioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));

        return partioningMap;
    }
    public static void main(String[] args) {
        System.out.println(partitioningBy_1());
        System.out.println(partitioningBy_2());
    }
}
