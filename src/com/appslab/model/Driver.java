package com.appslab.model;

public class Driver extends Worker {

    public Driver() {
        super(Enum.DRIVER);
    }

    public Driver(float salary, int bonus) {
        super(salary, bonus, Enum.DRIVER);
    }

}
