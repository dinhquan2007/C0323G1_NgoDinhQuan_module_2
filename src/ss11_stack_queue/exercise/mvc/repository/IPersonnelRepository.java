package ss11_stack_queue.exercise.mvc.repository;

import ss11_stack_queue.exercise.mvc.model.Student;

import java.util.List;

public interface IPersonnelRepository {
    List getAll();

    void add(Object object);

    Student getById(String Id);

    void remove(Object object);

}
