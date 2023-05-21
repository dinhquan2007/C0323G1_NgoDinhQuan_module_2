package ss11_stack_queue.exercise.mvc.repository.impl;

import ss11_stack_queue.exercise.mvc.model.Student;
import ss11_stack_queue.exercise.mvc.repository.IPersonnelRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IPersonnelRepository {


    private static final List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("S-001", "Quân", "1998", true, "C0323G1", 5000));
        students.add(new Student("S-002", "Nhật", "1996", true, "C0323G1", 5600));
        students.add(new Student("S-003", "Tin", "1997", true, "C0323G1", 6000));
    }


    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void add(Object object) {
        students.add((Student) object);
    }

    @Override
    public Student getById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void remove(Object object) {
        students.remove(object);
    }
}
