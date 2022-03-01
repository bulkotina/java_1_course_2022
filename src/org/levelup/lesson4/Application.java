package org.levelup.lesson4;

public class Application {
    public static void main(String[] args) {
      //  Shape s = new Shape();
        Rectangle r = new Rectangle();
        System.out.println();
        // Shape s = new Shape(4,5,5,4);
        // s.perimeter();

        // Rectangle r = new rectangle(...);
        // r.perimeter();
        int[] shapeSides = {3, 5, 7, 2};
        // аналогично записи:
        //int arr = {4,5,6} ->
        // int [] arr = new int[3];
        // arr[0] = 4;
        // arr[1] = 5;
        // arr[2] = 6;
        Shape firstShape = new Shape(shapeSides);
        double firstShapePerimeter = firstShape.perimeter();
        System.out.println("Периметр первой фигуры: " + firstShapePerimeter);

        Rectangle firstRectangle = new Rectangle(5,4);
        double firstRectanglePerimeter = firstRectangle.perimeter();
        System.out.println("Периметр первого прямоугольника: " + firstRectanglePerimeter);

       ShapeStorage storage = new ShapeStorage();
       storage.addShape(firstShape);
       storage.addShape(firstRectangle); //firstRectangle->Shaoe -> shapes[index]
       storage.addShape(new Rectangle(4,8)); //new Rectangle object created
        storage.addShape(new Triangle(4,5,6));

        //shapes[0] - Shape
        //shapes[1] - Rectangle
        //shapes[0] - Rectangle
        //shapes[0] - Triangle
        storage.printPerimeters();
    }
}
