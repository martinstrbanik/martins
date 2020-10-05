package com.appslab;

public class Plane {
    int engines;
    String name;
    static int numberOfPlanes = 0;

    static void enginesUp ()
    {
        System.out.println("Engines are starting up!");
    }

    public Plane() {
        numberOfPlanes++;
    }
}
