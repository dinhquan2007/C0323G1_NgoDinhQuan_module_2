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
    private final String CODE_REGEX = "^KH-\\d{4}$";
    private final String NAME_REGEX = "^([A-Z][a-z]*)(\\s([A-Z])[a-z]*){0,8}$";
    private final String BIRTH_REGEX = "^(((0|1|2)\\d{1})|(30|31))/((0\\d{1})|(10|11|12))/(\\d{4})$";
    private final String CMND_REGEX = "^\\d{9}|\\d{12}$";
    private final String PHONE_REGEX = "^0\\d{9}$";
    private final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    ICustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer c : customerList) {
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
            code = scanner.nextLine();
            //    Customer(String code, String name, String birth, String gender, String cnnd,
            //    String phone, String email, String typeCustomer, String address)

            if (!code.matches(CODE_REGEX)) {
                System.out.println("please re-enter true format code 'KH-XXXX' ");
            } else if (customerRepository.findById(code) != null) {
                System.out.println("please re-enter new code,does exist code");
            } else {
                break;
            }
        } while (true);

        String name;
        do {
            System.out.println("please enter name customer");
            name = scanner.nextLine();
            if (name.matches(NAME_REGEX)) {
                System.out.println("please name true format");
                break;
            }
        } while (true);
        String birth;
        do {
            System.out.println("please enter birth customer with type dd/mm/yyyy");
            birth = scanner.nextLine();
            if (!birth.matches(BIRTH_REGEX)) {
                System.out.println("please re-enter birth true format");
                continue;
            }
            break;
        } while (true);
        String gender;
        String choice;
        do {
            System.out.println("please enter gender customer :\n" +
                    "1.Man\n" +
                    "2.Women");
            choice = scanner.nextLine();
            if (choice == "1") {
                gender = "Man";
                break;
            } else if (choice == "2") {
                gender = "Women";
                break;
            } else {
                System.out.println("please re-enter 1 or 2");
            }
        } while (true);

        String cmnd;
        do {
            System.out.println("please enter cmnd true format");
            cmnd = scanner.nextLine();
            if (!cmnd.matches(CMND_REGEX)) {
                System.out.println("please re-enter cmnd true format");
                continue;
            }
            break;
        } while (true);
        String phone;
        do {
            System.out.println("please enter phone number");
            phone = scanner.nextLine();
            if (!phone.matches(PHONE_REGEX)) {
                System.out.println("please re-enter phone true format ");
                continue;
            }
            break;
        } while (true);

        String email;
        do {
            System.out.println("please enter email type 'abc@gmail.com'");
            email = scanner.nextLine();
            if (!email.matches(EMAIL_REGEX)) {
                System.out.println("please enter email true format");
                continue;
            }
            break;
        } while (true);
//        Diamond, Platinum, Gold, Silver, Member).
        String typeCustomer;
        String selection;
        do {
            System.out.println("please select type :\n" +
                    "1.Member\n" +
                    "2.Silver\n" +
                    "3.Gold\n" +
                    "4.Platinum\n" +
                    "5.Diamond");
            selection = scanner.nextLine();
            switch (selection) {
                case "1":
                    typeCustomer = "Member";
                    break;
                case "2":
                    typeCustomer = "Silver";
                    break;
                case "3":
                    typeCustomer = "Gold";
                    break;
                case "4":
                    typeCustomer = "Platinum";
                    break;
                case "5":
                    typeCustomer = "Diamond";
                    break;
                default:
                    System.out.println("please select 1 to 5");
                    continue;
            }
            break;
        } while (true);
        String address;
        do {
            System.out.println("please enter address");
            address = scanner.nextLine();
            if (address == null) {
                System.out.println("please re-enter address");
                continue;
            }
            break;
        } while (true);
        customerRepository.add(new Customer(code, name, birth, gender, cmnd, phone, email, typeCustomer, address));

    }

    //    Customer(String code, String name, String birth, String gender, String cnnd,
