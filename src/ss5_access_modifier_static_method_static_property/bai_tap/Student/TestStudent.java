package ss5_access_modifier_static_method_static_property.bai_tap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Quân");
        System.out.println(student);
//        tương tự hàm khởi tạo có name
        Student phat=new Student("Phát");
        System.out.println(phat);
    }
}
