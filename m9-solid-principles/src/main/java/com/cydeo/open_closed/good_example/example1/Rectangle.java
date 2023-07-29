package com.cydeo.open_closed.good_example.example1;

public class Rectangle implements Shape {

    private double height;
    private double width;

    @Override
    public void draw() {

        System.out.println("drawing rectangle");

    }
}
