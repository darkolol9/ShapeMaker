package com;

public class Circle extends Shape implements twoDimensional {
    double radius;

    public Circle(double r) {
        radius = r;
        this.dimension = "2D";
        this.shapeName = "Circle";
    }

    public String whoAmI() {
        return "2D:Circle";
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void getInfo() {
        System.out.println("Dimension: " + this.dimension);
        System.out.println("Type: " + this.shapeName);
        System.out.println("Properties: ");
        System.out.printf("Radius: %f\n",this.radius );
        
    }
}
