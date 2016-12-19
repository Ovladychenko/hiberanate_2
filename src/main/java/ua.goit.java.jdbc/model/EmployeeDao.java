package ua.goit.java.jdbc.model;

import java.util.List;

/**
 * Created by Admin on 10.12.2016.
 */
public interface EmployeeDao {
    void save(Employee employee);
    Employee load(Long id);
    List<Employee> finaAll();
}
