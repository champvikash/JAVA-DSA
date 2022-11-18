package com.example.mycode.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.hackerrank.com/contests/july22-java-dsa-class-challenges/challenges/character-by-frequency
//Character and it's Frequency
public class Assignment2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        HashMap<Character,Integer> freq = new HashMap<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            char ch = sc.next().charAt(0);

            //freq.put(ch, freq.getOrDefault(ch,0)+1);

            if(!freq.containsKey(ch)){
                freq.put(ch,1);
            } else{
                int prevFreq = freq.get(ch);
                int newFreq  = prevFreq+1;
                freq.put(ch, newFreq);
            }

        }



        for(Map.Entry<Character,Integer> itr : freq.entrySet()){
            System.out.println(itr.getKey()+" "+itr.getValue());
            // System.out.println(itr.getKey()+" "+ itr.getValue);


        }



    }
}