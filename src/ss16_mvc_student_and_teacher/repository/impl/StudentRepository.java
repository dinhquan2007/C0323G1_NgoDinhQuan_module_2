package ss16_mvc_student_and_teacher.repository.impl;

import ss16_mvc_student_and_teacher.model.Student;
import ss16_mvc_student_and_teacher.repository.IPersonRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IPersonRepository {
    private static List<Student> studentList=new ArrayList<>();

     static {
         studentList.add(new Student("a","bánm","1999","nam","c12",10));
         studentList.add(new Student("b","bánm","1999","nam","c12",10));
         studentList.add(new Student("c","bánm","1999","nam","c12",10));
         studentList.add(new Student("d","bánm","1999","nam","c12",10));
         studentList.add(new Student("e","bánm","1999","nam","c12",10));
     }

    @Override
    public void add(Object obj) {

    }

//    @Override
//    public  Student searchWithByCode(String code) {
//        return
//    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public Student getById(String code) {
        for (Student s:studentList) {
            if (code.equals(s.getId())) {
                return s;
            }
        }
        return null;
    }

}
