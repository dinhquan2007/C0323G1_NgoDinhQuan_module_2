package case_study.repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {

    Employee checkCode(String code);
}
