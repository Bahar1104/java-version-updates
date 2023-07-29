package com.cydeo.dependency_inversion_package.good_example;

public class UserReader {

    private Reader reader;

    public UserReader(Reader reader) {
        this.reader = reader;
    }

    public String setUserName() {
        return  reader.getUserName();
    }
}
