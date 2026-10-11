package ru.mirea.block1.pr3;

import java.util.Arrays;
import java.util.Random;

public class Pr3_1_Random {
    public static void main(String[] args) {
        double[] a = new double[5];
        double[] b = new double[5];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
            b[i] = r.nextDouble();
        }
        System.out.println("Math.random: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("После сортировки: " + Arrays.toString(a));
        System.out.println("Random: " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("После сортировки: " + Arrays.toString(b));
    }
}
