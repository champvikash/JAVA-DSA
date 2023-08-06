package com.example.mycode.matrix;

import java.util.Scanner;

public class Insertionshort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();

        }
        int key = sc.nextInt();

        for(int i=n-2; i>=0; i--){
            if(key<arr[i]){
                arr[i+1]=arr[i];
                if(i==0){
                    arr[i]=key;
                }
            }else{
                arr[i+1]=key;
                break;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    }

}
