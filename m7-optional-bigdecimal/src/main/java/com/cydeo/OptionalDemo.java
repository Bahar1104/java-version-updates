package com.cydeo;

import com.cydeo.java10.Apple;
import com.cydeo.java9.FactoryMethodDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

    List<Integer> number= Arrays.asList(2,14,5,68,23,25);

    // empty()   -isPresent()

       Optional<String> empty= Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        System.out.println(Optional.of(number).isPresent());

      //  System.out.println(empty.get());   // No value present

        // ifPresent
       Optional<Integer> bigNumber= number.stream().filter(x->x>100).findAny();
       bigNumber.ifPresent(System.out::println);

       //get

      //  System.out.println(bigNumber.get());  // big time is not present , shouldn't be bull pointer exception??

      //orElse

        System.out.println(bigNumber.orElse(5));


        FactoryMethodDemo f1=new FactoryMethodDemo();

         Apple a=new Apple();








    }
}
