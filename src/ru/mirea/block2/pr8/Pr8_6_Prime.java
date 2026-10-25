package ru.mirea.block2.pr8;

import java.util.Scanner;

public class Pr8_6_Prime {
    public static boolean isPrime(int n, int d) {
        if (d * d > n) {
            return true;
        }
        if (n % d == 0) {
            return false;
        }
        return isPrime(n, d + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
