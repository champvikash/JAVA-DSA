package com.example.mycode;

import java.util.Scanner;

public class Assignment1 {
//    public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
        public boolean containsDuplicate(int[] arr) {

            boolean ans = false;

            for(int i = 0; i < arr.length; i++){
                for(int j = i+1; j < arr.length; j++){
                    if( arr[i]==arr[j]){
                        ans = true;
                        break;
                    }
                }
            }
            return ans;
        }


    }

















