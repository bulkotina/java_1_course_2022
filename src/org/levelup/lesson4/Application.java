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
    }
}
