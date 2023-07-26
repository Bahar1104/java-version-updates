package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {

        var str="mike \n ozzy \n tom \n emmy";

        str.lines().forEach(System.out::println);



    }
}
