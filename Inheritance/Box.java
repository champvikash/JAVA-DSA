package com.example.mycode.matrix.Inheritance;
class Box {
    public double weight;
    double h;
    double l;
    double w;
    String color="white";

     Box(double h, int i, int i1) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
     Box() {
        this.h=1.1;
        this.l=2.3;
        this.w=4.4;

    }

    Box(double h, double l) {
        this.h = h;
        this.l = l;
    }
}