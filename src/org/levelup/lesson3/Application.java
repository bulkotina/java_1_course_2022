package org.levelup.lesson3;

public class Application {
    public static void main(String[] args) {
  //     int x1 = 40;
  //     int y1 = 45;

  //     int x2 = 43;
  //     int y2 = 52;
        // p1,p2 - переменные ссылочного типа - объект
        //объект или экземпляр или ссылка или object или instance или reference
     Point p1 = new Point();
        System.out.println("p1 и p2 before settings value " + p1.x +  " " + p1.y);
        p1.x = 4;
        p1.y = 45;
        p1.name = "A";
        System.out.println("p1-" + p1.name +"(" + p1.x + "," + p1.y+")" );
    // Point p2; //null
        p1.changePoint(12,34);
        System.out.println("p1-" + p1.name +"(" + p1.x + "," + p1.y+")" );
        p1.changePoint(-45,32);
        System.out.println("p1-" + p1.name +"(" + p1.x + "," + p1.y+")" );

     int p1Quadrant = p1.quadrant();
        System.out.println(p1Quadrant);

        p1.printPoint();
        p1.changePoint("B", 56, 48);
        p1.printPoint();

        Point p2 = new Point("C" , 54, -12);
        Point p3 = new Point(-23, -34);
        p2.printPoint();
        p3.printPoint();

    }
}
