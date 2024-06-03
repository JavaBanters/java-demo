package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student-> student.getGender().equals("female"))
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student-> student.getGender().equals("female"))
                .findFirst();
    }
    public static void main(String[] args) {
        //Optional<Student> result = findAnyStudent();
        Optional<Student> result = findFirstStudent();
        if(result.isPresent()) {
            System.out.println(result.get());
        }else {
            System.out.println("Student not found");
        }
    }

}
