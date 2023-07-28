package com.cydeo.interface_segregation_principle.good_example;

public class Eagle implements CanEat,CanWalk,CanFly{
    @Override
    public void eat() {
        System.out.println("eagle is eating" );
    }

    @Override
    public void fly() {
        System.out.println("eagle is flying" );
    }

    @Override
    public void walk() {
        System.out.println("eagle is walking" );
    }
}
