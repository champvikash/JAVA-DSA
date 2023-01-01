package com.example.mycode.OOPs;

public class main2 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student vikash = new Student();
        Student rahul = new Student();
        System.out.println(rahul.name);


         vikash.changeName("suraj");
         vikash.greeting();


//        vikash.rno = 01;
////        vikash.marks = 74.5f;
//        vikash.name = "vikash";

        System.out.println(vikash.rno);
        System.out.println(vikash.marks);
        System.out.println(vikash.name);
    }
}

class Student {
    int rno;
    String name;
    float marks;
//    float marks = 90.56f;

    void changeName(String newName){
        this.name = newName;
    }


    void greeting(){
        System.out.println("this is my name "+ this.name);
    }



    Student () {
        this.rno = 25;
        this.name="Vikash Kumar";
        this.marks = 98.5f;
    }



}
