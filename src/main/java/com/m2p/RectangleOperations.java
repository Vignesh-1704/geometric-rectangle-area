package com.m2p;

public class RectangleOperations {

    private final int length;
    private final int breadth;

    RectangleOperations(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static RectangleOperations createSquare(int side)
    {
        return new RectangleOperations(side,side);
    }


    public int getArea()  {
        if (length < 0 || breadth < 0) {
            throw new IllegalArgumentException();
        }
        return length * breadth;
    }

    public int getPerimeter() {
        if (length < 0 || breadth < 0) {
            throw new IllegalArgumentException();
        }
        return 2 * (length + breadth);
    }

//    public int areaOfSquare(int side) {
//        if (side < 0) {
//            throw new IllegalArgumentException();
//        }
//        return side * side;
//    }
//
//        public int perimeterOfSquare(int side){
//            if (side < 0) {
//                throw new IllegalArgumentException();
//            }
//            return 4 * side;
//        }
    }
