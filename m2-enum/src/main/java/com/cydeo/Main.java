package com.cydeo;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Apple apple=new Apple(5);
        apple.setWight(12);



        System.out.println("how to access A constant ");

        // Apple a =new Apple();
        // System.out.println(a);   // output->hash code, have to use to string


        Currency penny = Currency.PENNY;
        System.out.println(penny);          //output->PENNY,    toString is overriden

        System.out.println(Currency.DIME);

        System.out.println("how to access All constants ");

        Currency[] currencies = Currency.values();

        System.out.println(Arrays.toString(currencies));

        for (Currency currency : currencies) {
            System.out.println(currency);

        }

        System.out.println("how to use switch case with enum ");

       switch (Currency.PENNY){

           case PENNY:
               System.out.println("It is 1 cent");
               break;
           case NICKLE:
               System.out.println("It is 5 cent");
               break;
           case DIME:
               System.out.println("It is 10 cent");
               break;
           case QUARTER:
               System.out.println("It is 25 cent");
            break;
       }

        System.out.println("operation task ");
        calculate(3,5,Operation.PLUS);

        System.out.println("how to retrieve the constant value");

        System.out.println(ProjectStates.PROGRESS);
        System.out.println(ProjectStates.PROGRESS.status);
        System.out.println(ProjectStates.OPEN);
        System.out.println(ProjectStates.OPEN.status);

        System.out.println(Currency.DIME.getValue());
         Currency.DIME.setValue(14);
        System.out.println(Currency.DIME.getValue());
        System.out.println(Currency.DIME.ordinal()); // index




    }

    private static void calculate(double x, double y, Operation operation){
        switch (operation){

            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }


    }


}

