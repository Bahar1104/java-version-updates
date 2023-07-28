package com.cydeo.liskov_substitution.liskov_substitution.good_example;



import java.util.Arrays;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {
       Rectangle rectangle= new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(5);

     Square square=new Square();
        square.setSide(4);


        // here we can detect the error
//        List<Rectangle> rectangles= Arrays.asList(rectangle,square);
//        changeHeightAndWidth(rectangles);

    }

    public static void changeHeightAndWidth(List<Rectangle> rectangles){

        for (Rectangle rectangle:rectangles){
            rectangle.setHeight(5); // rectangle h->5,  square h, w= 5
            rectangle.setWidth(6);  // rectangle w->6,  square h, w= 6
            System.out.println(rectangle.getArea()==30); // rectangle a->30,  square a->36
            //  validation will fail
        }
    }

}
