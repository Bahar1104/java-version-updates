package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {

    //All Match
        System.out.println("All Match");

   boolean isHealthy= DishData.getAll().stream()
            .allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);

        //Any Match
        System.out.println("Any match");

        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("the menu has vegetarian dish");
        };

        //Non Match
        System.out.println("Non match");

        boolean isHealthy2= DishData.getAll().stream()
                .noneMatch(dish->dish.getCalories()>1000);
        System.out.println(isHealthy);

        //Find Any
        System.out.println("Find Any");

       Optional<Dish>  dish=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //Find first
        System.out.println("Find First");

        Optional<Dish>  dish2=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish.get());

       //parallel streams (Async)
        System.out.println("parallel streams (Async)");
        System.out.println(IntStream.range(0,100).parallel().findAny());  // give random data
        System.out.println(IntStream.range(0,100).parallel().findFirst());  // the first matching one

        List<String> list1= Arrays.asList("melinda","david","mike","andy","lucy","alen","dany","louna");
        List<String> list2= Arrays.asList("melinda","david","mike","andy","lucy","alen","dany","louna");

        System.out.println("parallel streams (Async)");
       Optional<String> findFirst= list1.parallelStream().filter(s->s.startsWith("d")).findFirst();
        Optional<String> findAny= list2.parallelStream().filter(s->s.startsWith("m")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        System.out.println("+++++++++++++++++");  // synchronized????
        Optional<String> findFirst1= list1.stream().filter(s->s.startsWith("d")).findFirst();
        Optional<String> findAny1= list2.stream().filter(s->s.startsWith("m")).findAny();

        System.out.println(findFirst1.get());
        System.out.println(findAny1.get());



        //Min and Max
        System.out.println("Min");

        Optional<Dish> minDish=DishData.getAll().stream()
                .sorted(Comparator.comparing(Dish::getCalories)).findFirst();

        System.out.println(minDish.get());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        Optional<Dish> minDish1=DishData.getAll().stream()
                .min(Comparator.comparing(Dish::getCalories));

       System.out.println(minDish1.get());

        System.out.println("Max");

        Optional<Dish> maxDish=DishData.getAll().stream()
                .max(Comparator.comparing(Dish::getCalories));

        System.out.println(maxDish.get());





    }
}
