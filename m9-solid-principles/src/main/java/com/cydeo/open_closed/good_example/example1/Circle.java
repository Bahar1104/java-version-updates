package com.cydeo.open_closed.good_example.example1;

public class Circle implements Shape {
    private double radius;

    @Override
    public void draw() {
        System.out.println("drawing Circle");
    }
}
