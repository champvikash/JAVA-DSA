package com.example.mycode.matrix.arrays;

public class stringQustion {
    public static void main(String[] args) {
        String s = "abc";
        String t= "bgsdbca";
        System.out.println(subSequence(s,t));
    }
    public static boolean subSequence(String s, String t){

        int i=0,j=0;
        int n= s.length();
        int m= t.length();
        while (i<n && j<m){
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if(i==n){
            return true;
        }
        return false;
    }

}


