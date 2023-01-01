package com.example.mycode.Inheritance;

public class Main3 {
    Dog d = new Dog("Red");

}


class Animal{
    String color="white";
}

class Dog extends Animal{
    public Dog(String color) {
        this.color = color;
    }



    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}