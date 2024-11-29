package Shapes;

public class Square implements Shape {
    // Properties
    private double side;

    // Constructor
    public Square(double side){
        this.side = side;
    }
    
    // Methods
    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void printShapeType() {
        System.out.println("Square");
    }
}
