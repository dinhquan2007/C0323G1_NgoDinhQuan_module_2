package case_study.repository.impl;

import case_study.comon.ReadAndWrite;
import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_PATH = "case_study/data/customer.text";
    private final ReadAndWrite readAndWrite = new ReadAndWrite();
    private List<Customer> customerList = new ArrayList<>();


    @Override
    public List<Customer> getAll() {
        List<String> strings = readAndWrite.readFile(CUSTOMER_PATH);
        customerList.clear();
        String[] info = new String[9];
        for (String str : strings) {
            str.split(",");
            customerList.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
        }
        return customerList;
    }

    //    Customer(String code, String name, String birth, String gender, String cnnd,
    //    String phone, String email, String typeCustomer, String address)
    @Override
    public void add(Customer customer) {
        List<String> strings = new ArrayList<>();
        strings.add(getInfo(customer));
        readAndWrite.writeToFile(CUSTOMER_PATH, strings, true);
    }

    @Override
    public Customer findById(String checkId) {
        customerList = getAll();
        for (Customer customer : customerList) {
            if (customer.getCode().equals(checkId)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public String getInfo(Customer customer) {
        return customer.getCode() + "," + customer.getName() + "," + customer.getBirth() + "," + customer.getGender() + "," + customer.getCmnd() +
                "," + customer.getPhone() + "," + customer.getEmail() + "," + customer.getTypeCustomer() + "," + customer.getAddress();
    }

    @Override
    public void remove(Customer customer) {
        List<String> strings = new ArrayList<>();
        customerList = getAll();
        customerList.remove(customer);
        for (Customer c : customerList) {
            strings.add(getInfo(c));
        }
        readAndWrite.writeToFile(CUSTOMER_PATH, strings, false);
    }

    @Override
    public void editWriteToFile() {

    }

}
