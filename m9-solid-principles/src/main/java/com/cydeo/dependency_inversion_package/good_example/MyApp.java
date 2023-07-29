package com.cydeo.dependency_inversion_package.good_example;

public class MyApp {

    public static void main(String[] args) {

        XMLReader xmlReader=new XMLReader();

        UserReader userReader=new UserReader(xmlReader);

        UserReader userReader2=new UserReader(new XMLReader());

        UserReader userReader3=new UserReader(new JsonReader());

    }

    public static void read(Reader reader){
        UserReader userReader4=new UserReader(reader);
        userReader4.setUserName();
    }
}
