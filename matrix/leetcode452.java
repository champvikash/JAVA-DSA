package com.example.mycode.matrix;

import java.util.Arrays;

public class leetcode452 {
    public static void main(String[] args) {
        int[][] points = {
                {10,16},
                {2,8},
                {1,6},
                {7,12}
        };
        //[[10,16],[2,8],[1,6],[7,12]]

        System.out.println(numberArrow(points));
    }

    public static int numberArrow(int[][] points){
        if(points.length ==0) return 0;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int arrow = 1;
        int end = points[0][1];
        for(int i=1; i< points.length; i++){
            if(points[i][0] > end){
                arrow++;
                end = points[i][1];
            }
        }
        return arrow;
    }
}
