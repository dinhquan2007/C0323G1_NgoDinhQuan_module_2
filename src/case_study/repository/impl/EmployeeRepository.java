package case_study.repository.impl;

import case_study.comon.ReadAndWrite;
import case_study.model.person.Employee;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private List<Employee> employeeList = new ArrayList<>();
    private final ReadAndWrite readAndWrite = new ReadAndWrite();
    private static final String EMPLOYEE_PATH = "case_study/data/employee.text";

    @Override
    public List<Employee> getAll() {
        List<String> strings = readAndWrite.readFile(EMPLOYEE_PATH);
        employeeList.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            employeeList.add(new Employee(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8], info[9]));
        }
        return employeeList;
    }

    //    Employee(String code, String name, String birth, String gender, String cnnd, String phone, String email, String level, String position, String salary)
    @Override
    public void add(Employee employee) {
        List<String> strings = new ArrayList<>();
        strings.add(getInfo(employee));
        readAndWrite.writeToFile(EMPLOYEE_PATH, strings, true);
    }

    @Override
    public Employee findById(String checkId) {
        employeeList = getAll();
        for (Employee e : employeeList) {
            if (e.getCode().equals(checkId)) {
                return e;
            }
        }
        return null;
    }

    //    Employee(String code, String name, String birth, String gender, String cnnd,
    //    String phone, String email, String level, String position, String salary)
    @Override
    public void remove(Employee employeeDelete) {
        List<String> strings = new ArrayList<>();
        employeeList = getAll();
        employeeList.remove(employeeDelete);
        for (Employee e : employeeList) {
            strings.add(getInfo(e));
        }
        readAndWrite.writeToFile(EMPLOYEE_PATH, strings, false);
    }

    @Override
    public void editWriteToFile() {
        List<String> strings = new ArrayList<>();
        employeeList = getAll();
        for (Employee e : employeeList) {
            strings.add(getInfo(e));
        }
        readAndWrite.writeToFile(EMPLOYEE_PATH, strings, false);
    }

    public String getInfo(Employee employee) {
        return employee.getCode() + "," + employee.getName() + "," + employee.getBirth() + "," + employee.getGender()
                + "," + employee.getCmnd() + "," + employee.getPhone() + "," + employee.getEmail() + "," + employee.getLevel()
                + "," + employee.getPosition() + "," + employee.getSalary();
    }
}