//    String phone, String email, String typeCustomer, String address)
    @Override
    public void edit() {
        System.out.println("please enter code customer you want to delete");
        String checkId = scanner.nextLine();
        Customer customerEdit = customerRepository.findById(checkId);
        if (customerEdit != null) {
            System.out.println("You want to edit selection :\n" +
                    "1.edit code\n" +
                    "2.edit name\n" +
                    "3.edit birth\n" +
                    "4.edit gender\n" +
                    "5.edit cmnd\n" +
                    "6.edit phone\n" +
                    "7.edit email\n" +
                    "8.edit type customer\n" +
                    "9.edit address\n" +
                    "0.exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    String codeEdit;
                    do {
                        System.out.println("enter new code");
                        codeEdit = scanner.nextLine();
                        if (codeEdit.matches(CODE_REGEX)) {
                            customerEdit.setCode(codeEdit);
                            break;
                        } else {
                            System.out.println("please enter format CV-XXXX");
                        }
                    } while (true);
                    break;

                case "2":
                    String nameEdit;
                    do {
                        System.out.println("enter new name");
                        nameEdit = scanner.nextLine();
                        if (nameEdit.matches(NAME_REGEX)) {
                            customerEdit.setCode(nameEdit);
                            break;
                        } else {
                            System.out.println("please enter name true format ");
                        }
                    } while (true);
                    break;

                case "3":
                    String birthEdit;
                    do {
                        System.out.println("enter new birth");
                        birthEdit = scanner.nextLine();
                        if (birthEdit.matches(BIRTH_REGEX)) {
                            customerEdit.setCode(birthEdit);
                            break;
                        } else {
                            System.out.println("please re-enter birth true format dd/mm/yyyy");
                        }
                    } while (true);
                    break;
//                gender
                case "4":
                    String selection;
                    String genderEdit;
                    do {
                        System.out.println("enter new gender :\n" +
                                "1.Man\n" +
                                "2.Women");
                        selection = scanner.nextLine();
                        if (selection == "1") {
                            genderEdit = "Man";
                            customerEdit.setGender(genderEdit);
                            break;
                        } else if (selection == "2") {
                            genderEdit = "Women";
                            customerEdit.setGender(genderEdit);
                            break;
                        } else {
                            System.out.println("please re-enter 1 or 2");
                        }
                    } while (true);
                    break;
//                    cmnd

                case "5":
                    String cmndEdit;
                    do {
                        System.out.println("enter new cmnd");
                        cmndEdit = scanner.nextLine();
                        if (cmndEdit.matches(CMND_REGEX)) {
                            customerEdit.setCmnd(cmndEdit);
                            break;
                        } else {
                            System.out.println("please re-enter cmnd true format");
                        }
                    } while (true);
                    break;
//                    phone
                case "6":
                    String phoneEdit;
                    do {
                        System.out.println("enter new phone");
                        phoneEdit = scanner.nextLine();
                        if (phoneEdit.matches(PHONE_REGEX)) {
                            customerEdit.setPhone(phoneEdit);
                            break;
                        } else {
                            System.out.println("please re-enter phone true format");
                        }
                    } while (true);
                    break;
//                      email
                case "7":
                    String emailEdit;
                    do {
                        System.out.println("enter new email");
                        emailEdit = scanner.nextLine();
                        if (emailEdit.matches(EMAIL_REGEX)) {
                            customerEdit.setEmail(emailEdit);
                            break;
                        } else {
                            System.out.println("please re-enter email true format");
                        }
                    } while (true);
                    break;
//
                case "8":
                    String choose;
                    FLAG:
                    while (true) {
                        System.out.println("please select type :\n" +
                                "1.Member\n" +
                                "2.Silver\n" +
                                "3.Gold\n" +
                                "4.Platinum\n" +
                                "5.Diamond");
                        choose = scanner.nextLine();
                        switch (choose) {
                            case "1":
                                customerEdit.setTypeCustomer("Member");
                                break FLAG;
                            case "2":
                                customerEdit.setTypeCustomer("Silver");
                                break FLAG;
                            case "3":
                                customerEdit.setTypeCustomer("Gold");
                                break FLAG;
                            case "4":
                                customerEdit.setTypeCustomer("Platinum");
                                break FLAG;
                            case "5":
                                customerEdit.setTypeCustomer("Diamond");
                                break FLAG;
                            default:
                                System.out.println("please enter 1 to 5");
                        }
                    }
                    break;
//
                case "9":
                    String addressEdit;
                    do {
                        System.out.println("enter new position");
                        addressEdit = scanner.nextLine();
                        if (addressEdit != null) {
                            customerEdit.setAddress(addressEdit);
                            break;
                        }
                    } while (true);
                    break;
                case "0":
                    break;
            }
        } else {
            System.out.println("does not exist code :" + checkId);
            System.exit(1);
        }
    }


    @Override
    public void delete() {
        System.out.println("please enter code customer want to remove");
        String codeRemove = scanner.nextLine();
        Customer customerRemove = customerRepository.findById(codeRemove);
        if (customerRemove != null) {
            System.out.println("do you want to delete customer :" + codeRemove + "\n" +
                    "1.delete\n" +
                    "2.exit");
            String choice = scanner.nextLine();
            if (choice == "1") {
                customerRepository.remove(customerRemove);
            } else if (choice == "2") {
                System.exit(1);
            } else {
                System.out.println(" please select 1 or 2");
            }
        } else {
            System.out.println("code does not exist");
            System.exit(1);
        }
    }

    @Override
    public void find() {
        System.out.println("please enter code customer you want to find");
        String codeFind = scanner.nextLine();
        Customer customerFind = customerRepository.findById(codeFind);
        if (customerFind != null) {
            System.out.println(customerFind);
        } else {
            System.out.println("Does not find customer");
        }
    }

    @Override
    public void getVoucher() {

    }
}
