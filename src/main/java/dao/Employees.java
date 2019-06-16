package dao;

import java.util.List;

public interface Employees {
    List<Employee> all(int perPage, int pageNum);

    long insert(Employee emp);

}
