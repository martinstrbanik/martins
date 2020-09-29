package com.appslab;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input total number of slices: ");
        int tSlices=input.nextInt();
        System.out.print("Input total number of recipients: ");
        int N0Rec=input.nextInt();
        System.out.print("Input number of slices per recipient: ");
        int slicePerRec=input.nextInt();

        if(N0Rec*slicePerRec<=tSlices)
        {
            System.out.print("True");

        }
        else
            {
                System.out.print("False");
            }
    }
}
