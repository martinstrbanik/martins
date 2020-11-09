package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a;
        multiplyByLength(new int[5]);
    }


    public static int multiplyByLength(int[] a){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(a);
        System.out.println(numbers);
        return 0;
    }
}
