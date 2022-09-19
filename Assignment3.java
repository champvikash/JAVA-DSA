package com.example.mycode;

// https://leetcode.com/problems/third-maximum-number/


import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(new int[]{thirdMax(nums)}));

    }

    public static int thirdMax(int[] nums) {


        if (nums == null || nums.length == 0) return -1;




         //  The Integer. MIN_VALUE is a constant in the Integer
        // class that represents the minimum or least integer value that can be represented in
        // 32 bits, which is -2147483648, -231. This is the lowest value that any
        // integer variable in Java can hold.


        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > one) {
                one = nums[i];
            }
        }

        for (int j = 0; j < nums.length; j++) {
            int i = nums[j];
            if (i > two && i < one) {
                two = i;
            }
        }

        boolean status = false;
        for (int j = 0; j < nums.length; j++) {
            int i = nums[j];
            if (i >= three && i < two) {
                three = i;
                status = true;
            }
        }

        if (status) {
            return three;
        } else {
            return one;
        }

    }
}