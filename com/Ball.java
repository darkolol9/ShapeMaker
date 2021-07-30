package com;

public class Ball extends Shape implements threeDimensional {
    double radius;

    public Ball(double r) {
        radius = r;
        this.dimension = "3D";
        this.shapeName = "Ball";
    }
    
    public String whoAmI() {
        return "3D:Ball";
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }

    public void getInfo() {
        System.out.println("Dimension: " + this.dimension);
        System.out.println("Type: " + this.shapeName);
        System.out.println("Properties: ");
        System.out.printf("Radius: %f\n",this.radius );

    }
    //to be edited
}
