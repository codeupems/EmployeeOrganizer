package dao;

import java.util.List;

public interface Employees {
    List<Employee> all(int perPage, int pageNum);
    List<Employee> all();
    List<Employee> search(String searchQuery);

    long insert(Employee emp);

}
