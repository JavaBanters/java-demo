package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        Student student =  null; //StudentDataBase.studentSupplier.get();
        if(student != null) {
            return student.getName();
        }else {
            return null;
        }
    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> student = Optional.ofNullable(null) ; //Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(student.isPresent()) {
            return student.map(Student::getName);
        }else {
            return Optional.empty();
        }
    }
    public static void main(String[] args) {
        String name = getStudentName();
        if(name != null) System.out.println(name.length());
        else System.out.println("name is null");

        Optional<String> name2 = getStudentNameOptional();
        if(name2.isPresent()) System.out.println(name2.get().length());
        else System.out.println("name not found");
    }
}
