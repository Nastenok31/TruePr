package com.company;

public class Book {
    String tag = "Harry Potter";
    int page;
    public Book (int tmp){
        page = tmp;
    }
    @Override
    public String toString() {
        return "Book's " + "tag is " + tag + ", page=" + page;
    }
}