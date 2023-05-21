package ss11_stack_queue.exercise.mvc.model;

public class Teacher extends Personnel {
    private String expertise;

    public Teacher(String id, String name, String birth, boolean gender, String expertise) {
        super(id, name, birth, gender);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "expertise='" + expertise + '\'' +
                '}';
    }
}
