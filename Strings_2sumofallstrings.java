package com.example.mycode.matrix;

import java.util.Scanner;

public class Strings_2sumofallstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(getValue(str));
        System.out.println(sumOfSubstrings(str));

    }
    public static int getValue(String str){
        int num = 0;
        for (int i = 0; i < str.length(); i++) {

            num *=10;
            num += Character.getNumericValue(str.charAt(i));
           // num = num + (int) (str.charAt(i) = '0');
        }

        return num;
    }


    public  static int sumOfSubstrings(String str){
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                String numstr =str.substring(i,j+1);
                int num = getValue(numstr);
                sum +=num;
            }
        }
        return sum;
    }
}
