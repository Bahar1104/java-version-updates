package com.cydeo.task;

import java.util.Comparator;


import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        // print all the dish`s name that has less than calories
        System.out.println("all dish`s name that has less than calories");

        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .map(Dish::getName)   // what if we want to display two data,\name and calories
                .forEach(System.out::println);


        //  print the length of the name of each dish
        System.out.println("length of the name of each dish");

        DishData.getAll().stream()
              .map(dish -> dish.getName().length())
                .forEach(System.out::println);


        // print three high dish name (>300)  // name of first three
        System.out.println("print three high dish name (>300)");

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);


        // print three high dish name (>300)   // top three high calories in sorted
        System.out.println("print three high dish name (>300)");

        DishData.getAll().stream()
                .map(Dish::getCalories)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);


        // print all dish name that are below 400 calories in sorted order
        System.out.println("all dish name that are below 400 calories in sorted order");

          DishData.getAll().stream()
                .filter(dish->dish.getCalories()<=400)
                .sorted(comparing(Dish::getCalories).reversed())
                // .sorted()    why incorrect???????
                .map(Dish::getName)
               .forEach(System.out::println);

    }
}