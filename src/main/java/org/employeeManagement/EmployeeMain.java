package org.employeeManagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emplist=new ArrayList<>();
        Employee employee1=new Employee(1,"Joe","Smith",200);
        Employee employee2=new Employee(2,"Adam","Smith",201);
        Employee employee3=new Employee(3,"King","Smith",202);
        Employee employee4=new Employee(4,"Mark","Smith",203);
        emplist.add(employee1);
        emplist.add(employee2);
        emplist.add(employee3);
        emplist.add(employee4);
        

        System.out.println(emplist);

    }
}
