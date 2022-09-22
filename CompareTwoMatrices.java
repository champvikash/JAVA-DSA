package com.example.mycode;

import java.util.Scanner;

public class CompareTwoMatrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();

        int[][] arr1=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt(), y=sc.nextInt();
        int[][] arr2=new int[x][y];

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                arr2[i][j]=sc.nextInt();
            }

        }


        boolean ans=true;
        if(n != x || m != y){
            ans=false;
        }else{
            for(int i=0; i<n; i++){
                for(int j=0; j<y; j++){
                    if(arr1[i][j] != arr2[i][j]){
                        ans=false;
                        break;
                    }
                }

                if(!ans){
                    break;
                }
            }
        }


        if(ans){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }





//         if(n==x && m==y){
//          for(int row=0; row<n; row++){
//          for(int col=0; col<m; col++){
//           if(arr1[row][col]==arr2[row][col]){

//           System.out.println("same1");
//           }else{
//           System.out.println("not same2");

//           }

//              }
//          }

//         }else{
//        System.out.println("not same3");
//         }


    }
}
