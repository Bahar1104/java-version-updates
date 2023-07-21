package com.cydeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory=new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(100,Color.GREEN));
        inventory.add(new Apple(150,Color.RED));
        inventory.add(new Apple(90,Color.GREEN));
        inventory.add(new Apple(80,Color.RED));
        inventory.add(new Apple(90,Color.GREEN));

       //  Collections.sort(inventory); WHY ???


        Comparator<Apple> sortApple= Comparator.comparing(apple->apple.getWight());
        inventory.sort(sortApple);
        System.out.println(inventory);


        Comparator<Apple> sortApple2=comparing(Apple::getWight);
        inventory.sort(sortApple);
        System.out.println(inventory);

        inventory.sort(comparing(Apple::getWight));
        System.out.println(inventory);

        // reversed

        inventory.sort(comparing(Apple::getWight).reversed());
        System.out.println(inventory);

        //chaining
        inventory.sort(comparing(Apple::getWight)
                .reversed()
                .thenComparing(Apple::getColor));




    }
}
