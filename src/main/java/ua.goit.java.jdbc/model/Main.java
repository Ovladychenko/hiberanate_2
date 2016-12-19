package ua.goit.java.jdbc.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by Admin on 10.12.2016.
 */
public class Main {

    private EmployeeController employeeController;

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:application-context.xml", "classpath:hibernate-context.xml");
        Main main =applicationContext.getBean(Main.class);
        main.start();

    }

    private void start() {
        employeeController.createEmployee();
    }

    public void setEmployeeController(EmployeeController employeeController){
        this.employeeController=employeeController;

    }

    }
