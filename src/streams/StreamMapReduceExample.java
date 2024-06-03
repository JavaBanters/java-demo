package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample  {

    public static int noOfNotebooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0, (a,b) -> a+b);
                .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(noOfNotebooks());
    }

}
