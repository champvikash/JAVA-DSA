package com.example.mycode.codingNinja;
// question link: https://www.codingninjas.com/codestudio/contests/codestudio-weekend-contest-47/6826323/problems/22471
public class maxElement {

    public static void main(String[] args) {

        int[] a = {1,3,4,2 ,4, 5};
        System.out.println(maximumElement(a));

    }



    static int maximumElement(int []a) {
        int odd = 0;
        int even = 0;
        int n = a.length;

        // Calculating OR of all elements at odd indices.
        for (int i = 0; i < n; i += 2) {
            odd |= a[i];
        }

        // Calculating OR of all elements at even indices.
        for (int i = 1; i < n; i += 2) {
            even |= a[i];
        }

        // Return maximum of odd and even.
        return Math.max(odd, even);

    }
}
