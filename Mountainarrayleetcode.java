package com.example.mycode.matrix;

//question number 853
// link->  https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Mountainarrayleetcode {

    public static void main(String[] args) {

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

}
