package com.cydeo.liskov_substitution.liskov_substitution.good_example;

import com.cydeo.liskov_substitution.liskov_substitution.bad_example.Rectangle;

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
