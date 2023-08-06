package com.example.mycode.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class presum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n], sumpre=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }


        int l=sc.nextInt() , r=sc.nextInt();



        for(int i=0; i<n; i++){
           if(i==0){
               sumpre[i]=arr[i];
           }else{
               sumpre[i] += arr[i-1] +arr[i];
           }
        }

        for(int i=l; i<r; i++){
            System.out.println(Arrays.toString(sumpre));
        }



    }
}
