package com.example.mycode;

import java.util.Scanner;

public class assignment4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

    }

    public int maximumProduct(int[] nums) {
        int res = Math.m
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    res = Math.max(res, nums[i] * nums[j] * nums[k]);
                }
            }
        }
        return res;
    }


}
