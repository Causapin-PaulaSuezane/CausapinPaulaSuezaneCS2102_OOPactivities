package Shapes;

public class ShapeCollection {
    // Property
    private Shape[] shapes;

    // Constuctor
    public ShapeCollection(Shape[] shapes) {
        this.shapes = shapes;
    }
    public void getPropertyValues(){
        for (Shape shape : shapes) {

            if (shape instanceof Square) {
                ((Square) shape).printShapeType();

            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).printShapeType();
                
            } else if (shape instanceof Triangle) {
                ((Triangle) shape).printShapeType();
            }
            System.out.printf("Area : %.2f\n", shape.getArea());
            System.out.printf("Perimeter : %.2f\n\n", shape.getPerimeter());
        }
    }
}
