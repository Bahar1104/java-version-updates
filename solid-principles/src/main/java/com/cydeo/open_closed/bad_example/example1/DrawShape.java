package com.cydeo.open_closed.bad_example.example1;

import com.cydeo.open_closed.bad_example.example1.Circle;
import com.cydeo.open_closed.bad_example.example1.Rectangle;

import java.util.List;

public class DrawShape {

    public void draw(List<Object> shapes){

        for(Object shape:shapes){

            if(shape instanceof Circle){
                System.out.println("Drawing a circle");
            }

            if(shape instanceof Rectangle){
                System.out.println("Drawing a Rectangle");
            }

           // WHAT IF we need to draw another shape later ?

         /*   if(shape instanceof Triangle){
                System.out.println("Drawing a Triangle");
            }*/

           // we modify the example and this is not a good way
        }
    }


}
