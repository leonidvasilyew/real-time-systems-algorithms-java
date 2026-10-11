package ru.mirea.block1.pr6;

import java.util.Scanner;

public class Pr6_11_TestTemperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Температура в C: ");
        if (!s.hasNextDouble()) {
            System.out.println("Нужно ввести число");
            return;
        }
        double x = s.nextDouble();
        if (!Double.isFinite(x) || x < -273.15) {
            System.out.println("Температура должна быть конечной и не ниже -273.15 C");
            return;
        }
        Pr6_11_Convertable k = new Pr6_11_Kelvin();
        Pr6_11_Convertable f = new Pr6_11_Fahrenheit();
        System.out.printf("%.2f C = %.2f K = %.2f F%n", x, k.convert(x), f.convert(x));
    }
}
