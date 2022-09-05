package com.example.mycode;

import java.util.Scanner;

public class smallestcharacterLeetcode {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();


        // Character input
        char [] c = new char[n];
        for (int i=0; i<n; i++){
            c[i]=sc.next().charAt(0);
        }
        int target=sc.next().charAt(0);
        int ans= nextGreatestLetter(c , (char) target);
        System.out.print(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }
}






