package com;

abstract class Shape {
    String dimension;
    String shapeName;

    public int compare(Shape s) { //will get back to that later
        if (s.getArea() < this.getArea()) 
            return -1;
        
        if (s.getArea() > this.getArea())
            return 1;

        return 0;
    }

    abstract public String whoAmI();

    abstract public double getArea();

    abstract public void getInfo();


}