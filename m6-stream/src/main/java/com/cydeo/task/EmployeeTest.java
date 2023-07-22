package com.cydeo.task;

import java.util.List;


public class EmployeeTest {
    public static void main(String[] args) {

        //print all emails
        System.out.println("print all emails");

            EmployeeData.readAll()
                    .map(Employee::getEmpEmail)
                    .forEach(System.out::println);

        // print all phone numbers
        System.out.println("print all phone numbers");
        EmployeeData.readAll()
                //.map(Employee::getEmpPhoneNumbers)
                .flatMap(employee->employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("print all phone numbers with double colon operator");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
