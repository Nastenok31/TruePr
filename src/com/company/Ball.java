package com.company;

public class Ball{
    public String colour;
    public int rad;
    public String type = "basketball";
    public Ball(int rad_tmp, String colour_tmp){
        colour = colour_tmp;
        rad = rad_tmp;
    }
    @Override
    public String toString() {
        return "Ball's " + " colour is " + colour + ", radius = " + rad + "mm, type is " + type;
    }
}