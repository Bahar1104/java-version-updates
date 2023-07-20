package com.cydeo;

import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {


    // ANONYMOUS CLASS
    ApplePredicate ap=new ApplePredicate() {
        @Override
        public boolean test(Apple apple) {
            return  apple.getWight()>=200;
        }
    };


    // *********** Predicate ************************ //

    Predicate<Integer>  lesserThan= i -> i<18;
        System.out.println(lesserThan.test(20));


        // *********** Consumer ************************ //

        Consumer<Integer> display=i -> System.out.println(i);
        display.accept(20);

        // *********** Bi Consumer ************************ //

        BiConsumer<Integer,Integer>  addTwo= (x,y) ->System.out.println(x+y);
         addTwo.accept(10,85);

        // *********** Function ************************ //

        Function<String, String> fun= s-> "hello"+s;
        System.out.println(fun.apply("cydeo"));


        // ***********Bi Function ************************ //

        BiFunction<Integer, Integer,Integer>  bf= (a,b)->a+b;
        System.out.println(bf.apply(6,7));


        // ***********Supplier ************************ //
         Supplier<Double>  randomValue=()->Math.random();
        System.out.println( randomValue.get());

    }
}
