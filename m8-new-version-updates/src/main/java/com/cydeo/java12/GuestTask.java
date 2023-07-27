package com.cydeo.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {
    public static void main(String[] args) {


    var result= Stream.of(
            new Guest("macro",true,3),
            new Guest("david",false,2),
            new Guest("Roger",true,6))
            .collect(Collectors.teeing(
                    // first collector, we select only who confirmed the participation
               Collectors.filtering(Guest::isParticipating,
                    // We want to collect only the first name in a list
                    Collectors.mapping(o->o.getName(),Collectors.toList())),
                    //second collector, we want the total numbers of participants
                    Collectors.summingInt(Guest::getParticipantsNumber),
                    // we merge the collectors in a new Object,
                    // the values are implicitly passed

                    EventParticipation::new

            ));
        System.out.println(result);

    }
}
