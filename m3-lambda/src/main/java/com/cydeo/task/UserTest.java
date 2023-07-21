package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

    List<User> users=new ArrayList<>();
    users.add(new User("mike","smith",45));
        users.add(new User("andy","smith",35));
        users.add(new User("lucy","smith",25));

        // print all elements

           printName(users, user->true);

        // print all people that first name starts with m
         printName(users,user->user.getFirstName().startsWith("m"));


    }

    private static void printName(List<User> users, Predicate<User> p){
        for (User user : users) {
            if(p.test(user)){
                System.out.println(user.toString());
            }

        }

    }
}
