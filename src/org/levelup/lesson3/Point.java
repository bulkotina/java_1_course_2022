package org.levelup.lesson3;

public class Point {
    //Поле класса (class field)
    int x;
    int y;
    String name;

    //конструктор по умолчанию
    public Point() {

    }

    Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //<тип возвращаемого значениея> <имя метода>  (<тип аргумента1> <имя аргумента1>,<тип аргумента2> <имя аргумента2>...или(могут быть пустыми))- то, что метод получит из вне {тело метода}
    // void - нет возвращаемого значения

    void changePoint(int newX, int newY){
    x = newX;
    y = newY;
    }
    //
    void printPoint(){
        System.out.println(name + "(" + x + ", " + y + ")");
    }

    // Сигнатура метода - имя метода + список аргументов (тип и порядок аргументов)
    // В одном классе не может быть 2 классов с одинаковой сигнатурой
    // Overloading - перегрузка метода - позволяет описывать методы с одинаковым названием, но разным набором аргументов
    void changePoint(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;

    }
    
    //
    int quadrant() {
//        int result = 0
//        if (x == 0 && y == 0){
//            result 0;
//        }
//        if (x > 0 &&  y > 0) {
//            result 1;
//        } else if (x  < 0 && y <0) {
//            result 4;
//        } else if (x < 0 && y > 0) {
//            result 2;
//        } else {
//            result 3;
//        }
//        return result;

        if (x == 0 && y == 0){
            return 0;
        }
        if (x > 0 &&  y > 0) {
            return 1;
        } else if (x  < 0 && y <0) {
            return 4;
        } else if (x < 0 && y > 0) {
            return 2;
        } else {
            return 3;
        }
      //  int quadrant = 0;
      //  return quadrant; //retirn 0;
    }
}
