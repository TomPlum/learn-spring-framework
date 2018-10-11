package com.example.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * This entity is used to track employee information. In this case, their name and job description.
 */
@Data
@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    private Employee() {}

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
