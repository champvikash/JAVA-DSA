package com.example.mycode.OOPs;

import java.util.ArrayList;

public class main3 {
    public static void main(String[] args) {
        Students vikash = new Students();
        System.out.println(vikash.name);
        System.out.println(vikash.marks);
        System.out.println(vikash.rno);

        Students sonali = new Students(57, "Sonalifffffffff", 44.5f);
        System.out.println(sonali.name);

        Students suraj = new Students(58,"suraj", 44.6f,9);
        System.out.println(suraj.mobile);

        suraj.greeting();
    }
}

class Students{
    int rno;
    String name;
    float marks;
    int mobile;

    void greeting(){
       System.out.println("My name is " + name);
    }

    Students(){
      this.rno = 12;
      this.name = "Vikash";
      this.marks = 44.5f;
    }

    Students(int rno,String name , float marks ){
        this.rno = rno;
        this.name= name;
        this.marks= marks;
    }

    Students(int rno,String name , float marks , int mobile){
        this.rno = rno;
        this.name= name;
        this.marks= marks;
        this.mobile= mobile;
    }



}

//1.int a= 6;
//2.int[] a  ={1,2,3,4};
//3. ArrayList<Integer> a = new ArrayList<>();
//4. 2d araay.
//
//HashMap put
//Queue
//Stack
//
//
//oop{int , String , gloat, char,........}


//    TechTarget Contributor
//       What is class?
////        In object-oriented programming , a class is a template definition
////        of the method s and variable s in a particular kind of object .
////        Thus, an object is a specific instance of a class;
////        it contains real values instead of variables.
//
//        The class is one of the defining ideas of object-oriented programming.
//        Among the important ideas about classes are:
//
//        A class can have subclasses that can inherit all or some of the characteristics of the class.
//        In relation to each subclass, the class becomes the superclass.
//        Subclasses can also define their own methods and variables that are not part of their superclass.
//        The structure of a class and its subclasses is called the class hierarchy.