package com.example.mycode.staticexample;

public class Human {
    String name;
    int age;
    int salary;
    boolean marriage;
   static int population;

    public Human(String name, int age, int salary, boolean marriage ) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.marriage = marriage;

        this.population +=1;
    }
}
