package project.employeerest.model;

import java.time.*;
import java.util.Optional;

public class Employee {
    private int id;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private LocalDate dateOfBirtth;
    private LocalDate dateOfEmployment;
    private Boolean status;

    public Employee(int id, String firstName, String middleInitial, String lastName, LocalDate dateOfBirtth,
                    LocalDate dateOfEmployment, Boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.dateOfBirtth = dateOfBirtth;
        this.dateOfEmployment = dateOfEmployment;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName(){
        return lastName;
    }

    public LocalDate getDateOfBirtth() {
        return dateOfBirtth;
    }

    public LocalDate getDateOfEmployment(){
        return dateOfEmployment;
    }

    public Boolean getStatus(){
        return status;
    }
}

