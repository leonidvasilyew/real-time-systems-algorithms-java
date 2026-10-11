package ru.mirea.block1.pr7;

public class Pr7_4_TestMath {
    public static void main(String[] args) {
        Pr7_4_MathFunc f = new Pr7_4_MathFunc();
        Pr7_4_MathCalculable m = f;
        System.out.printf("2^3 = %.2f%n", m.pow(2, 3));
        System.out.printf("2^-2 = %.2f%n", m.pow(2, -2));
        System.out.printf("Модуль 3 + 4i = %.2f%n", m.abs(3, 4));
        System.out.printf("Длина окружности радиуса 2: %.2f%n", f.length(2));
    }
}
