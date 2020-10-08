package com.appslab;

public class Employee {
    String name;
    String surname;
    int dateOfBirth;
    String jobPosition;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public Employee(String name, String surname, int dateOfBirth, int jobPosition) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.jobPosition = jobPosition;


    }
}
