package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer>  numbers= Arrays.asList(4,5,6,7,8,9);

        int result=0;

        for(int number: numbers){
            result=result+number;
        }

        System.out.println(result);

        // reduce
        System.out.println("reduce");

        int result1=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result1);

        System.out.println("if you dont give initial value, return type will be Optional");
        Optional<Integer> result2=numbers.stream().reduce((a, b)->a+b);
        System.out.println(result2);  // return Optional object
        System.out.println(result2.get());  // return Integer

        System.out.println("total Calories");
          int totalCalories= DishData.getAll().stream()
                  .map(Dish::getCalories)
                  .reduce(0,(a,b)->a+b);

        System.out.println(totalCalories);

        //Max and min
        System.out.println("short cut for max and min");
        Optional<Integer> min=numbers.stream().reduce(Integer::min);
        Optional<Integer> max=numbers.stream().reduce(Integer::max);
        Optional<Integer> sum=numbers.stream().reduce(Integer::sum);

        System.out.println("min "+ min.get());
        System.out.println("max "+ max.get());
        System.out.println("sum "+ sum.get());

          // Count
        System.out.println("dish count ");
         long dishCount= DishData.getAll().stream()
                 .count();
        System.out.println(dishCount);




    }
}
