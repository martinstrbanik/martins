package com.appslab;

public class Main {

    public static void main(String[] args) {

        Student John = new Student();
        John.setName("John");
        John.setStudentNumber(12345);

        System.out.println(John.getName()+": "+ John.getStudentNumber());

    }
}
