package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static void  sortedStudentByName() {
         StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void  sortedStudentByGpa() {
        StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        sortedStudentByName();
        System.out.println("---------------");
        sortedStudentByGpa();
    }
}
