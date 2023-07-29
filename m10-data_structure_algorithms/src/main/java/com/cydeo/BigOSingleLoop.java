package com.cydeo;

public class BigOSingleLoop {

    public static void main(String[] args) {
        int numberOfOperation = 0;
        int n = 1000;  // 1000000        // size of data
        int m = 500;
        long startTime;
        long endTime;

        System.out.println("input size n is= " + n);

        // Task 1 single loop ......................

        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperation += 1;
        }
        endTime = System.currentTimeMillis();
        System.out.println("single loop number Of Operation : " + numberOfOperation + " in " + (endTime - startTime) + " milliseconds");

        // Task 2 nested  loop......................

        numberOfOperation = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                numberOfOperation += 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("nested loop number Of Operation: " + numberOfOperation + " in " + (endTime - startTime) + " milliseconds");


        // Task 3 three nested loops ......................

        numberOfOperation = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperation += 1;
                }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Triple nested loop number Of Operation: " + numberOfOperation + " in " + (endTime - startTime) + " milliseconds");

        // Task 4 N and M nested loops   O(n*m)  ......................

        numberOfOperation = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                numberOfOperation += 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("nested loop O(n*m) number Of Operation:" + numberOfOperation + " in " + (endTime - startTime) + " milliseconds");

        // Task 4.5 N and M consecutive loops  O(n+m) ......................

        numberOfOperation = 0;
        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            numberOfOperation += 1;
               }
                for (int i = 0; i < m; i++) {
                    numberOfOperation += 1;
                }
            endTime = System.currentTimeMillis();
            System.out.println("consecutive loop O(n+m) number Of Operation: " + numberOfOperation + " in " + (endTime - startTime) + " milliseconds");

            // Task 5 logarithmic complexity ......................

            numberOfOperation = 0;
            startTime = System.currentTimeMillis();
            for (int i = 1; i < n; i *= 2) {
                numberOfOperation += 1;
            }

            endTime = System.currentTimeMillis();

            System.out.println("number Of Operation with Logarithmic: " + numberOfOperation + " in " + (endTime - startTime) + " milliseconds");

            // Task 5 End ......................
   }
 }
