package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {

        // Type inference   only for Local variables

        String abc="cydeo";

        var str="java";     //only for Local variables

        byte x=1;
         var y=1;  //int
         var price = 12.50;   // double

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        var numbers1= Arrays.asList(1,2,3,4,5);

        var sum=0;
        for (var eachNumber:numbers1){
            sum=sum+eachNumber;
        }

        String k;
        k="me";

       //  var k;  // not allowed







    }
}
