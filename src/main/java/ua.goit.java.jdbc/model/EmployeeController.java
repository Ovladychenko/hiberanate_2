package ua.goit.java.jdbc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class EmployeeController {

    private EmployeeDao employeeDao;

    @Transactional
    public void createEmployee(){
        Employee employee=new Employee();
        employee.setId(1L);
        employee.setName("John");
        employee.setSurname("Smith");
        employee.setPhone("555-55-55");
        employee.setPosition(Position.WAITER);
        employee.setSalary(5000);

        employeeDao.save(employee);

    }
    @Autowired(required = true)
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
