package com.cydeo.liskov_substitution.good_example;

public class Square implements Shape{
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side*side;
    }
}
