package case_study.repository;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();
    void add(T t);
    T findById(String checkId);
    String getInfo(T t);

    void remove(T t);

    void editWriteToFile();
}
