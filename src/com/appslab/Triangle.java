package com.appslab;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;
    int area;
    int perimeter;

    int getPerimeter(){
        perimeter = sideA+sideB+sideC;
        return perimeter;
    }

    int getArea(){
        int s = perimeter/2;
        double area1 =Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)) ;
        area = (int) area1;
        return area;
    }



    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
