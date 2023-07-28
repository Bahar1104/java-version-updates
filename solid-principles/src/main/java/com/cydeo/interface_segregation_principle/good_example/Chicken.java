package com.cydeo.interface_segregation_principle.good_example;

public class Chicken implements CanEat,CanWalk{
    @Override
    public void eat() {
        System.out.println("chicken is eating");
    }

    @Override
    public void walk() {

        System.out.println("chicken is walking");

    }
}
