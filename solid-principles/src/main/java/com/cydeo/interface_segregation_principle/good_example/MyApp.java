package com.cydeo.interface_segregation_principle.good_example;

import java.util.ArrayList;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {
        List<CanFly> birds=new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
     //   birds.add(new Chicken());  //this will worn us to not put chicken here

        letBirdsFly(birds);

    }

    public  static void letBirdsFly(List<CanFly>  birds){
        for (CanFly bird : birds) {
            bird.fly();
        }

    }
}
