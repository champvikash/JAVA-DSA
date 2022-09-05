package com.example.mycode;

public class sqrRoot {
    public static void main(String[] args) {

        int x=64;

        System.out.print(mySqrt(x));

    }

    public static int mySqrt(int x) {

        int nums =0;
        if(nums*nums<=x){

            nums++;
        }

        return nums;
    }
}

