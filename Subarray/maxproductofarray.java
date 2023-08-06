package com.example.mycode.Subarray;

import java.util.Scanner;

//Maximum Product Subarray
//https://www.geeksforgeeks.org/maximum-product-subarray/
public class maxproductofarray {
    public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n];
        for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
       System.out.println(maxSubarrayProduct(arr));
}
    public static int maxSubarrayProduct(int arr[])
    {
        // Initializing result
        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            // traversing in current subarray
            for (int j = i + 1; j < n; j++) {
                // updating result every time to keep an eye
                // over the maximum product
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            // updating the result for (n-1)th index.
            result = Math.max(result, mul);
        }
        return result;
    }
}

