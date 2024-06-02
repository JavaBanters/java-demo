package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentgpaPredicate = (student -> student.getGpa() >= 4.0);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(student -> {
                    System.out.println(student);
                })
                .peek(student -> {
                    System.out.println("After 1st filter"+student);
                })
                .filter(studentPredicate)
                .peek(student -> {
                    System.out.println("After 2nd filter"+student);
                })
                .filter(studentgpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);

    }

}
