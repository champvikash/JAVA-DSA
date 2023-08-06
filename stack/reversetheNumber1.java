package com.example.mycode.matrix.stack;

import java.util.Scanner;
import java.util.Stack;

public class reversetheNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> st = new Stack<>();

        while(n-->0){
            int num  = sc.nextInt();
            String str = "" + num;
            for(int i=0; i<str.length(); i++){
                st.push(str.charAt(i));
            }
            System.out.println(findthenumber(st));
        }

    }
    public static int findthenumber(Stack<Character> st){
        int ans = 0;
        while(!st.isEmpty()){
            char c = st.pop();
            int digit = c - '0';
            ans = ans * 10 + digit;
        }
        return ans;
    }
}
