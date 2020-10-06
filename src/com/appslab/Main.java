package com.appslab;

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


    }
    public static int calculateBudged(Person[] people){
        int budget = 0;
        for (int i = 0; i< people.length; i++) {
          budget +=people[i].budget;
        }
        return budget;
    }

}
