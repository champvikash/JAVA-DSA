package com.example.mycode.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class inbuiltfuctionforsorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);

        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
