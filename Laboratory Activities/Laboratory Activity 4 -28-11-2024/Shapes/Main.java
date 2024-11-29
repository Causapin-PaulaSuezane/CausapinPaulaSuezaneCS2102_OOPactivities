package Shapes;

public class Main {
    public static void main(String[] args){

        Square square = new Square(11);
        Rectangle rectangle = new Rectangle(4, 24);
        Triangle triangle = new Triangle(4, 22, 3);

        // collection of shapes
        Shape[] shapes = {square, rectangle, triangle};
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        // for computing and printing the perimeter and area
        shapeCollection.getPropertyValues();

    }
}