package com.example.mycode;

import java.util.Scanner;

public class uppertriangle {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int[][] arr=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }

        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i<=j){
                    System.out.print(arr[i][j]+" ");

                }else {
                    System.out.print("0"+ " ");
                }
            }
            System.out.println();
        }

    }


}
