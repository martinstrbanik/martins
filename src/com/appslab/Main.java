package com.appslab;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Zadajte cislo a: ");
        int a = input.nextInt();
        System.out.print("Zadajte cislo b: ");
        int b = input.nextInt();
        System.out.print("Zadajte cislo c: ");
        int c = input.nextInt();
        input.close();

        System.out.print("Pocet rovnakych cisiel: ");
        if (a==b && b==c)
        {
            System.out.println(3);
        }

        else if (a==c)
        {
            System.out.println(2);
        }
        else if (a==b)
        {
            System.out.println(2);
        }
        else if (c==b)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(0);
        }


    }
}
