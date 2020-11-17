package com.appslab;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);

        putIfAbsent(map,"Yellow",6);

        System.out.println(list);
        for (String i : map.keySet()) {
            System.out.println(i);
        }
        for (Integer i : map.values()) {
            System.out.println(i);

        }
    }


    public static void putIfAbsent(HashMap<String, Integer> map,String key, int value){
        map.putIfAbsent(key,value);
    }
}
