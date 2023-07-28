package com.cydeo.liskov_substitution.liskov_substitution.good_example;

public class Rectangle implements Shape{

    int height;
    int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return this.height*this.width;
    }
}
