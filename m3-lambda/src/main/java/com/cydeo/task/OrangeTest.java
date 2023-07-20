package com.cydeo.task;

import com.cydeo.Color;
import com.cydeo.task.Orange;
import com.cydeo.task.OrangeFormatter;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory=new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(200,Color.RED));
        inventory.add(new Orange(100,Color.GREEN));
        inventory.add(new Orange(150,Color.RED));
        inventory.add(new Orange(90,Color.GREEN));
        inventory.add(new Orange(80,Color.RED));
        inventory.add(new Orange(90,Color.GREEN));

      OrangeFormatter orangeLambda= orange ->"An apple of "+ orange.getWight()+" g";
      prettyPrintApple(inventory,orangeLambda);
      prettyPrintApple(inventory,orange ->"An apple of "+ orange.getWight()+" g");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        OrangeFormatter fancyFormatter=orange ->{
            String weight=orange.getWight()>200?"heavy" :"light";
            return    "A " + weight+ " "+ orange.getColor() + " orange";
        };


        prettyPrintApple(inventory,fancyFormatter);
        prettyPrintApple(inventory,orange ->{
            String weight=orange.getWight()>200?"heavy" :"light";
            return    "A " + weight+ " "+ orange.getColor() + " orange";
        });

    }


private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){

    for (Orange orange : inventory) {
     String outPut=orangeFormatter.accept(orange);
        System.out.println(outPut);
        }
}


}
