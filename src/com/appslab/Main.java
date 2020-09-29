package com.appslab;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many inputs you want: ");
        int b=input.nextInt();
        int[] a = new int[b];

        for (int i = 0; i < a.length; i++)
        {
            System.out.println("Please enter number");
            a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]*a.length);
        }
    }
}
