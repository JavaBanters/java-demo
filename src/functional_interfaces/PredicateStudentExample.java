package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = student -> {
        return student.getGradeLevel() >= 3;
    };

    static Predicate<Student> p2 = student -> {
        return student.getGpa() >= 3.9;
    };

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterStudentByGradeLevel() {
       studentList.forEach(student -> {
           if(p1.test(student)) {
               System.out.println(student);
           }
       });
    }

    public static void filterStudentByGpa() {
        studentList.forEach(student -> {
            if(p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudents() {
        studentList.forEach(student -> {
            if(p1.and(p2).negate().test(student)) {
                System.out.println(student);
            }
        });
    };
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        System.out.println("------------");
        filterStudentByGpa();
        System.out.println("------------");
        filterStudents();
        System.out.println("------------");
    }

}
