package com.example.mycode;
// link: https://leetcode.com/problems/container-with-most-water/
//question number 11
public class Assignment9 {

    public static void main(String[] args) {
        int[] hight = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(hight));
    }

    public static int maxArea(int[] height) {


        int ans=0;
        int i=0,j=height.length-1;
        while(j>i){
            System.out.println("start from here:");
            System.out.println("i,j:" + i + " "+j);
            int x = Math.min(height[i],height[j])*(j-i);
            System.out.println("x:"+ x);
            System.out.println("height[i]:"+height[i]);
            System.out.println("height[j]"+ height[j]);
            System.out.println("(j-i)"+ (j-i));
            System.out.println("ans:"+ ans);
            ans=Math.max(ans,x);
            System.out.println("ans:"+ ans);
            if(height[i]<height[j]){
                i++;
                System.out.println("i:"+i);
            }

            else {
                j--;
                System.out.println("j"+ j);
            }
        }

        return ans;


    }
}
