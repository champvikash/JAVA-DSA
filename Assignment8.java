package com.example.mycode.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];


    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int n = mergedArray.length;
        int median = 0;
        float ans = 0;

        int pos = 0;
        for (int element : nums1) //copying elements of secondArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++; //increases position by 1
        }
        for (int element : nums2) //copying elements of firstArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;
        }
        Arrays.sort(mergedArray);
        if(mergedArray.length % 2 != 0){
            median = mergedArray.length/2;
            ans = mergedArray[median];
        }
        else {
            median = mergedArray.length/2;
            ans = mergedArray[median] + mergedArray[median - 1] ;
            ans /= 2;
        }
        return ans;
    }
}

