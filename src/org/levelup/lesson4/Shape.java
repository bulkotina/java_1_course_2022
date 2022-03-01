package org.levelup.lesson4;

public class Shape {
    //superclass, baseclass

    int[] sides; // значения длин сторон фигуры

    Shape() {
        System.out.println("Execute Shape construstor");
    }

    Shape(int[] sides) { //конструктор, где на вход идет массив сторон
        this.sides = sides;
    }

    double perimeter() {
        System.out.println("ShapePerimeter()");
        double sum = 0;
        for (int i = 0; i < sides.length; i++) {
            sum = sum + sides[i];
        }
        return sum;
    }
}
