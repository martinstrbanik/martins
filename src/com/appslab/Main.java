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
        getEvenNumbers(list);
        addIfNotExists(1,list);
        addIfNotExists(6,list);
        addIfNotExists(14,list);
        addIfNotExists(5,list);
        out(list);
        evenNumberDelete(list);
        out(list);
    }

    static void out(ArrayList<Integer>list){

        if (list.size()==0){
            System.out.println("List is empty");
        }
        else{
            System.out.println("List:");
            list.forEach(System.out::println);
        }
    }

    static void addIfNotExists(int a,ArrayList<Integer>list){
        if(list.contains(a)){
            System.out.println(a + " is already on the list and it won´t be added");
        }
        else{
            System.out.println("Adding " + a + " to the list");
            list.add(a);
        }
    }

    static void evenNumberDelete(ArrayList<Integer>list){
        System.out.println("Deleting even numbers...");
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
    }

    static void getEvenNumbers(ArrayList<Integer>list){
        System.out.println("List of even numbers:");
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                System.out.println(list.get(i));
            }
        }
    }


}


    