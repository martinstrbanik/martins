package com.appslab;

import com.appslab.model.Driver;
import com.appslab.model.Programmer;
import com.appslab.model.Teacher;
import com.appslab.model.Worker;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Programmer John = new Programmer(981,69);
        Teacher Simon = new Teacher(420,96);
        Driver Peter = new Driver(501,88);

        Simon.getInfo();
        John.getInfo();
        Peter.getInfo();


    }

}
