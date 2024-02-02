package com.avi.java8Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest {

    public static void main(String[] args) throws Exception{
        //Employee employee = new Employee();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1001,"Avinash","IT",29,7000.00));
        employeeList.add(new Employee(1002,"Ramiz","ADMIN",28,8000.00));
        employeeList.add(new Employee(1004,"Saddam","IT",31,8500.00));
        employeeList.add(new Employee(1003,"Prakhar","HR",27,5000.00));

        List<Employee> outputEmployee = null;
        Employee emp = null;

        //Optional<Employee> optional = Optional.empty();
        Optional<List<Employee>> optional = Optional.of(employeeList);
        Optional<Employee> optionalEmpty = Optional.ofNullable(emp);

        System.out.println(optional.isEmpty());
        System.out.println(optionalEmpty.isEmpty());
        optionalEmpty.ifPresent(System.out::println);

       // new ArrayList<>().add(new Employee());

       // Employee emp1 = optionalEmpty.orElse(new Employee(1005,"Vikash","HR",32,5400.00));
        Employee emp1 = optionalEmpty.orElseThrow(IllegalAccessError::new);
        System.out.println(emp1);

       // Optional<Employee> maybeUSB = Optional.ofNullable(emp);;
      //  maybeUSB.filter(usb -> "3.0".equals(emp.getSalary());
                //.ifPresent(() -> System.out.println("ok")));





      //  employeeList.stream().forEach(employee -

        //employeeList.stream().filter(employee -> employee.getAge()>29).collect(Collectors.toList()).forEach(System.out::println);



    }
}
