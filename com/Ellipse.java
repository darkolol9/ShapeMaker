package com;

public class Ellipse extends Shape implements twoDimensional {

    double horizontalRadius,verticalRadius;

    public Ellipse(double h,double v) {
        horizontalRadius = h;
        verticalRadius = v;
        this.dimension = "2D";
        this.shapeName = "Ellipse";
    }

    public String whoAmI() {
        return "2D:Ellipse";
    }

    public double getArea() {
        return Math.PI * horizontalRadius * verticalRadius;
    }

    public double getCircumference() { //approximation formula
        return 2 * Math.PI * 
        Math.sqrt(
            (Math.pow(this.horizontalRadius, 2) +
             Math.pow(this.verticalRadius, 2))/2
             );
    }

    public void getInfo() {
        System.out.println("Dimension: " + this.dimension);
        System.out.println("Type: " + this.shapeName);
        System.out.println("Properties: ");
        System.out.printf("Horizontal: %f\n",this.horizontalRadius );
        System.out.printf("Vertical: %f\n", this.verticalRadius);

        
    }
    
}
