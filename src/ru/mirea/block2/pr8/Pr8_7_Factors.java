package ru.mirea.block2.pr8;

import java.util.Scanner;

public class Pr8_7_Factors {
    public static void factors(int n, int d) {
        if (n == 1) {
            return;
        }
        if (d * d > n) {
            System.out.print(n + " ");
            return;
        }
        if (n % d == 0) {
            System.out.print(d + " ");
            factors(n / d, d);
        } else {
            factors(n, d + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        factors(n, 2);
        System.out.println();
    }
}
