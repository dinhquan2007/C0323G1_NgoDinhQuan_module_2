package ss5_access_modifier_static_method_static_property.bai_tap.Student;

public class Student {
    private String name ="john";
    private  String classes="C03";
    public Student(){

    }
    public Student(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "TestStudent{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
