package com.company;

public class MarbleBag {

    int red;
    int green;
    int blue;

    public MarbleBag(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    int getTotalNumberOfMarbles(){

        return red + green + blue;
    }


    public String printInfo(){

        return "you have " + red + " red marbles, " + green + " green marbles, and " + blue + " blue marbles.";
    }

    void removeAllGreenMarbles(){

        green = 0;
    }
}
