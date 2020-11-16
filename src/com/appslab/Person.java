package com.appslab;

public class Person {
    int age;
    String name;
    int budget;

    int getAge(){
        return age;
    }

    int getBudget(){
        return budget;
    }

    String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Person(int age, String name, int budget) {
        this.age = age;
        this.name = name;
        this.budget = budget;
    }
}