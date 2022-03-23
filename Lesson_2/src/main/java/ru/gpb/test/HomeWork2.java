package ru.gpb.test;

public class HomeWork2 {
    public static void main(String[] args){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,5);
        System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y + ")" + " и ("  + p2.x + ", " + p2.y + ") = " + Point.distance(p1, p2));
    }


}
