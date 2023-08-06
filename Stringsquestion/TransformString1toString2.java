package com.example.mycode.Stringsquestion;

public class TransformString1toString2 {

    public static void main(String[] args) {

        String A = "horse";
        String B = "ros";
//        System.out.println(minOpsReq(A,B));
        System.out.println(getMinConversions(A,B));
    }

    public static int minOpsReq(String A, String B) {

        // This parts checks whether conversion is possible
        // or not
        if (A.length() != B.length())
            return -1;

        int i, j, res = 0;
        int count[] = new int[256];

        // count characters in A
        // subtract count for every character in B
        for (i = 0; i < A.length(); i++) {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }

        // Check if all counts become 0
        for (i = 0; i < 256; i++)
            if (count[i] != 0)
                return -1;

        i = A.length() - 1;
        j = B.length() - 1;

        while (i >= 0) {
            // If there is a mismatch, then keep
            // incrementing result 'res' until B[j] is not
            // found in A[0..i]
            if (A.charAt(i) != B.charAt(j))
                res++;
            else
                j--;
            i--;
        }
        return res;
    }
    public static int getMinConversions(String str1, String str2){
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            for(int j=0;j<=str2.length();j++){
                if(i==0)
                    dp[i][j] = j;
                else if(j==0)
                    dp[i][j] = i;
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
}
