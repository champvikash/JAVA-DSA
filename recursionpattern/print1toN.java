package com.example.mycode.recursionpattern;

import java.util.Scanner;

public class print1toN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

    }
    public static void printholeN(int n){
        if(n==5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        printholeN(n+1);

    }

}
