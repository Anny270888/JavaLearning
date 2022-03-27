package ru.gpb.test;

public class HomeWork2 {
    public static void main(String[] args) {
        Point pA = new Point((int) ( Math.random() * 10 ), (int) ( Math.random() * 10 ));
        Point pC = new Point((int) ( Math.random() * 10 ), (int) ( Math.random() * 10 ));
        Point pB;
        pB = Point.tochkaPryamogoUgla(pA, pC);
        System.out.println("Расстояние между точками (" + pA.x + ", " + pA.y + ")" + " и (" + pC.x + ", " + pC.y + ") = " + PodschetPoTochkam.distance(pA, pC));
        System.out.println("А площадь равнобедренного треугольника с этими точками на непрямом углу, будет = "+ PodschetPoTochkam.areaRightTriangle(pA, pC, pB));
    }


}
