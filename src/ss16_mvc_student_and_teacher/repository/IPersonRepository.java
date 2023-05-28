package ss16_mvc_student_and_teacher.repository;

import ss16_mvc_student_and_teacher.model.Student;

import java.util.List;

public interface IPersonRepository {
    void add(Object obj);

//    boolean searchWithByCode(String code);

    List<Student> getAll();

    Student getById(String code);

//    boolean searchWithByCode(String code);
}
