package case_study.service.impl;

import case_study.comon.ReadAndWrite;
import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository=new CustomerRepository();
    @Override
    public void displayAll() {
        List<Customer> customerList=new ArrayList<>();




    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void getVoucher() {

    }
}
