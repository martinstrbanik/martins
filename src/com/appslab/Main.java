package com.appslab;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("zadajte stranu a: ");
        int a=input.nextInt();
        System.out.print("zadajte stranu b: ");
        int b=input.nextInt();
        System.out.print("zadajte stranu c: ");
        int c=input.nextInt();
        input.close();

        if (c<b||c<a)
        {
            System.out.print("strana c musi byt najvacsia");
        }
        else if (a+b>c)
        {
            System.out.println("Trojuholnik je mozny.");
        }

        else{
            System.out.println("Trojuholnik je nemozny");
        }



    }
}
