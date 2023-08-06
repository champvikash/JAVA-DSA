package com.example.mycode.matrix;

import java.util.Scanner;

public class String_5IsitaPangramString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPangram(str));
    }


        public static String isPangram(String str) {
        boolean[] isPresent = new boolean[26];

         for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {

                if (Character.isUpperCase(str.charAt(i))) {
                    isPresent[str.charAt(i) - 'A'] = true;
                }
                if (Character.isLowerCase(str.charAt(i))) {
                    isPresent[str.charAt(i) - 'a'] = true;
                }

            }
        }
        for (int i = 0; i < 26; i++) {
            if (!isPresent[i]) {
                return "NO";
            }
        }
        return "YES";
    }

}