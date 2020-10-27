package com.appslab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        out(list);
    }

    static void out(ArrayList<Integer>list){
        if (list.size()==0){
            System.out.println("ArrayList is empty");
        }
        else{
            list.forEach((i)->{
                System.out.println(i);
            });
        }
    }

}


