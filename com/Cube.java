package com;

public class Cube extends Shape implements threeDimensional {

    double edge;

    public Cube(double e) {
        edge = e;
        this.dimension = "3D";
        this.shapeName = "Cube";
    }

    public String whoAmI() {
        return "3D:Cube";
    }

    public double getArea() {
        return 6 * edge * edge;
    }

    public double getVolume() {
        return edge * edge * edge;
    }

    public void getInfo() {
        System.out.println("Dimension: " + this.dimension);
        System.out.println("Type: " + this.shapeName);
        System.out.println("Properties: ");
        System.out.printf("Edge : %f\n",this.edge );
        
    }
    
}
