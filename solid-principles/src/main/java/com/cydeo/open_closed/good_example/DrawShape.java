package com.cydeo.open_closed.good_example;

import com.cydeo.open_closed.bad_example.Circle;
import com.cydeo.open_closed.bad_example.Rectangle;

import java.util.List;

public class DrawShape {

    public void drawShape(List<Shape> shapes){

        for(Shape shape:shapes){
                  shape.draw();

        }
    }


}
