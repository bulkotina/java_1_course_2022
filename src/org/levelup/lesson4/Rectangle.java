package org.levelup.lesson4;

public class Rectangle extends Shape {
    //subclass

    //    int[] sides;
    Rectangle() {
        super(new int [0]);//создали пустой конструктор и передали в конструкторкласса Shape
        //всегда в первой строчке и ВСЕГДА только в конструкторе
        System.out.println("Execute Rectangle construstor");
    }

    Rectangle(int length, int width) {
        // this.sides = new int[]{length, width, length, width};
        //super.sides = new int[]{length, width, length, width};
        super(new int[] {length, width, length, width});
    }

//    double perimeter() {
//        double sum = 0;
//        for (int i = 0; i < sides.length; i++) {
//            sum = sum + sides[i];
//        }
//        return sum;
//    }
}
