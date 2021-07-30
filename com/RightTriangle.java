package com;

public class RightTriangle extends Shape implements twoDimensional {

    double height;
    double base;

    public RightTriangle(double h,double base) {
        height = h;
        this.base = base;
        this.dimension = "2D";
        this.shapeName = "RightTriangle";

    }
    
    public String whoAmI() {
        return "2D:RightTriangle";
    }

    public double getCircumference() {
        return base + height + Math.sqrt(base*base + height* height);

    }

    public double getArea() {
        return base * height /2;
    }

    public void getInfo() {
        System.out.println("Dimension: " + this.dimension);
        System.out.println("Type: " + this.shapeName);
        System.out.println("Properties: ");
        System.out.printf("Height: %f\n",this.height );
        System.out.printf("Base Length: %f\n", this.base);

        
    }

}
