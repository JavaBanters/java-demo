package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> student = Optional.ofNullable(null);
        return  student.map(Student::getName).orElse("Default");
    }

    public static String optionalOrElseGet() {
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        return  student.map(Student::getName).orElseGet(() -> "Default");
    }

    public static String optionalOrElseThrow() {
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        return  student.map(Student::getName).orElseThrow(() -> new RuntimeException("Exception caused"));
    }
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }

}
