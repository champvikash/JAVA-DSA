package com.example.mycode.matrix.jan2025.neetcode75;

import java.util.*;

public class leetcode_49 {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
        int[] arr = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(funOne(arr)));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }


    public static int[] funOne(int[] arr1) {
        int[] arr = new int[arr1.length];
        int i = 0;
        int finaRes = 1;
        while (i < arr1.length) {
            int itemProduct = 1;

            for (int p = 0; p < arr1.length; p++) {
                if (i != p) {
                    itemProduct = itemProduct * arr1[p];
                }
            }
            finaRes = arr1[i] * itemProduct;
            arr[i] = itemProduct;
            i++;
            System.out.println(finaRes);
        }

        return arr;

    }
}