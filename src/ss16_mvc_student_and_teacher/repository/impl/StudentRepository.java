package ss16_mvc_student_and_teacher.repository.impl;

import ss16_mvc_student_and_teacher.common.ReadAndWrite;
import ss16_mvc_student_and_teacher.model.Student;
import ss16_mvc_student_and_teacher.repository.IPersonRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IPersonRepository<Student> {
    private static List<Student> studentList=new ArrayList<>();
    ReadAndWrite readAndWrite=new ReadAndWrite();
    final String PATH_STUDENT="ss16_mvc_student_and_teacher/data/student.text";
//(String id, String name, String birth, String gender, String classes, String point)
    @Override
    public void add(Student s) {
        List<String> strings = new ArrayList<>();
        strings.add(s.getId()+","+s.getName()+","+s.getBirth()+","+s.getGender()+","+s.getClasses()+","+s.getPoint());
        readAndWrite.writeToFile(PATH_STUDENT,strings,true);
    }
    @Override
    public List<Student> getAll() {
        List<String> stringList= readAndWrite.readToFile(PATH_STUDENT);
        studentList.clear();
        String [] info;
        for (String s:stringList) {
            info=s.split(",");
            System.out.println(info[0]);
            studentList.add(new Student(info[0],info[1],info[2],info[3],info[4],info[5]));
        }
//        System.out.println(studentList);
        return studentList;
    }
    @Override
    public Student getById(String code) {
        studentList=getAll();
        for (Student s:studentList) {
            if (s.getId().equals(code)){
                return s;
            }
        }
        return null;
    }
    @Override
    public void remove(Student student) {
        studentList=getAll();
        studentList.remove(student);
        List<String> list=new ArrayList<>();
        for (Student s:studentList) {
            list.add(s.getId()+","+s.getName()+","+s.getBirth()+","+s.getGender()+","+s.getClasses()+","+s.getPoint());
        }

        readAndWrite.writeToFile(PATH_STUDENT,list,false);
    }
}
