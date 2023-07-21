package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        //Filter
        System.out.println(" Filter ");

        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        // distinct
        System.out.println(" distinct");

        Stream<Integer> str=list.stream()
                .filter(i->i%2==0)
                .distinct();
               str.forEach(System.out::println);


        // Limit
        System.out.println("Limit");

        list.stream()
                .filter(i->i%2==0)
                .limit(1)
                  .forEach(System.out::println);

        // Skip
        System.out.println("Skip");

        list.stream()
                .filter(i->i%2==0)
                .skip(1)
                .forEach(System.out::println);
        // Map
        System.out.println("Map");

        list.stream()
                .map(number->number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);

    }


}
