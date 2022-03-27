package ru.gpb.test;

public class PodshetPoTochkam {

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
    }

    public static double areaRightTriangle(Point p1, Point p2, Point p3) {
        return distance(p1, p3) * distance(p2, p3) / 2;
    }
}
