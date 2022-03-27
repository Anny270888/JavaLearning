package ru.gpb.test;

public class HomeWork2 {
    public static void main(String[] args) {
        Point pA = new Point((int) (Math.random() * 10), (int) (Math.random() * 10));
        Point pB = new Point((int) (Math.random() * 10), (int) (Math.random() * 10));
        Point pC;
        pC = Point.tochkaPryamogoUgla(pA, pB);
        System.out.println("Расстояние между точками (" + pA.x + ", " + pA.y + ")" + " и (" + pB.x + ", " + pB.y + ") = " + PodshetPoTochkam.distance(pA, pC));
        System.out.println("А площадь равнобедренного треугольника с этими точками на непрямом углу, будет = " + PodshetPoTochkam.areaRightTriangle(pA, pB, pC));
    }


}
