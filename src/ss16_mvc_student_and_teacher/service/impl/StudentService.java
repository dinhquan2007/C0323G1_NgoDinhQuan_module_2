package ss16_mvc_student_and_teacher.service.impl;

import ss16_mvc_student_and_teacher.model.Student;
import ss16_mvc_student_and_teacher.repository.IPersonRepository;
import ss16_mvc_student_and_teacher.repository.impl.StudentRepository;
import ss16_mvc_student_and_teacher.service.IPersonService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService {
    private static  Scanner scanner = new Scanner(System.in);
    private static IPersonRepository studentRepository = new StudentRepository();

    @Override
    public void displayAll() {
        List studentList= studentRepository.getAll();
        try {
            for (Object s : studentList) {
                System.out.println(s);
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("list is empty");
        }
    }

    @Override
    public void add() {
        System.out.println("nhập vào mã học viên");
        String code = scanner.nextLine();
        System.out.println("nhập vào tên học viên");
        String name = scanner.nextLine();
        System.out.println("nhập vào năm sinh học viên");
        String birth = scanner.nextLine();
        System.out.println("nhập vào giới tính học viên\n" +
                "1.nam\n" +
                "2.nữ\n" +
                "3.khác");
        int chose = Integer.parseInt(scanner.nextLine());
        String gender = null;
        switch (chose){
            case 1:
                gender="nam";
                break;
            case 2:
                gender="nữ";
                break;
            case 3:
                gender="khác";
                break;
            default:
                System.out.println("không hợp lệ");
        }
        System.out.println("nhập vào lớp học viên");
        String classes = scanner.nextLine();
        System.out.println("nhập vào điểm học viên");
        String point = scanner.nextLine();
        studentRepository.add(new Student(code, name, birth, gender, classes, point));
        System.out.println("đã thêm học viên thành công");
    }

    @Override
    public void delete() {
        System.out.println("bạn muốn xóa sinh viên qua :\n" +
                "1.mã sinh viên \n" +
                "2.Tên học sinh\n");
        int chose= Integer.parseInt(scanner.nextLine());
        switch (chose){
            case 1:
                System.out.println("nhập vào mã hs");
                String code= scanner.nextLine();
                Student studentDelete= (Student) studentRepository.getById(code);
                if (studentRepository.getById(code)!=null){
                    studentRepository.remove(studentDelete);
                }
        }
    }
}
