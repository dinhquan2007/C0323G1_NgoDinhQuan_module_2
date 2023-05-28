package ss16_mvc_student_and_teacher.model;

public class Teacher extends Person{
    private String expertise;

    public Teacher(String id, String name, String birth, String gender, String expertise) {
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
    public String getInfoToFileCSV() {
        return super.getInfoToFileCSV()+','+this.expertise;
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "expertise='" + expertise + '\'' +
                '}';
    }
}
