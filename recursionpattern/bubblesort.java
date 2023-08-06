package com.example.mycode.matrix.recursionpattern;

import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {

        int[] arr = {4,3,2,1};
        bubblesortwithrecursion(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubblesortwithrecursion(int[] arr, int r, int c){

        if(r == 0){
            return;
        }

        if(c < r){
            if(arr[c] > arr[c+1]){
                // swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;


            }
            bubblesortwithrecursion(arr, r , c+1);
        } else {
            bubblesortwithrecursion(arr, r-1, 0);
        }


    }

}
