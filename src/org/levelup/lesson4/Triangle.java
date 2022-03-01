package org.levelup.lesson4;

public class Triangle extends Shape{

    Triangle(int a, int b, int c) {
        super(new int[] {a,c,b});
    }
    @Override
    double perimeter() {
        System.out.println("TrianglePerimeter()");
        return sides[0] + sides[1] +sides[2];
    }
}
