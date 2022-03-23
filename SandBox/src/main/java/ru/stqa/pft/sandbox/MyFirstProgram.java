package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("Timur");
        hello("Denis");

        Square s = new Square(9);
        Rectangle p = new Rectangle(5, 4);
        System.out.println("Площадь квадрата со стороной " + s.len + " = " + s.area());
        System.out.println("Площадь прямоугольника со сторонами " + p.a + " и " + p.b + " = " + p.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}