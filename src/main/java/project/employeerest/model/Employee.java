package project.employeerest.model;

import java.time.*;

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
}

