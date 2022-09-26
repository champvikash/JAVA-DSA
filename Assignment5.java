package com.example.mycode;

/*
* question: Print columns having even number of odd numbers
* link: https://www.hackerrank.com/contests/july22-jd-contest-10-geekster/challenges/print-columns-having-even-number-of-odd-numbers/submissions/code/1349229582
*
*
*Take m as an integer input.

Then take n as an integer input.

Then make a matrix named mat having m rows and n columns which can store only integer type values.

Then take m*n elements as integer inputs and fill the matrix sequentially in a row wise manner starting from the 0th row.

Then print all the columns of the matrix having even number of odd numbers.

Note: If you print any column, make sure to print all the elements of that column in the same line.
*Input Format

In the first line m will be given

In the second line n will be given

Then the m*n elements of the matrix will be given.

Constraints

1<=m<=100

1<=n<=100

-2^31<=mat[i][j]<=2^31-1

Output Format

Print the output accordingly as shown. Make sure to use tab to separate elements within the same line.
*
* Sample Input 0

4
5
1 2 4 5 7
5 2 7 9 6
7 8 2 4 9
1 3 2 6 8
Sample Output 0

1    5    7    1
5    9    4    6
7    6    9    8
*
*
* */


import java.util.Scanner;

public class Assignment5 {



    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt(), n=sc.nextInt();
//        int[][] ar=new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                ar[i][j]=sc.nextInt();
//            }
//        }

       int m= 4;
        int n=5;
   int[][] mat= {
           {1, 2, 4, 5, 7},
           {5 ,2 ,7, 9, 6},
           {7 ,8 ,2, 4 ,9},
           { 1 ,3, 2 ,6, 8}
   };
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(ar[i][j]+"\t");
        //     }
        //     System.out.println();
        // }
        for(int j=0;j<n;j++){
            int count=0;
            for(int i=0;i<m;i++){
                if(mat[i][j]%2!=0)
                    count++;
            }
            if(count%2==0){
                for(int i=0;i<m;i++){
                    System.out.print(mat[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}
