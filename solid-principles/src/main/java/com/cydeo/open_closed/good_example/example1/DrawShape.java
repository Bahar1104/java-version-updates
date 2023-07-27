package com.cydeo.open_closed.good_example.example1;

import java.util.List;

public class DrawShape {

    public void drawShape(List<Shape> shapes){

        for(Shape shape:shapes){
                  shape.draw();

        }
    }


}
