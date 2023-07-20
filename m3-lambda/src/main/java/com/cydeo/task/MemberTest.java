package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {

        Person p1=new Person("mike",35,Gender.MALE,"mike@gmail.com");
        Person p2=new Person("asya",30,Gender.FEMALE,"asya@gmail.com");
        Person p3=new Person("andy",18,Gender.MALE,"andy@gmail.com");
        Person p4=new Person("linda",15,Gender.FEMALE,"linda@gmail.com");
        Person p5=new Person("lucy",25,Gender.FEMALE,"lucy@gmail.com");

        List<Person> personList= Arrays.asList(p1,p2,p3,p4,p5);

        print(personList,person -> person.getGender().equals(Gender.FEMALE)&& person.getAge()>=18 && person.getAge()<=25);

    }

    private static void print(List<Person> personList, CheckMember checkMember){
        List<Person> result=new ArrayList<>();
        for (Person person : personList) {
            if(checkMember.test(person)){
                result.add(person);
            }
        }

        System.out.println(result);
    }

}
