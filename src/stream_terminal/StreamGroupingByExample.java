package stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static Map<String, List<Student>> groupStudentsByGender(){
        Map<String, List<Student>> studentMap  = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.toList()));

        return studentMap;
    }

    public static Map<String, List<Student>> groupStudentsByGpa(){
        Map<String, List<Student>> studentMap  = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));

        return studentMap;
    }

    public static Map<Integer, Map<String,List<Student>>> twoLevelGrouping_1() {
        Map<Integer, Map<String,List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        return studentMap;
    }

    public static Map<Integer, Integer> twoLevelGrouping_2() {
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBooks)));
        return studentMap;
    }

    public static Map<String, Integer> twoLevelGrouping_3() {
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
        return studentMap;
    }

    public static LinkedHashMap<String, Set<Student>>  threeLevelGrouping_1() {
        LinkedHashMap<String, Set<Student>> studentLinkedHashmap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
        return studentLinkedHashmap;
    }

    public static void calculateTopGpa() {
       Map<Integer,Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptional);
    }

    public static void calculateTopGpaAvoidOptional() {
        Map<Integer,Student> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        System.out.println(studentMap);
    }

    public static void calculateLeastGpaAvoidOptional() {
        Map<Integer,Student> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        System.out.println(studentMap);
    }
    public static void main(String[] args) {
        System.out.println(groupStudentsByGender());
        System.out.println(groupStudentsByGpa());
        System.out.println(twoLevelGrouping_1());
        System.out.println(twoLevelGrouping_2());
        System.out.println(twoLevelGrouping_3());
        System.out.println(threeLevelGrouping_1());
        calculateTopGpa();
        calculateTopGpaAvoidOptional();
        calculateLeastGpaAvoidOptional();
    }
}
