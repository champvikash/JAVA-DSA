package com.example.mycode.matrix;

import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
  //      int[] arr={-18,-12,-4,0,8,12,15,46,75,78,99};
//        int target=15;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=orderAgnosticBS(arr, target);
        System.out.print(ans);
    }
    static int orderAgnosticBS(int[]arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid= start + (end-start) /2;

            if(arr[mid]==target){
                return mid;

            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                    if (target>arr[mid]){
                        end=mid-1;

                    }
                    else {
                        start=mid+1;
                    }
                }

            }
        return -1;
        }
    }



