package case_study.service.impl;

import case_study.model.person.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    final String CODE_REGEX = "^NV-\\d{4}$";
    final String NAME_REGEX = "^([A-Z][a-z]*)(\\s([A-Z])[a-z]*){0,8}$";
    final String BIRTH_REGEX = "^(((0|1|2)\\d{1})|(30|31))/((0\\d{1})|(10|11|12))/(\\d{4})$";
    final String CMND_REGEX = "^\\d{9}|\\d{12}$";
    final String PHONE_REGEX = "^0\\d{9}$";
    final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    final String SALARY_REGEX = "^\\d{1,8}$";

    @Override
    public void displayAll() {
        List<Employee> list = employeeRepository.getAll();
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    //    Employee(String code, String name, String birth, String gender, String cnnd, String phone, String email, String level, String position, String salary)
    @Override
    public void add() {
        String code;
        do {
            System.out.println("enter code employee format 'NV-XXXX'");
            code = scanner.nextLine();
            if (employeeRepository.findById(code) != null) {
                System.out.println("has exist code");
                continue;
            }
            if (code.matches(CODE_REGEX)) {
                break;
            }
        } while (true);
        String name;
        do {
            System.out.println("enter name employee");
            name = scanner.nextLine();
        } while (!name.matches(NAME_REGEX));
        String birth;
        do {
            System.out.println("enter birth employee");
            birth = scanner.nextLine();
        } while (!birth.matches(BIRTH_REGEX));
        int choice;
        String gender;
        do {
            try {
                System.out.println("enter gender employee\n" +
                        "1.Man\n" +
                        "2.Women");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    gender = "Men";
                    break;
                } else if (choice == 2) {
                    gender = "Women";
                    break;
                } else {
                    System.out.println("re-enter number 1 or 2");
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("re-enter number 1 or 2");
            }
        } while (true);

        String cmnd;
        do {
            System.out.println("enter CNMD employee");
            cmnd = scanner.nextLine();
        } while (!cmnd.matches(CMND_REGEX));
        String phone;

        do {
            System.out.println("enter phone number employee");
            phone = scanner.nextLine();
        } while (!phone.matches(PHONE_REGEX));
        String email;
        do {
            System.out.println("enter email employee");
            email = scanner.nextLine();
        } while (!email.matches(EMAIL_REGEX));
        String level = "";
        do {
            System.out.println("enter level employee\n" +
                    "1.Intermediate\n" +
                    "2.College\n" +
                    "3.Undergraduate\n" +
                    "4.Graduate");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    level += "Intermediate";
                    break;
                case 2:
                    level += "College";
                    break;
                case 3:
                    level += "Undergraduate";
                    break;
                case 4:
                    level += "Graduate";
            }
        } while (choice < 1 || choice > 4);
        String position;
        System.out.println("enter position employee");
        position = scanner.nextLine();
        String salary;
        do {
            System.out.println("enter salary employee");
            salary = scanner.nextLine();
        } while (!salary.matches(SALARY_REGEX));
        Employee employee = new Employee(code, name, birth, gender, cmnd, phone, email, level, position, salary);
        employeeRepository.add(employee);
    }

    //    Employee(String code, String name, String birth, String gender, String cnnd, String phone, String email, String level, String position, String salary)
    @Override
    public void edit() {
        do {
            System.out.println("please enter code employee want edit");
            String checkId = scanner.nextLine();
            Employee employeeEdit = employeeRepository.findById(checkId);
            System.out.println("You want to edit selection :\n" +
                    "1.edit code employee\n" +
                    "2.edit name employee\n" +
                    "3.edit birth employee\n" +
                    "4.edit gender employee\n" +
                    "5.edit cmnd employee\n" +
                    "6.edit phone employee\n" +
                    "7.edit email employee\n" +
                    "8.edit level employee\n" +
                    "9.edit position employee\n" +
                    "10.edit salary employee\n" +
                    "0.exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String codeEdit;
                    do {
                        System.out.println("enter new code");
                        codeEdit = scanner.nextLine();
                        if (codeEdit.matches(CODE_REGEX)) {
                            employeeEdit.setCode(codeEdit);
                            break;
                        } else {
                            System.out.println("please enter format CV-XXXX");
                        }
                    } while (true);
                    break;

                case 2:
                    String nameEdit;
                    do {
                        System.out.println("enter new name");
                        nameEdit = scanner.nextLine();
                        if (nameEdit.matches(NAME_REGEX)) {
                            employeeEdit.setCode(nameEdit);
                            break;
                        } else {
                            System.out.println("please enter name true format ");
                        }
                    } while (true);
                    break;

                case 3:
                    String birthEdit;
                    do {
                        System.out.println("enter new birth");
                        birthEdit = scanner.nextLine();
                        if (birthEdit.matches(BIRTH_REGEX)) {
                            employeeEdit.setCode(birthEdit);
                            break;
                        } else {
                            System.out.println("please re-enter birth true format dd/mm/yyyy");
                        }
                    } while (true);
                    break;
//                gender
                case 4:
                    int selection;
                    String genderEdit;
                    do {
                        System.out.println("enter new gender :\n" +
                                "1.Man\n" +
                                "2.Women");
                        selection = Integer.parseInt(scanner.nextLine());
                        if (selection == 1) {
                            genderEdit = "Man";
                            employeeEdit.setGender(genderEdit);
                            break;
                        } else if (selection == 2) {
                            genderEdit = "Women";
                            employeeEdit.setGender(genderEdit);
                            break;
                        } else {
                            System.out.println("please re-enter 1 or 2");
                        }
                    } while (true);
                    break;
//                    cmnd

                case 5:
                    String cmndEdit;
                    do {
                        System.out.println("enter new cmnd");
                        cmndEdit = scanner.nextLine();
                        if (cmndEdit.matches(CMND_REGEX)) {
                            employeeEdit.setCmnd(cmndEdit);
                            break;
                        } else {
                            System.out.println("please re-enter cmnd true format");
                        }
                    } while (true);
                    break;
//                    phone
                case 6:
                    String phoneEdit;
                    do {
                        System.out.println("enter new phone");
                        phoneEdit = scanner.nextLine();
                        if (phoneEdit.matches(PHONE_REGEX)) {
                            employeeEdit.setPhone(phoneEdit);
                            break;
                        } else {
                            System.out.println("please re-enter phone true format");
                        }
                    } while (true);
                    break;
//                      email
                case 7:
                    String emailEdit;
                    do {
                        System.out.println("enter new email");
                        emailEdit = scanner.nextLine();
                        if (emailEdit.matches(EMAIL_REGEX)) {
                            employeeEdit.setEmail(emailEdit);
                            break;
                        } else {
                            System.out.println("please re-enter email true format");
                        }
                    } while (true);
                    break;
//
                case 8:
                    String choose;
                    do {
                        System.out.println("enter new level employee\n" +
                                "1.Intermediate\n" +
                                "2.College\n" +
                                "3.Undergraduate\n" +
                                "4.Graduate");
                        choose = scanner.nextLine();
                        if (choose == "1") {
                            employeeEdit.setLevel("Intermediate");
                            break;
                        } else if (choose == "2") {
                            employeeEdit.setLevel("College");
                            break;
                        } else if (choose == "3") {
                            employeeEdit.setLevel("Undergraduate");
                            break;
                        } else if (choose == "4") {
                            employeeEdit.setLevel("Graduate");
                            break;
                        } else {
                            System.out.println("re-enter 1-4");
                        }
                    } while (true);
                    break;
//                  position
                case 9:
                    String positionEdit;
                    System.out.println("enter new position");
                    positionEdit = scanner.nextLine();
                    employeeEdit.setPosition(positionEdit);
                    break;
//                  salary
                case 10:
                    String salaryEdit;
                    do {
                        System.out.println("enter new code");
                        salaryEdit = scanner.nextLine();
                        if (salaryEdit.matches(SALARY_REGEX)) {
                            employeeEdit.setSalary(salaryEdit);
                            break;
                        } else {
                            System.out.println("re-enter new salary true format");
                        }
                    } while (true);
                    break;
                case 0:
                    return;
            }
        } while (true);
    }

    @Override
    public void delete() {
        System.out.println("please enter code employee you want delete");
        String checkId=scanner.nextLine();
        Employee employeeDelete= employeeRepository.findById(checkId);
        if (employeeDelete ==null){
            System.out.println("does not exist employee with code :"+checkId);
        }else {
            employeeRepository.remove(employeeDelete);
        }
    }

    @Override
    public void find() {
        System.out.println("please enter code employee search ");
        String checkId=scanner.nextLine();
        Employee employee= employeeRepository.findById(checkId);
        if (employee ==null){
            System.out.println("does not exist employee with code :"+checkId);
        }else {
            System.out.println(employee.getCode() + "," + employee.getName() + "," + employee.getBirth() + "," + employee.getGender()
                    + "," + employee.getCmnd() + "," + employee.getPhone() + "," + employee.getEmail() + "," + employee.getLevel()
                    + "," + employee.getPosition() + "," + employee.getSalary());
        }
    }
}
