package com.cydeo.dependency_inversion_package.good_example;

public class TextReader implements Reader {

    @Override
    public String getUserName() {
        return "mikesmith";
    }
}