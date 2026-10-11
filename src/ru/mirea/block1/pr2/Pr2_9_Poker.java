package ru.mirea.block1.pr2;

import java.util.Random;
import java.util.Scanner;

public class Pr2_9_Poker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Число игроков (1–10): ");
        if (!sc.hasNextInt()) {
            System.out.println("Введите целое число от 1 до 10");
            sc.close();
            return;
        }
        int n = sc.nextInt();
        sc.close();
        if (n < 1 || n > 10) {
            System.out.println("Число игроков должно быть от 1 до 10");
            return;
        }

        String[] m = {"пики", "черви", "буби", "крести"};
        String[] v = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"};
        String[] a = new String[52];
        int k = 0;
        for (String s : m) {
            for (String t : v) {
                a[k] = t + " " + s;
                k++;
            }
        }

        Random r = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            String s = a[i];
            a[i] = a[j];
            a[j] = s;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Игрок %d:%n", i + 1);
            for (int j = 0; j < 5; j++) {
                System.out.println(a[i * 5 + j]);
            }
            System.out.println();
        }
    }
}
