package com.example.mycode.OOPs;

public class Movies {
    public static void main(String[] args) {
        movies batman1 = new movies("Batman1",8,200000,5000,"Rachel Gupta & Nikhil Chinapa","Disha");
        movies batman2 = new movies("Batman2", 2,9,500000,"Rannvijay Singha & Prince Narula","Neha Dhupia");
        movies batman3 = new movies("Batman3",4,700000,600,"Rachel Gupta & Prince Narula","Neha Dhupia");

       batman1.checkHit();
       batman2.checkHit();
       batman3.checkHit();

    }
}

class movies{
    String Name;
    int  Rating;
    int MoneyCollection;
    int Profit;
    String LeadActor;
    String LeadActress;

   public  boolean checkHit(){
        if(Rating>5){
           return true;
        }
        return false;
    }

    public movies(String name, int rating, int money, int profit, String leadActor, String leadActress) {
        this.Name = name;
        this.Rating = rating;
        this.MoneyCollection = money;
        this.Profit = profit;
        this.LeadActor = leadActor;
        this.LeadActress = leadActress;
    }

}