package com.example.mycode;

import java.util.Scanner;

public class rotatearray {

    public static void reverseArray(int[] arr, int x, int y){


        while(x<y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;

        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int k=sc.nextInt();


        reverseArray(arr, 0,n-k-1);
        reverseArray(arr,n-k, n-1);
        reverseArray(arr, 0, n-1);


        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
