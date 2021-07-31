package com;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Ball(5),new Circle(4)};
        DrawingBoard board = new DrawingBoard(shapes);

        board.add("circle",4);
        board.add("rectangle",5,6);
        // board.add("ball",8);

        board.showAll();

    }
    
}
