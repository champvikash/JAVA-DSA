package com.example.mycode.matrix.newBatch;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistBasics {
    public static void main(String[] args) {
        ArrayList<Integer> mylist1 = new ArrayList<Integer>();
        ArrayList<Integer> mylist2 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        mylist1.add(1);
        mylist1.add(3);
        mylist2.add(2);
        mylist2.add(4);
        mylist2.add(6);
        mylist2.add(8);

        System.out.println(addArraylist(mylist1,mylist2));
    }

    public static ArrayList<Integer> addArraylist(ArrayList<Integer> mylist1, ArrayList<Integer> mylist2){
        int f=0, s=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(f<mylist1.size() && s<mylist2.size()){
            if(mylist1.get(f)< mylist2.get(s)){
                ans.add(mylist1.get(f));
                f++;
            } else {
                ans.add(mylist2.get(s));
                s++;
            }
        }
      while(f<mylist1.size()) ans.add(mylist1.get(f++));
      while(s<mylist2.size()) ans.add(mylist2.get(s++));
      return ans;
    }
}
