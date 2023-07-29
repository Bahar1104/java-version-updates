package com.cydeo.dependency_inversion_package.good_example;

public class JsonReader implements Reader{

    /*


    json example

    {
       "username":"mikesmith"
    }


     */
    @Override
    public String getUserName() {
        return " {\"username\":\"mikesmith\" }";
    }
}
