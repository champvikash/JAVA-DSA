package com.example.mycode;
// question  Find in Mountain Array
// link leetcode -> https://leetcode.com/problems/find-in-mountain-array/
public class FindinMountainArrayleetcode {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,9,8,7};
        int target=9;

    }
    int search(int [] arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr,target, 0,arr.length-1);
        if(firstTry!= -1){
            return firstTry;

        }
        return orderAgnosticBS(arr, target , peak+1, arr.length-1);

    }

    public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]) {
                //now you are in decreasing order
                end = mid;

            }else{
                start=mid+1;
            }

        }

        return start;

    }

    static int orderAgnosticBS(int[]arr, int target , int start , int end){

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
