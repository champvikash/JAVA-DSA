package com.example.mycode.matrix.AmazingCodes;

import java.util.Random;

public class GeneraterandomString {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        int length = 7;

        for (int i=0; i<length; i++){
            int index= random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        System.out.println("Random string"+randomString);
    }
}
