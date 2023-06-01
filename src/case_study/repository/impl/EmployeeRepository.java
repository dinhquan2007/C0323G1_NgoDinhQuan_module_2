package case_study.repository.impl;

import case_study.comon.ReadAndWrite;
import case_study.model.person.Employee;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    List<Employee> employeeList=new ArrayList<>();
    ReadAndWrite readAndWrite=new ReadAndWrite();
  private static  final String EMPLOYEE_PATH="case_study/data/employee.text";

    @Override
    public List<Employee> getAll() {
    List<String> strings =readAndWrite.readFile(EMPLOYEE_PATH);
    employeeList.clear();
    String[] info;
        for (String str:strings) {
            info=str.split(",");
            employeeList.add(new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9]));
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee) {

    }


    @Override
    public Employee checkCode(String code) {
       employeeList=getAll();
        for (Employee e:employeeList) {
            if (e.getCode().equals(code)){
                return e;
            }
        }
        return null;
    }
}
