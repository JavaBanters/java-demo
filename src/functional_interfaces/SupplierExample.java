package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Emily",3,4.0,"female", 12, Arrays.asList("swimming", "gymnastics","aerobics"));
        };

        Supplier<List<Student>> studentSupplierList = () -> {
            return StudentDataBase.getAllStudents();
        };

        //System.out.println(studentSupplier.get());
        studentSupplierList.get().stream().filter(s-> PredicateStudentExample.p1.test(s)).forEach(System.out::println);
    }

}
