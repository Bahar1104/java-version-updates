package com.cydeo.java9;

import java.util.*;

public class FactoryMethodDemo {    //read only method
    public static void main(String[] args) {

        // creating unmodifiable list before java 9

        List<String> courses= Collections.unmodifiableList(Arrays.asList("java","DS","python","java script"));
        //    courses.add("TS");
        System.out.println(courses);

        // creating unmodifiable list AFTER java 9
        List<String> MyCourses= List.of("java", "DS", "python", "java script");


        // creating unmodifiable SET AFTER java 9
       Set<String> MyProducts= Set.of("honey", "sugar", "tea", "milk");

        // creating unmodifiable MAP AFTER java 9
        Map<String,Integer> MyCart=Map.ofEntries(
                                           Map.entry("Sumsung",1),
                                           Map.entry("PSP",4),
                                            Map.entry("Chair",15)
                                         );






    }
}
