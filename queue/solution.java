package com.example.mycode.queue;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Hight
        System.out.println("Please Enter Hight");
        int H = sc.nextInt();

        //width
        System.out.println("Please Enter Width");
        int W = sc.nextInt();

        //Depth
        System.out.println("Please Enter Depth");
        int D = sc.nextInt();

       int V = H*W*D;

       // DIVIDE BY 1728

        V = V/1728;

        System.out.println("Volume = "+ V +" cu ft");


    }
}
