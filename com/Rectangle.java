package com;

public class Rectangle extends Shape implements twoDimensional {

    double edge1,edge2;

    public Rectangle(double e1,double e2) {
        edge1 = e1;
        edge2 = e2;
        this.dimension = "2D";
        this.shapeName = "Rectangle";
    }

    public String whoAmI() {

        return "2D:Rectangle";
    }

    public double getCircumference() {

        return edge1 * 2 + edge2 * 2;
    }

    public double getArea() {

        return edge1 * edge2;
    }

    public void getInfo() {
        System.out.println("Dimension: " + this.dimension);
        System.out.println("Type: " + this.shapeName);
        System.out.println("Properties: ");
        System.out.printf("First Edge: %f\n",this.edge1 );
        System.out.printf("Second Edge: %f\n", this.edge2);

        
    }


    
    
}
