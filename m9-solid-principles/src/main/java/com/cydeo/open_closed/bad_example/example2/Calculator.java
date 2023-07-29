package com.cydeo.open_closed.bad_example.example2;

public class Calculator {

    public void calculate(Operation operation) {

        int num1 = 10;
        int num2 = 2;

        if (operation.getType().equals(OperationType.ADDITION)){
            System.out.println(num1+num2);
        }

        if (operation.getType().equals(OperationType.SUBTRACTION)){
            System.out.println(num1-num2);
        }

        if (operation.getType().equals(OperationType.MULTIPLICATION)){
            System.out.println(num1*num2);
        }


        if (operation.getType().equals(OperationType.ADDITION)){
            System.out.println(num1+num2);
        }

        // what if i want to add another operation ?
        // add if statement here , add operation type to enum ,
        // and this is not a good way , because we are modifying the code


      /*  if (operation.getType().equals(OperationType.MODULES)){
            System.out.println(num1%num2);
        }*/

    }
}