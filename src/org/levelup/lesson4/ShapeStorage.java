package org.levelup.lesson4;

public class ShapeStorage {

    Shape[] shapes;
    int index;

    ShapeStorage() {
        this.shapes = new Shape[10];
        this.index = 0;
    }

    void addShape(Shape shape) {
        shapes[index] = shape;
        index = index + 1;
    }

    void printPerimeters() {
        for (int i = 0; i < shapes.length; i++) {
            //shapes[i] - > shape
            if (shapes[i] != null) {
                double p = shapes[i].perimeter();
                System.out.println(p);
                System.out.println();

            }
        }
    }
}
