package case_study.service.impl;

import case_study.comon.ReadAndWrite;
import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private final String NAME_REGEX="^([A-Z][a-z]*)(\\s([A-Z])[a-z]*){0,8}$";
    private final String BIRTH_REGEX="^(((0|1|2)\\d{1})|(30|31))/((0\\d{1})|(10|11|12))/(\\d{4})$";
    private final String CMND_REGEX="^\\d{9}|\\d{12}$";
    private final String PHONE_REGEX="^0\\d{9}$";
    private final String EMAIL_REGEX="^(.+)@(\\S+)$";
    ICustomerRepository customerRepository=new CustomerRepository();
    Scanner scanner=new Scanner(System.in);
    @Override
    public void displayAll() {
        List<Customer> customerList=customerRepository.getAll();
        for (Customer c:customerList) {
            System.out.println(c);
        }
    }

    //    Customer(String code, String name, String birth, String gender, String cnnd,
//    String phone, String email, String typeCustomer, String address)
    @Override
    public void add() {
        String code;
        do {
            System.out.println("please enter code customer 'KH-XXXX' ");
            code=scanner.nextLine();
            //    Customer(String code, String name, String birth, String gender, String cnnd,
            //    String phone, String email, String typeCustomer, String address)
            String CODE_REGEX = "^KH-\\d{4}$";
            if (!code.matches(CODE_REGEX)){
                System.out.println("please re-enter true format code 'KH-XXXX' ");
            }else if (customerRepository.findById(code)!=null){
                System.out.println("please re-enter new code,does exist code");
            }else {
                break;
            }
        }while (true);

        String name;
        do {
            System.out.println("please enter name customer");
            name=scanner.nextLine();
            if (name.matches(NAME_REGEX)){
                System.out.println("please name true format");
                break;
            }
        }while (true);
        String birth;
        do {
            System.out.println("please enter birth customer with type dd/mm/yyyy");
            birth=scanner.nextLine();
            if (!birth.matches(BIRTH_REGEX)){
                System.out.println("please re-enter birth true format");
                continue;
            }
            break;
        }while (true);
        String gender;
        do {

          break;
        }while (true);

        String cmnd;
        do {
            System.out.println("please enter cmnd true format");
            cmnd=scanner.nextLine();
            if (cmnd.matches(CMND_REGEX)) {
                System.out.println("please re-enter cmnd true format");
                break;
            }
        }while (true);
        String phone;

        String email;

        String typeCustomer;

        String address;

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void find() {

    }

    @Override
    public void getVoucher() {

    }
}
