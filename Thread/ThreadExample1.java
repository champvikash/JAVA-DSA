package com.example.mycode.matrix.Thread;

public class ThreadExample1 extends Thread{
    public void run(){
        int a = 10;
        int b = 20;
        int result = a+b;
        System.out.println("Thread start");
        System.out.println("Sum of Two Numbers"+" "+ result);
    }


    public static void main(String[] args) throws InterruptedException {
     ThreadExample1 t1 = new ThreadExample1();
     ThreadExample1 t2 = new ThreadExample1();
     ThreadExample1 t3 = new ThreadExample1();

     t1.start();
        System.out.println("t1"+ t1.getState());
     t2.sleep(100,100);

     t2.start();
        System.out.println("t2"+ t2.getState());
     t3.start();
        System.out.println("t3"+ t3.getState());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());


        System.out.println(t1.setPriority());
        System.out.println(t2.setPriority());
        System.out.println(t3.setPriority());

    }


    private int setPriority() {
        return 1;
    }

}
