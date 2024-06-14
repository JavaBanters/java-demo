package parallel_stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExampleOne {

    public static long sequentialPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return System.currentTimeMillis() - startTime;
    }

    public static long parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return System.currentTimeMillis() - startTime;
    }
    public static void main(String[] args) {
        System.out.println(sequentialPrintStudentActivities());
        System.out.println(parallelPrintStudentActivities());
    }
}
