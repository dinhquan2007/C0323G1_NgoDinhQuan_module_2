package case_study.repository;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();
    void add(T t);
}
