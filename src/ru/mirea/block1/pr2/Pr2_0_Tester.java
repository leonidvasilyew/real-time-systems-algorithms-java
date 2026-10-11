package ru.mirea.block1.pr2;

import java.lang.*;
import java.util.Scanner;

public class Pr2_0_Tester {
    public static void main(String[] args) {
        Pr2_0_Circle circle = new Pr2_0_Circle(3.1, 4.1, 5.1, "red");

        // println использует toString() для вывода объекта.
        System.out.println(circle);
        System.out.println("Длина окружности = " + circle.getLength() + " см");

        Scanner source = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double r = source.nextDouble();

        // Переносим введённое значение из локальной переменной в поле объекта.
        circle.setR(r);

        System.out.println(circle);
        System.out.println("Длина окружности = " + circle.getLength() + " см");
        source.close();
    }
}
