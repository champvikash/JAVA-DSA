package com.example.mycode.matrix;

class toeplitzMatrix {
    public static void main(String[] args) {
        int [][] matrix = { {1,2,3,4},
                            {5,1,2,3},
                            {9,5,1,2},
                    };

        System.out.println(isToeplitzMatrix(matrix));

    }

    public static boolean isToeplitzMatrix(int[][] matrix) {

        // base case
        if (matrix == null) {
            return true;
        }

        for (int i = 0; i < matrix.length - 1; i++)
        {
            for (int j = 0; j < matrix[0].length - 1; j++)
            {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
