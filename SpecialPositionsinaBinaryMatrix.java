package com.example.mycode;

public class SpecialPositionsinaBinaryMatrix {
    public static void main(String[] args) {
        int[][] mat={
                {0,0,0,1},
                {1,0,0,0},
                {0,0,1,0},
                {0,0,0,0}
        };

        System.out.println(numSpecial(mat));

    }
    public static int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){

                    int col=0,row=0;
                    for(int k=0;k<m;k++) {
                        col+= mat[k][j];
                    }
                    for(int k=0;k<n;k++) {
                        row+= mat[i][k];
                    }
                    if(col==1 && row==1) {
                        count++;
                    }

                }
            }
        }

        return count;
    }
}
