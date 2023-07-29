package com.cydeo.interface_segregation_principle.bad_example;

import java.util.ArrayList;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {

        List<Bird> birds=new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
        birds.add(new Chicken());

        letBirdsFly(birds);

    }

    public  static void letBirdsFly(List<Bird> birds){
        for (Bird bird : birds) {
            bird.fly();  // does nothing for the chicken
        }

    }

}
