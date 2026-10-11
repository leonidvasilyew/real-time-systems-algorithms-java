package ru.mirea.block1.pr3;

import java.util.Scanner;

public class Pr3_1_TestConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pr3_1_Converter c = new Pr3_1_Converter();
        System.out.println("Учебные курсы: 1 USD = 90 RUB, 1 EUR = 100 RUB");
        System.out.print("Сумма: ");
        if (!s.hasNextDouble()) {
            System.out.println("Нужно ввести число");
            return;
        }
        double x = s.nextDouble();
        System.out.print("Исходная валюта (RUB, USD, EUR): ");
        String a = s.next();
        System.out.print("Новая валюта (RUB, USD, EUR): ");
        String b = s.next();
        try {
            double y = c.convert(x, a, b);
            System.out.printf("%.2f %s = %.2f %s%n", x, a.toUpperCase(), y, b.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
