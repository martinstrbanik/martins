package com.appslab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(6);

        System.out.println(multiplyByLength(list));

    }

    public static List<Integer> multiplyByLength(ArrayList<Integer> list){

        return list.stream().map(i -> i * list.size())
                .collect(Collectors.toList());


    }


}