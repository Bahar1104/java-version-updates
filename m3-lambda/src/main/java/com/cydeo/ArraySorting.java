package com.cydeo;

public class ArraySorting { //QuickSort, BubbleSort

    public static void main(String[] args) {

     ArraySorting as=new ArraySorting();


        QuickSort qs=new QuickSort();
        BubbleSort bs=new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort=()-> System.out.println("quick sort");

        as.sort(()->System.out.println("quick sort"));


    }

    private void sort(Sorting sorting) {
        sorting.sort();

    }


}
