package ru.gpb.test;

public class HomeWork2 {
    public static void main(String[] args){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,3);
        Point p3 = new Point(50,0);
        Point p4 = new Point(50,50);
        System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y + ")" + " и ("  + p2.x + ", " + p2.y + ") = " + Point.distance(p1, p2));
        System.out.println("А между точками (" + p3.x + ", " + p3.y + ")" + " и ("  + p4.x + ", " + p4.y + ") = " + Point.distance(p3, p4));
    }


}
