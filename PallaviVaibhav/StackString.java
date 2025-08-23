package com.example.mycode.matrix.PallaviVaibhav;

import java.util.Stack;

public class StackString {
    public static void main(String[] args) {


        Stack<String> plates = new Stack<>();

        /*
        plates.push("Pallavi");
        plates.push("Srishti");
        plates.push("Sameer");
        System.out.println(plates);


         */

        String[] name ={"Vikash" , "Manish" , "Sruti" , "Srishti" , "vikashOner"  , "Raju" , "anjali" , "Rajat" , "Main"  , "Rakesh"};
        for (int i=0; i<name.length; i++) {
            plates.push(name[i]);
        }

        System.out.println(plates);

        System.out.println(plates.size());
/*
        for(int i=0 ; i< plates.size() ; i++){
            System.out.println(plates.size());
            plates.pop();
        }


 */

        int i =0 ;
        System.out.println("Palte Size: "  + plates.size());
        while(i <= plates.size() ){
            plates.pop();
            i++;
        }

        System.out.println(plates.isEmpty());
        System.out.println(plates);


    }
}
