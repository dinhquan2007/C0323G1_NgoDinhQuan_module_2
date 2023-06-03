package case_study.repository.impl;

import case_study.comon.ReadAndWrite;
import case_study.model.person.Customer;
import case_study.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String CUSTOMER_PATH="case_study/data/customer.text";
    private final ReadAndWrite readAndWrite=new ReadAndWrite();
    private List<Customer> customerList=new ArrayList<>();



    @Override
    public List<Customer> getAll() {
        List<String> strings= readAndWrite.readFile(CUSTOMER_PATH);
        customerList.clear();
        String[] info=new String[9];
        for (String str:strings) {
            str.split(",");
            customerList.add(new Customer(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8]));
        }
        return customerList;
    }
    //    Customer(String code, String name, String birth, String gender, String cnnd,
    //    String phone, String email, String typeCustomer, String address)
    @Override
    public void add(Customer customer) {

    }

    @Override
    public Customer findById(String checkId) {
        return null;
    }
    
}
