package com.m2p;

public class RectangleOperations {
    public int area(int length, int breadth) throws IllegalArgumentException{
        if(length < 0 || breadth < 0) {
            throw new IllegalArgumentException();
        }
        return length * breadth;
    }
}
