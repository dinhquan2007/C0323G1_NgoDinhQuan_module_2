package ss16_mvc_student_and_teacher.service.impl;

import ss16_mvc_student_and_teacher.model.Teacher;
import ss16_mvc_student_and_teacher.repository.IPersonRepository;
import ss16_mvc_student_and_teacher.repository.impl.TeacherRepository;
import ss16_mvc_student_and_teacher.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {

    private final Scanner scanner =new Scanner(System.in);
    private static final IPersonRepository teacherRepository= new TeacherRepository();
    @Override
    public void displayAll() {
        List<Teacher> teacherList=new ArrayList<>();
        for (Teacher t: teacherList) {
            System.out.println(t);
        }
    }

    @Override
    public void add() {
        System.out.println("nhập vào mã giáo viên");
        String code=scanner.nextLine();
        System.out.println("nhập vào tên giáo viên");
        String name=scanner.nextLine();
        System.out.println("nhập vào năm sinh giáo viên");
        String birth=scanner.nextLine();
        System.out.println("nhập vào giới tính giáo viên \n" +
                "1.nam\n" +
                "2.nữ\n" +
                "3.khác");
        String gender=scanner.nextLine();
        System.out.println("nhập vào chuyên môn giáo viên");
        String expertise=scanner.nextLine();
        Teacher teacher=new Teacher(code,name,birth,gender,expertise);
        teacherRepository.add(teacher);
        System.out.println("đã thêm giáo viên thành công");

    }

    @Override
    public void delete() {

    }
}
