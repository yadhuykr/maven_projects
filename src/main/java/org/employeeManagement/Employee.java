package org.employeeManagement;

import lombok.Data;

@Data
public class Employee {
    int id;
    String firstName;
    String lastName;
    float salary;

    public Employee(int id, String firstName, String lastName, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
}
