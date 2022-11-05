//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article


package com.example.mycode.stack;

import java.util.Arrays;
import java.util.Stack;

public class Nextgreaterelement {
    public static void main(String[] args) {

            long arr[] = { 1, 3, 2, 4};
            int n = arr.length;
            System.out.println(Arrays.toString(nextLargerElement(arr, n)));

        }


        public static long[] nextLargerElement(long[] arr, int n){

        long[] ans =new long[n];
        Stack<Integer> stk = new Stack<>();

            for(int i=0; i<n; i++){

            while(!stk.isEmpty() && arr[stk.peek()]<arr[i]){
                ans[stk.pop()] = arr[i];

            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            ans[stk.pop()] = -1;
        }

        return ans;
        }

    }


