package com.example.mycode.recursionpattern;

public class Trianglepattern {

    public static void main(String[] args) {
     recursionTriangler1(4, 0);
        recursionTriangler2(4, 0);
    }
    public static void recursionTriangler1(int r , int c){
        if( r == 0){
            return;
        }
        if(c < r){
            System.out.print("x");
            recursionTriangler1( r , c+1);
        }else{
            System.out.println();
            recursionTriangler1(r-1,0);
        }

    }

    public static void recursionTriangler2(int r , int c){
        if( r == 0){
            return;
        }
        if(c < r){

            recursionTriangler2( r , c+1);
            System.out.print("x");
        }else{

            recursionTriangler2(r-1,0);
            System.out.println();
        }

    }

}
