package com.appslab;

public class Main {

    public static void main(String[] args) {

        String a= "helo";
        for (int i = 0; i < a.length(); i++)
        {
            char c=a.charAt(i);
            System.out.println(c);
        }

        char[]d=a.toCharArray();
        for(int i=0;i<d.length;i++){
            System.out.println("char at "+i+" index is: "+d[i]);
        }



    }
}
