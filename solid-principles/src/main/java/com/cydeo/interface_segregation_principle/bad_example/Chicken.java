package com.cydeo.interface_segregation_principle.bad_example;

public class Chicken implements Bird{
    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }

    // chicken cannot fly , now we forced to implement this method
    @Override
    public void fly() {

    }
}
