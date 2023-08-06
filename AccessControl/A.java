package com.example.mycode.matrix.AccessControl;

public class A {
    private int num;
    String name;
    int mnum;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name, int mnum) {
        this.num = num;
        this.name = name;
        this.mnum = mnum;
    }
}
