package com.appslab;

public class JobPosition {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public JobPosition(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }
}
