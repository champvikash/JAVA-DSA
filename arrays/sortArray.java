package com.example.mycode.arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr = {3,2,4,2,5};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }

            else if(nums[mid]==1){
                mid++;
            }
            else {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }


    }
}
