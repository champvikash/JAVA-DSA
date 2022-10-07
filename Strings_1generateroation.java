package com.example.mycode;

import java.util.Scanner;

public class Strings_1generateroation {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int n = str.length();

      for(int i=0; i<n; i++){
         String rotation = "";
         for(int j=n-i; j<n; j++){
             rotation +=str.charAt(j);
         }for(int j=0; j<n-i; j++){
             rotation += str.charAt(j);
          }
          System.out.println(rotation);
      }




    }

}
