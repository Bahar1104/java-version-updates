package com.cydeo.open_closed.good_example.example2;

import java.sql.SQLOutput;

public class Addition implements Operation{

    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1+num2);
    }
}
