package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CharStringTask {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("java","spring","agile");

        words.stream()
                // .map(each->each.length())
                .map(String::length)
                .forEach(System.out::println);


    }
}
