package com.example.mycode.matrix.OOPs;

import java.util.ArrayList;

public class Main {

    public static class YouTubevideo {
        String name;
        int numberofViews, numberofLikes;
        ArrayList<String> comments;
    }

    public static void main(String[] args) {
        YouTubevideo songVideo = new YouTubevideo();
        songVideo.name = "Keshariya";
        songVideo.numberofLikes = 1000000;
        songVideo.numberofViews = 1000001;
        songVideo.comments = new ArrayList<>();
        songVideo.comments.add("good");
        songVideo.comments.add("nice");
        System.out.println("Name of video:" + songVideo.name);
        System.out.println("numberoflikes:" + songVideo.numberofLikes);
        System.out.println("numberofViews:" + songVideo.numberofViews);
        System.out.println("comments:" + songVideo.comments);



    }

}
