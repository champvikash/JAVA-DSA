package com.example.mycode.matrix.GreedyAlgorithms;

import java.util.Arrays;

public class MinimumCoins {
    public static void main(String[] args) {
        int[] coin = {5,10,2,1};
        int amount = 57;
        int n = 4;
        System.out.println(minCoins(coin,n,amount));
    }

    public static int minCoins(int coin[], int n, int amount) {
        Arrays.sort(coin);
        int res = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(coin[i] <= amount) {
                int c = (int)Math.floor(amount / coin[i]);
                res = res + c;
                amount = amount - c * coin[i];
            }
            if(amount == 0)
                break;
        }
         return res;
    }
}
