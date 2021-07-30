package com;

import java.util.Arrays;

    //the board acts as a factory in the sense that it is responsible of creating shapes in runtime
public class DrawingBoard { 

    int storageSize;
    Shape[] shapes;

    public DrawingBoard(Shape[] shapes) {
        storageSize = shapes.length;
        this.shapes = shapes;
    }

    public DrawingBoard() {
        storageSize = 0;
        shapes = new Shape[5];

    }

    //the portion responsible for creating the objects
    public void add(String name,double... properties) { 

        if (storageSize == shapes.length) 
            shapes = Arrays.copyOf(shapes, shapes.length * 2);
            

        if (name.equalsIgnoreCase("Ball")) {
            shapes[storageSize] = new Ball(properties[0]);
            storageSize++;
        }


        if (name.equalsIgnoreCase("Circle")) {
            shapes[storageSize] = new Circle(properties[0]);
            storageSize++;
        }

        if (name.equalsIgnoreCase("Cube")) {
            shapes[storageSize] = new Cube(properties[0]);
            storageSize++;
        }

        if (name.equalsIgnoreCase("ellipse")) {
            shapes[storageSize] = new Ellipse(properties[0],properties[1]);
            storageSize++;
        }

        if (name.equalsIgnoreCase("rectangle")) {
            shapes[storageSize] = new Rectangle(properties[0],properties[1]);
            storageSize++;
        }

        if (name.equalsIgnoreCase("righttriangle")) {
            shapes[storageSize] = new RightTriangle(properties[0],properties[1]);
            storageSize++;
        }

       

    }

    public void showAll() {

        for (int i = 0;i < storageSize;i++) {

            System.out.printf("Shape: ", i);
            //classic Polymorphism
            shapes[i].getInfo();  
        }
    }

    public Shape getMax() {

        Shape maxShape = null;
        double max = 0;

        for (int i = 0;i<storageSize;i++) {
            if (shapes[i].getArea() > max) {
                max = shapes[i].getArea();
                maxShape = shapes[i];
            }
        }
        return maxShape;
    }

    public Shape getMax3D() {
        Shape maxShape = null;
        double max = 0;

        for (int i =0;i<storageSize;i++) {

            //ideally would have used x isinstance y to check wether the casting would work, but the task excplicitly required this
             if (shapes[i].whoAmI().contains("3D")) { 
                 threeDimensional t = (threeDimensional) shapes[i];
                 if (t.getVolume() > max) {
                     max = t.getVolume();
                     maxShape = shapes[i];
                 }
             }
        }

        return maxShape;
    }
    
}
