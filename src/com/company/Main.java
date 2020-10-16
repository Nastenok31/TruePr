package com.company;
import java.lang.*;
public class Main{
    public static void main(String[] args) {
        Dog FirstDog = new Dog();
        System.out.println(FirstDog.toString());
        Ball FirstBall = new Ball(750, "Red");
        System.out.println(FirstBall.toString());
        Book FirstBook = new Book(84);
        System.out.println(FirstBook.toString());
        Book SecondBook = new Book(143);
        System.out.println(SecondBook.toString());
    }
}