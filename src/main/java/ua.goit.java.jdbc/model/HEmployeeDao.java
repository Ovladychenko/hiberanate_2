package ua.goit.java.jdbc.model;


import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class HEmployeeDao implements EmployeeDao {
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);

    }

    @Override
    @Transactional
    public Employee load(Long id) {
        Employee result = sessionFactory.getCurrentSession().load(Employee.class, id);
        if(result == null) {
            throw new RuntimeException("Cannot find Employee by id: "+ id);
        }
        return result;
    }

    @Override
    @Transactional
    public List<Employee> finaAll() {
        return null;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
