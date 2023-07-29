package com.cydeo.dependency_inversion_package.bad_example;

public class UserReader {

    private XMLReader xmlReader; // what happens if we decided to use Json for format


    public UserReader(XMLReader xmlReader) {  // we need to add json reader in constructor too
        this.xmlReader = xmlReader;
    }

    public String getUserName() {
        return xmlReader.getUserName();
    }

    // we may need another method

//    public String getUserNameFromJson() {
//        return jsonReader.getUserName();
//    }

}
