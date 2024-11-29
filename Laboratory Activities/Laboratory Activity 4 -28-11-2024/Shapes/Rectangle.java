package Shapes;

public class Rectangle implements Shape {
    // Properties
    private double length, width;

    // Constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    // Methods
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public void printShapeType() {
        System.out.println("Rectangle");
    }
}

