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
    final String CODE_REGEX="^NV-\\d{4}";
   final String NAME_REGEX="";
   final String BIRTH_REGEX="";
   final String GENDER_REGEX="";
   final String CMND_REGEX="";
   final String PHONE_REGEX="";
   final String EMAIL_REGEX="";
   final String LEVEL_REGEX="";
   final String POSITION_REGEX="";
   final String SALARY_REGEX="";


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
          System.out.println("enter code employee format 'CV-XXXX'");
           code= scanner.nextLine();
          if (employeeRepository.checkCode(code) != null) {
              System.out.println("has exist code");
              continue;
          }
          if (code.matches(CODE_REGEX)){
              break;
          }
      }while (true);
            String name;
            String birth;
            String gender;
            String cmnd;
            String phone;
            String email;
            String level;
            String position;
            String salary;
            do {
                System.out.println("enter name employee");
                name = scanner.nextLine();
            }while (!name.matches(NAME_REGEX));

            do {
                System.out.println("enter birth employee");
                birth = scanner.nextLine();
            }while (!birth.matches(BIRTH_REGEX));
        int choice;
            do {
                System.out.println("enter gender employee\n" +
                        "1.Man" +
                        "2.Woman");
               choice = Integer.parseInt(scanner.nextLine());
            }while (choice<1||choice>2);
               gender = (choice==1?"Men":"Women");
            do {
                System.out.println("enter CNMD employee");
                cmnd = scanner.nextLine();
            }while ();

            do {
                System.out.println("enter phone number employee");
                phone = scanner.nextLine();
            }while ();

           do {
               System.out.println("enter email employee");
               email = scanner.nextLine();
           }while ();

           do {
               System.out.println("enter level employee");
               level = scanner.nextLine();
           }while ();

           do {
               System.out.println("enter position employee");
               position = scanner.nextLine();
           }while ();

            do {
                System.out.println("enter salary employee");
                salary = scanner.nextLine();
            }while ();

    }

    @Override
    public void edit() {

    }
}
