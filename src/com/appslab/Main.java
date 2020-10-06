package com.appslab;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5);

        System.out.println("Perimeter is: "+triangle.getPerimeter());
        System.out.println("Area is : "+triangle.getArea());

    }
}
