package com.example.mycode.Polymorhism.secondExampleofpolymorphism;

class Parent{
    void show(){
        System.out.println("this is parent class");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("this is chile class");
    }
}


public class parentclass {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();
        Parent obj2 = new Child();
        obj2.show();

    }
}
