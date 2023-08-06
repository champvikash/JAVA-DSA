package com.example.mycode.Subarray;
//Largest Sum Contiguous Subarray (Kadane’s Algorithm)
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
import java.util.Scanner;

public class Maximumsumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int ans = maxSubArraySum(arr);
        System.out.println(ans);
    }
public static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max = Integer.MIN_VALUE, min= 0;

        for (int i = 0; i < size; i++) {
            min = min + a[i];
            if (max < min)
                max = min;
            if (min < 0)
                min = 0;
        }
        return max;
    }
}
