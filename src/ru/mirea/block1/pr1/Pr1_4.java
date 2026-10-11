package ru.mirea.block1.pr1;
import java.util.Scanner;

public class Pr1_4 {
    public static void main(String[] args) {
        float s = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        System.out.print("Количество чисел: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Количество чисел должно быть больше нуля");
            return;
        }
        int[] b = new int[n];

        int i = 0;
        while (i<n) {
            System.out.print("Введите целое число: ");
            if (sc.hasNextInt()) {
                b[i] = sc.nextInt();
                s += b[i];
                if (b[i] < min) {
                    min = b[i];
                }
                if (b[i] > max) {
                    max = b[i];
                }
                i += 1;
            } else {
                sc.next();
                System.out.println("Вы ввели не целое число");
            }
        }

        System.out.println("Сумма чисел массива: " + s);
        System.out.println("Среднее " + s/n);
        System.out.println("Минимальное: " + min + " Максимальное: " + max);

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        s = 0;
        i = 0;
        do {
            s += b[i];
            if (b[i] < min) {
                min = b[i];
            }
            if (b[i] > max) {
                max = b[i];
            }
            i += 1;
        } while (i<n);

        System.out.println("Сумма чисел массива: " + s);
        System.out.println("Среднее: " + s/n);
        System.out.println("Минимальное: " + min + " Максимальное: " + max);
    }
}
