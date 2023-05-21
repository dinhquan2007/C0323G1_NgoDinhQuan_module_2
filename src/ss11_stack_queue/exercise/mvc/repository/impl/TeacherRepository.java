package ss11_stack_queue.exercise.mvc.repository.impl;

import ss11_stack_queue.exercise.mvc.model.Student;
import ss11_stack_queue.exercise.mvc.model.Teacher;
import ss11_stack_queue.exercise.mvc.repository.IPersonnelRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements IPersonnelRepository {
    static List<Teacher> teacherList = new ArrayList<>();

    static {
        Teacher teacher = new Teacher("T-001", "Hai TT", "1998", true, "tutor");
        Teacher teacher2 = new Teacher("T-002", "Hai TT", "1998", true, "tutor");
        Teacher teacher3 = new Teacher("T-003", "Hai TT", "1998", true, "tutor");
        teacherList.add(teacher);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void add(Object object) {

    }

    @Override
    public Student getById(String Id) {

        return null;
    }
}
