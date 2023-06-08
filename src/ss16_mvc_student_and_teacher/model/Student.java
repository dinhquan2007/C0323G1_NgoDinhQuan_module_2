package ss16_mvc_student_and_teacher.model;

import java.util.Objects;

public class Student extends Person{
    private String classes;

    private String point;

    public Student(String id, String name, String birth, String gender, String classes, String point) {
        super(id, name, birth, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String getInfoToFileCSV() {
        return super.getInfoToFileCSV()+","+this.classes+","+this.point;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                ",classes='" + classes + '\'' +
                ",point='" + point + '\'' +
                '}';
    }
}
