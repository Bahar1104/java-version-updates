package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer>  list= Arrays.asList(10,45,14,23,75,24,10);
        System.out.println(list);

        // Ascending
        Collections.sort(list);
        System.out.println(list);

        //descending

        Collections.sort(list,new MyComparator());
        System.out.println(list);

        Collections.sort(list,((o1,o2)->(o1>o2)? -1 : (o1<o2)?1 :0));

        // Ascending
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);

        //descending

        list.sort((o2,o1)->o2.compareTo(o1));
        System.out.println(list);


    }



}
