package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){

        return Stream.of(
             new Employee(100,"mike","mike@cydeo.com", Arrays.asList("4564605","15614565")),
             new Employee(101,"andy","andy@cydeo.com", Arrays.asList("4561245","15614755")),
            new Employee(102,"lucy","lucy@cydeo.com", Arrays.asList("4564472","15614235"))
        );
    }
}
