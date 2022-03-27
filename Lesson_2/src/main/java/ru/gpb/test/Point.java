package ru.gpb.test;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public static Point tochkaPryamogoUgla(Point p1, Point p2) {
        Point pB = new Point(p2.x, p1.y);
        return pB;
    }

}
