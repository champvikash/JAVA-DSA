package com.example.mycode.matrix.Inheritance;

public class Main2 {
    public void main(String[] args) {

//        Hotstar vikash = new Hotstar(5,8,true);
//        System.out.println(vikash.likes +" "+ vikash.view+" "+vikash.suscribed);

        Netflix suraj = new Netflix(45,88,5);
        System.out.println(suraj.likes + " "+ suraj.view +suraj.host);


    }
}

class Netflix<sout> extends Hotstar {
    int host;
    String color = "red";



    public Netflix(int likes,int view,int host) {
        this.host=host;
    }

}

class Hotstar {
    int view;
    int likes;
    boolean suscribed;

    String color="black";


    public Hotstar() {
        this.view = 45;
        this.likes = 44;
        this.suscribed = true;
    }
}
