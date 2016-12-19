package ua.goit.java.jdbc.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(generator="increment")
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="phoner_Number")
    private String phonerNumber;
    @Enumerated(EnumType.STRING)
    @Column(name="position")
    private Position position;
    @Column(name="salary")
    private Float salary;

    public Employee() {
    }

    public Employee(String name, String surname, String phonerNumber, Position position, float salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(String smith) {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {

        return phonerNumber;
    }

    public void setPhone(String phone) {
        this.phonerNumber = phone;
    }

    public Position getPosition(Position waiter) {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
