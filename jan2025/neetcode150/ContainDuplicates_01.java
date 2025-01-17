package com.example.mycode.matrix.jan2025.neetcode150;

import java.util.Arrays;

public class ContainDuplicates_01 {

    public static void main(String[] args) {
        int[] arr = {9, 5, 0, 4, 6 , 6};
      //  Arrays.sort(arr);
      //  System.out.println(isContainDuplicate(arr));
        System.out.println(isContainDuplicate1(arr));
    }


    public static Boolean isContainDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0, j = 1;
        while (i < n && j < n) {
            if (arr[i] == arr[j]) {
                return true;
            } else {
                i++;
                j++;
            }

        }

        return false;
    }

    public static Boolean isContainDuplicate1(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }

        return false;
    }

}
