package com.cydeo;


import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

   //   Predicate<Integer> pred= p->p%2==0 ? true:false ;

        Calculate  sum=(a,b)-> System.out.println(a+b);
        sum.calculate(10,20);

        //reference to a static method
        Calculate  sum1=(a,b)-> Calculator.findSum(a,b);
        sum1.calculate(10,20);

        Calculate  sum2=Calculator::findSum;
        sum2.calculate(10,20);

        //reference to an instance method

        Calculator obj=new Calculator();
        Calculate multiply=obj ::findMultiply;
        multiply.calculate(2,2);

        Calculate multiply1=new Calculator() ::findMultiply;
        multiply1.calculate(3,2);


        BiFunction<String,Integer,String> multi=(str,i)-> str.substring(i);
        BiFunction<String,Integer,String> multi1=String::substring;


        Function<Integer, Double>  b=new MyClass()::method;
        BiFunction<MyClass,Integer,Double>  b1=MyClass::method;











    }
}
