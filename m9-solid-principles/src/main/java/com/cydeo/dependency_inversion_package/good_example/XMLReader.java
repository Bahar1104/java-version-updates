package com.cydeo.dependency_inversion_package.good_example;

public class XMLReader implements Reader{
    @Override
    public String getUserName() {
        return "<username>mikesmith</username>";
    }
}
