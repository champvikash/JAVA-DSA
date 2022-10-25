package com.example.mycode;

public class Strings_10campreTwoarrayStrings {

    public static void main(String[] args) {

       String[] word1 = {"ab", "c"};
       String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2));


    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int arrindex1 = 0, arrindex2 = 0;
        int id1 = 0, id2 = 0;

        while (arrindex1 < word1.length && arrindex2 < word2.length) {
            if (word1[arrindex1].charAt(id1) != word2[arrindex2].charAt(id2)) {
                return false;
            }
            id1++;
            id2++;

            if (id1 == word1[arrindex1].length()) {
                id1 = 0;
                arrindex1++;
            }

            if (id2 == word2[arrindex2].length()) {
                id2 = 0;
                arrindex2++;
            }
        }

        return arrindex1 == word1.length && arrindex2 == word2.length;

    }
}