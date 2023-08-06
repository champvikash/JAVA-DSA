package com.example.mycode.March2023;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};

        System.out.println(compress1(chars));
    }

    public static int compress(char[] chars) {
        if(chars.length == 1) return 1;
        String s = "";
        if(chars.length>1){
            int i=0, j=1;

            while(i<chars.length && j<chars.length){
                int numberofsamechar=1;
                if(chars[i]==chars[j]){
                    numberofsamechar++;
                    j++;
                } else{
                    s += chars[i]+numberofsamechar;
                    i++;
                    j=i+1;
                }
            }
        }

        return s.length();

    }
    public static int compress1(char[] chars){
        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i=0; i< chars.length; i++){
            freq.put(chars[i] , freq.getOrDefault(chars[i] , 0) +1);
        }
        int ans = 0;
        for(Map.Entry<Character,Integer> itr : freq.entrySet()) {
          ans =  itr.getKey()+itr.getValue();
            System.out.println( itr.getKey()+" "+itr.getValue());
        }
        return freq.size()*2;

    }
}
