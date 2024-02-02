package com.avi.learning.java8;

import java.util.ArrayList;
import java.util.List;

public class TestJave8 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Avinash","IT",7000.00,7));
        employeeList.add(new Employee("Pradeep","HR",7100.00,6));
        employeeList.add(new Employee("Raman","ADMIN",82000.00,5));
        employeeList.add(new Employee("Suman","IT",6000.00,8));
        employeeList.add(new Employee("Rupam","ADMIN",4500.00,4));
        employeeList.add(new Employee("Adil","IT",5500.00,4));
        employeeList.add(new Employee("Champak","IT",4500.00,3));
        employeeList.add(new Employee("Suleman","HR",3900.00,4));


        employeeList.stream().forEach(employee -> System.out.println(employee));

        employeeList.stream().filter(employee -> employee.getDepartment().equals("IT")).forEach(employee -> System.out.println(employee.getName()));

        
    }
}
