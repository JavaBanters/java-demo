package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        student.filter(s -> s.getGpa() >= 3.5)
                .ifPresent(student1 -> System.out.println(student1));
    }

    public static void optionalMap() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if(student.isPresent()) {
            student.filter(s -> s.getGpa() >= 3.5)
                    .map(Student::getName)
                    .ifPresent(student1 -> System.out.println(student1));
        }
    }

    public static void optionalFlatmap() {
        Optional<Student> student = Optional.ofNullable(StudentDataBase.getOptionalStudent().get());

        if(student.isPresent()) {
            student.filter(s -> s.getGpa() >= 3.5)
                    .flatMap(Student::getBike)
                    .map(Bike::getName)
                    .ifPresent(bike -> System.out.println(bike));
        }
    }
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatmap();
    }

}
