package com.cydeo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ){

        // for type protection for classes and interfaces

        ArrayList<Integer>  items=new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
     //   items.add("apple");

        printDoubled(items);

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        FootBallPlayer joe=new FootBallPlayer("joe");
        BaseBallPlayer pat=new BaseBallPlayer("pat");
        SoccerPlayer beckham=new SoccerPlayer("beckham");


        Team<FootBallPlayer> liverPool=new Team<>("Liver pool");
        liverPool.addPlayer(joe);
      //  liverPool.addPlayer(pat);
       // liverPool.addPlayer(beckham);

      //  Team<String> brokenTeam=new Team<>("is this s team?");

        // Team<Integer> t2=new Team<>("wierd");








    }

    private static void printDoubled(ArrayList<Integer> list){
        for (Integer each:list){

            System.out.println(each*2);

        }


    }
}
