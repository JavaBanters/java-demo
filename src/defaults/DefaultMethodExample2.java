package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);

    static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);
    public static void sortByName(List<Student> studentList) {

        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList) {
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChain(List<Student> studentList) {
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }
    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        //sortByName(studentList);
        //sortByGpa(studentList);
        //comparatorChain(studentList);
        sortWithNullValues(studentList);
        //studentList.forEach(studentConsumer);
    }
}
