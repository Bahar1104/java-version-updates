package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {


        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
       // int count2 = countIf(ci, new EvenPredicate());
        System.out.println("Number of odd integers = " + count);


    }

    private static <T> int countIf(List<T> ci, UnaryPredicate<T> P) {
        int count =0;

       for(T elem:ci) {
          if( P.test(elem)){
              ++count;

          }
       }

               return count;
    }


}
