package com.example.mycode.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class wavearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] A =new int[n];
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();

        }
        Arrays.sort(A);
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+ " ");
        }


        System.out.println();


        int [] B =new int [n];
        int k=0;

        for(int i=1; i<n; i+=2){
            B[i]=A[k];
            k++;
        }

        //  for(int i=0; i<A.length; i++){
        //    System.out.println(A[i]+ " ");
        // }

//
        for(int i=0; i<n; i+=2){
             B[i]=A[k];
            k++;
        }

        for(int i=0; i<B.length; i++){
            System.out.print(B[i]+ " ");
        }

    }
}
