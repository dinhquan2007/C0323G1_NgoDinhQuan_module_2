package ss16_mvc_student_and_teacher.repository;

import ss16_mvc_student_and_teacher.model.Student;

import java.util.List;

public interface IPersonRepository<E> {
    void add(E e);

//    boolean searchWithByCode(String code);

    List<E> getAll();

    E getById(String code);

    void remove(E e);
}
