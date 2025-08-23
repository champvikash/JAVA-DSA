package com.example.mycode.matrix.sameer;

public class PracticeCode {

    public static void main(String[] args) {

        int[] bankholder = {55, 66, 77, 88,};

        for (int i = 0; i < bankholder.length; i++) {
            System.out.println(bankholder[i]);
        }





        String[] studentname = {"sameer", "vikash", "sristi", "pallavi", "manish"};

        for (int i = 0; i < studentname.length; i++) {
            if (studentname[i] == "sameer") {
                System.out.println(studentname[i] + " ka DRCC nahi hua hai");
            } else if (studentname[i] == "vikash") {
                System.out.println(studentname[i] + " ka DRCC nahi hua hai");
            } else {
                System.out.println(studentname[i] + "inka ho gya hai");
            }
        }
    }
}
