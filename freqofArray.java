package com.example.mycode.HashMap;

import java.util.HashMap;
import java.util.Map;

public class freqofArray {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4};
        System.out.println(findFreq(arr));
    }

    public static boolean findFreq(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }


        for (Map.Entry<Integer, Integer> itr : freq.entrySet()) {

//            System.out.println(itr.getKey() +" "+ itr.getValue());
            if(itr.getKey() != itr.getValue()) {
                return false;
            }


        }

        return true;
    }
}
