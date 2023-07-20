package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory=new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(100,Color.GREEN));
        inventory.add(new Apple(150,Color.RED));
        inventory.add(new Apple(90,Color.GREEN));
        inventory.add(new Apple(80,Color.RED));
        inventory.add(new Apple(90,Color.GREEN));

      List<Apple>  heavyApple=filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple>  greenApple=filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);





    }


         private static List<Apple>  filterApples(List<Apple> inventory, ApplePredicate predicate){

             List<Apple> result=new ArrayList<>();

             for (Apple apple : inventory) {

                 if(predicate.test(apple)){
                   result.add(apple);
                 }

             }


             return result;

         }


}
