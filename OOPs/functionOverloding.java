package com.example.mycode.matrix.OOPs;

public class functionOverloding {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        int[] arr = {1,2,3,4};


        System.out.println(add(a,b));

        System.out.println(add(a,b,c));

        System.out.println(add(arr));

        System.out.println(add(a,b));
    }

    public static int add(int a , int b){
        return a+b;
    }

//    public static int add(int a , int b){
//        return a+b;
//    }



    public static int add(int a,int b, int c){
        return a+b+c;
    }

    public static int add(int[] arr){

        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        return sum;

            };
}


//    Function Overloading in Java occurs when there are functions having
//    the same name but have different numbers of parameters passed to it,
//    which can be different in data like int, double, float and used to return
//        different values are computed inside the respective overloaded method