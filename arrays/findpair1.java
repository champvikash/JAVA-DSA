package com.example.mycode.matrix.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class findpair1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int tar=sc.nextInt();
        Arrays.sort(arr);
        int i=0,j=n-1;
        while(i<j){
            if(i>0 && arr[i]==arr[i-1]){
                i++;
            }if(arr[i]+arr[j]==tar){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }else if(arr[i]+arr[j]>tar){
                j--;
            }else{
                i++;
            }
        }
    }
    }

