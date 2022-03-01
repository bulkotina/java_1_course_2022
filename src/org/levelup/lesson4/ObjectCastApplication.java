package org.levelup.lesson4;

public class ObjectCastApplication {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        //r.square();

        Shape s = r; //приведение типа: привели объект r к типу s - неявное расширяющее преобразование
        //-s.square();-- нельзя вызвать

        Object o = r; //  неявное расширяющее преобразование
        //o.perimeter();

        Shape so = (Shape) o; // явное сужающее преобразование
        Rectangle rs = (Rectangle) so;  // явное сужающее преобразование

        Shape sh = new Shape(new int[0]);
        Rectangle rsh = (Rectangle) sh;

    }
}
