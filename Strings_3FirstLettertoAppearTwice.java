package com.example.mycode;

import java.util.HashSet;
import java.util.Scanner;

// https://leetcode.com/problems/first-letter-to-appear-twice/
// 2351. First Letter to Appear Twice
//google asked


public class Strings_3FirstLettertoAppearTwice {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
        System.out.println(repeatedCharacter(s));


    }
    public static char repeatedCharacter(String s) {


        HashSet<Character> set = new HashSet<>();
        char ch;
        for(int i=0; i<s.length();i++)
        {
            ch= s.charAt(i);

            if(set.contains(ch))
                return ch;

            else
                set.add(ch);
        }

        return 'a';
    }
}

