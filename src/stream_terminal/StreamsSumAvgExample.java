package stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static int sum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double avg() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(avg());
    }

}
