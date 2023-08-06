package com.example.mycode.matrix;

public class recursion {
    public static void main(String[] args) {
           print(1000);
    }
    public static void print(int n) {
        /*
        this recursion without the base condition.
         {
         base condition
           }
        */


        System.out.println(n);
          print(n+1);
    }
}
