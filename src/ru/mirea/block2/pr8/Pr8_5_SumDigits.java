package ru.mirea.block2.pr8;

import java.util.Scanner;

public class Pr8_5_SumDigits {
    public static int sum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.println("Сумма цифр: " + sum(n));
    }
}
