package com;

public class Main {

    public static void main(String[] args) {
        DrawingBoard board = new DrawingBoard();

        board.add("circle",4);
        board.add("rectangle",5,6);
        // board.add("ball",8);

        board.getMax().getInfo();

    }
    
}
