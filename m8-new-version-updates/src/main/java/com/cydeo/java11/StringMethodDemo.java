package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {

        var str="mike \n ozzy \n tom \n emmy";

        // lines()    take every line and make it stream,
                      // then we can apply any stream method on it

        str.lines().forEach(System.out::println);



    }
}
