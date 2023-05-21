package ss11_stack_queue.exercise.mvc.model;

public class Student extends Personnel {
    private String group;
    private int point;

    public Student(String id, String name, String birth, boolean gender, String group, int point) {
        super(id, name, birth, gender);
        this.point = point;
        this.group = group;
    }

    public int getPoint() {
        return point;
    }

    public String getGroup() {
        return group;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "group='" + group + '\'' +
                ", point=" + point +
                '}';
    }
}
