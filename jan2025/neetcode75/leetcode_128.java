package com.example.mycode.matrix.jan2025.neetcode75;

import java.util.Arrays;

public class leetcode_128 {

    public static void main(String[] args) {
        int[] nums = new int[]{9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestQ(nums));
    }

    private static int longestQ(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i + 1] && (nums[i+1] - nums[i]) == 1  && nums[i] > 0) {
                ans++;
            }
        }
        return ans;
    }
}



