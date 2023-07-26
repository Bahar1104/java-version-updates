package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

             List<Integer> unmodifiableList2= List.of(1,2,3,4,5); // taking values

            List<Integer> unmodifiableList= List.copyOf(numbers);  // taking collection






    }
}
