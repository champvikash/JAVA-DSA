package com.example.mycode.newBatch;

import java.util.Stack;

public class stackoperation {
    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='{' || c=='(' || c=='['){
                st.push(c);
            } else {
                if(st.isEmpty()) return false;
                if(c=='}' && st.peek() !=c) return  false;
                if(c==')' && st.peek() !=c) return  false;
                if(c==']' && st.peek() !=c) return  false;
                st.pop();
            }
        }
            return st.isEmpty();
    }
}
