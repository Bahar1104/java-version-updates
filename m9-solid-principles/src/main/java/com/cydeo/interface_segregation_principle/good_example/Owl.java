package com.cydeo.interface_segregation_principle.good_example;

public class Owl implements CanEat,CanWalk,CanFly{
    @Override
    public void eat() {
        System.out.println("owl is eating" );
    }

    @Override
    public void fly() {
        System.out.println("owl is flying" );
    }

    @Override
    public void walk() {
        System.out.println("owl is walking" );
    }
}
