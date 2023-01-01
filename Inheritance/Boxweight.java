package com.example.mycode.Inheritance;

public class Boxweight extends Box{

    double  weight;
    String color="black";

    public Boxweight(double weight) {
        this.weight = -1;
    }

    public Boxweight(double h, double l, double weight) {
        super(h, l);
        this.weight = weight;
    }
}
