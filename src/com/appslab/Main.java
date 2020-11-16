package com.appslab;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person people[] = new Person[3];
        Person person1 = new Person(12, "John", 1000);
        Person person2 = new Person(20, "Steve", 2000);
        Person person3 = new Person (30, "Martin", 3000);

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;


        System.out.println(calculateBudged(people));
        System.out.println(consistingA(people,'a'));


    }
    public static int calculateBudged(Person[] people){
        return Arrays.stream(people).map(Person::getBudget)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static boolean consistingA(Person[] people,char a){
        return Arrays.stream(people).map(Person::getName)
                .flatMapToInt(String::chars)
                .anyMatch(i -> i == a);
    }
}