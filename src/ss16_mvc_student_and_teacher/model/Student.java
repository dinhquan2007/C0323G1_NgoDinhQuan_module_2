package ss16_mvc_student_and_teacher.model;

import java.util.Objects;

public class Student extends Person{
    private String classes;

    private float point;

    public Student(String id, String name, String birth, String gender, String classes, float point) {
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

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String getInfoToFileCSV() {
        return super.getInfoToFileCSV()+','+this.classes+','+this.point;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "classes='" + classes + '\'' +
                ", point=" + point +
                '}';
    }


}
