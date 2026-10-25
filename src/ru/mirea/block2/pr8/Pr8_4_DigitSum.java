package ru.mirea.block2.pr8;

import java.util.Scanner;

public class Pr8_4_DigitSum {
    public static long count(int k, int s, int start) {
        if (k == 0) {
            if (s == 0) {
                return 1;
            }
            return 0;
        }
        long c = 0;
        for (int d = start; d <= 9 && d <= s; d++) {
            c += count(k - 1, s - d, 0);
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("k = ");
        int k = sc.nextInt();
        System.out.print("s = ");
        int s = sc.nextInt();
        System.out.println("Количество: " + count(k, s, 1));
    }
}
