package com.cydeo.liskov_substitution.liskov_substitution.bad_example;

public class Square extends Rectangle{

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width=height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;

    }
}
