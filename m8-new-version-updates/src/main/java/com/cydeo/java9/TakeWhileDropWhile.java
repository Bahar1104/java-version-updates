package com.cydeo.java9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile {
    public static void main(String[] args) {

    List<Stock> stocks=getStocks();
        System.out.println("stocks sorted: \n"+ stocks);

        // using filter

     List<String>  stockBelow500Filter=getStockBelowFiveHundredFilter(stocks);
        System.out.println("stock Below 500 filter output: "+ stockBelow500Filter);

        // using takeWhile

        List<String>  stockBelow500=getStockBelowFiveHundred(stocks);
        System.out.println("stock Below 500 output: "+ stockBelow500);


      //Using dropWhile

        List<String>  stockAbove500=getStockAboveFiveHundred(stocks);
        System.out.println("stock Above 500 output: "+ stockAbove500);

    }



    public static List<String> getStockBelowFiveHundredFilter(List<Stock> stocks){
        return stocks.stream()
                .peek(stock-> System.out.println("Filter processing: " +stock))
                .filter(TakeWhileDropWhile::isStockLessThanHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }


    public static List<String> getStockBelowFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock-> System.out.println("takeWhile processing: " +stock))
                .takeWhile(TakeWhileDropWhile::isStockLessThanHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getStockAboveFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock-> System.out.println("drop while processing: " +stock))
                .dropWhile(TakeWhileDropWhile::isStockLessThanHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
    }

    public static boolean isStockLessThanHundred(Stock stock){
        return stock.getValue().compareTo(BigDecimal.valueOf(500))<=0;   // -1 true or false , how about 1
    }

   private static  List<Stock> getStocks(){

        List<Stock> stocks=new ArrayList<>();
                stocks.add(new Stock("Apple",BigDecimal.valueOf(1000)));
                stocks.add(new Stock("Amazon",BigDecimal.valueOf(800)));
                stocks.add(new Stock("Tesla",BigDecimal.valueOf(400)));
                stocks.add(new Stock("Netflix",BigDecimal.valueOf(2000)));
                stocks.add(new Stock("Facebook",BigDecimal.valueOf(500)));
                stocks.add(new Stock("Instagram",BigDecimal.valueOf(100)));

        return  stocks.stream()
                .sorted(Comparator.comparing(Stock::getValue))
                .collect(Collectors.toList());

   }








    }
