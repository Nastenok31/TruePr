package com.company;

public class Dog {
    public String name = "Caesar";
    public int age = 7;
    public String species = "Corgi";

    public Dog(){};
    @Override
    public String toString(){
        return "Dog's " + "name is " + name + ", age= " + age;
    }
}
