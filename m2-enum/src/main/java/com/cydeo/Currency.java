package com.cydeo;

public enum Currency {

    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);  // are the objects of this Currency class

   private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
