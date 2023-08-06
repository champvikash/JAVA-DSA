package com.example.mycode.matrix.stack;

import java.util.Stack;

public class paranthesisValid {
    public static void main(String[] args) {
        String str = "{([])}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String x){
        // add your code here

        Stack<Character> stk = new Stack<>();

        for(char ch : x.toCharArray() ) {
            if (ch == '(') {
                stk.push(')');
            } else if (ch == '{') {
                stk.push('}');
            } else if (ch == '[') {
                stk.push(']');
            } else if (!stk.isEmpty() && ch == stk.peek()) {
                stk.pop();
            } else {
                return false;
            }
        }
        return stk.isEmpty();
    }
}
