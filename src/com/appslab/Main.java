package com.appslab;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        Plane dodo = new Plane();
        dodo.engines = 25;
        dodo.name = "Pepek";
        System.out.println(dodo.engines + " " + dodo.name);
        dodo.enginesUp();
        Plane.enginesUp();
        System.out.println(Plane.numberOfPlanes);
        Plane shamal = new Plane();
        shamal.name = s.next();
        shamal.engines = s.nextInt();
        System.out.println(shamal.name);
        System.out.println(shamal.engines);




//        while(true){
//            System.out.println("Please enter number");
//            int a = s.nextInt();
//
//            switch (a) {
//                case 1: {
//                    System.out.println("case 1");
//
//                }
//                break ;
//                case 2: {
//                    System.out.println("case 2");
//                }
//                break ;
//                default: {
//                    System.out.println("wrong input");
//                }
//                break ;
//




            }

}
