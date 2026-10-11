package ru.mirea.block1.pr4_1;

public class Pr4_1_8_TestShape {
    public static void main(String[] args) {
        Pr4_1_8_Shape[] a = {
                new Pr4_1_8_Circle(2, "blue", false),
                new Pr4_1_8_Rectangle(3, 4, "green", true),
                new Pr4_1_8_Square(5, "yellow", true)
        };
        for (Pr4_1_8_Shape s : a) {
            System.out.println(s);
            System.out.printf("Площадь: %.2f, периметр: %.2f%n", s.getArea(), s.getPerimeter());
        }
        Pr4_1_8_Square q = new Pr4_1_8_Square(2);
        q.setWidth(6);
        System.out.println("После setWidth(6): " + q);
        q.setLength(3);
        System.out.println("После setLength(3): " + q);
    }
}
