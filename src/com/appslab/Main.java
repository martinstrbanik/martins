package com.appslab;

public class Main {

    public static void main(String[] args) {
        Student Student1 = new Student();
        Student Student2 = new Student();

        Student1.name = "John";
        Student1.studentNumber = 2;
        Student1.address = "Legionarska 1, 01001 Zilina";
        Student1.phoneNumber = 123456;

        Student2.name = "Sam";
        Student2.studentNumber = 5;
        Student2.address = "Legionarska 2, 01001 Zilina";
        Student2.phoneNumber = 456789;


        System.out.println(Student1.getAddress() + " " + Student1.getPhoneNumber() + " " + Student1.getStudentNumber() );
        System.out.println(Student2.getAddress() + " " + Student2.getPhoneNumber() + " " + Student2.getStudentNumber() );
    }
}
