package com.cydeo.single_responsibility.goog_example;

public class SecurityFilter {

    public static boolean authenticate(){
        // check application
        return true;
    }


    public static boolean authorization(){
        // check authorization
        return true;
    }

}
