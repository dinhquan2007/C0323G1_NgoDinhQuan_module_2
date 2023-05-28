package ss16_mvc_student_and_teacher.controller;

import ss12_collection_framework.exercise.product_manager.service.impl.ProductService;
import ss16_mvc_student_and_teacher.service.IPersonService;
import ss16_mvc_student_and_teacher.service.impl.StudentService;
import ss16_mvc_student_and_teacher.service.impl.TeacherService;

import java.util.Scanner;

public class PersonController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPersonService studentService = new StudentService();
    private static final IPersonService teacherService = new TeacherService();

    public static void menu() {
        while (true) {
            System.out.println("Vui lòng chọn chức năng :\n"
                    + "1.Hiển thị danh sách học viên hoặc giáo viên\n"
                    + "2.thêm học viên hoặc giáo viên\n"
                    + "3.xóa học viên hoặc giáo viên\n"
                    + "0.thoát chương trình\n");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 0:
                    System.out.println("Cảm ơn bạn đã đến với chương trình quản lý nhân sự chúng tôi");
                    break;
                case 1:
                    System.out.println("1.hiển thị danh sách học viên\n"
                            + "2.hiển thị danh sách giáo viên\n"
                            + "3.hiển thị danh sách giáo viên và học sinh\n"
                            + "0.quay lại\n");
                    chose = Integer.parseInt(scanner.nextLine());
                    switch (chose) {
                        case 1:
                            studentService.displayAll();
                            break;
                        case 2:
                            teacherService.displayAll();
                            break;
                        case 3:
                            studentService.displayAll();
                            teacherService.displayAll();
                            break;
                        case 0:
                            continue;
                    }
                    break;

                case 2:
                    System.out.println("1.thêm học viên\n"
                            + "2.thêm giáo viên\n"
                            + "0.quay lại\n");
                    chose = Integer.parseInt(scanner.nextLine());
                    switch (chose) {
                        case 0:
                            continue;
                        case 1:
                            studentService.add();
                            break;
                        case 2:
                            teacherService.add();
                            break;

                    }
                    break;
                case 3:
                    System.out.println("1.xóa học viên\n"
                            + "2.Xóa giáo viên\n"
                            + "0.quay lại\n");
                    chose = Integer.parseInt(scanner.nextLine());
                    switch (chose) {
                        case 0:
                            continue;
                        case 1:
                            studentService.delete();
                            break;
                        case 2:
                            teacherService.delete();
                            break;
                    }
                    break;
            }
        }

    }
}
