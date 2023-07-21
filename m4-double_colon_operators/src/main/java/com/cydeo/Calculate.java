package com.cydeo;

@FunctionalInterface  // better to put , if in the future you put two abstract it will complain
public interface Calculate {
    void calculate(int x, int y);
}
