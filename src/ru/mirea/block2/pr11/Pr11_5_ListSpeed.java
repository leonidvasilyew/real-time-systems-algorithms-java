package ru.mirea.block2.pr11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pr11_5_ListSpeed {
    static final int N = 100000;
    static final int K = 10000;

    public static void test(String name, List<Integer> a) {
        long t = System.nanoTime();
        for (int i = 0; i < N; i++) {
            a.add(i);
        }
        long add = System.nanoTime() - t;

        t = System.nanoTime();
        for (int i = 0; i < K; i++) {
            a.add(0, i);
        }
        long insert = System.nanoTime() - t;

        t = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            a.get(a.size() / 2);
        }
        long get = System.nanoTime() - t;

        t = System.nanoTime();
        for (int i = 0; i < K; i++) {
            a.remove(0);
        }
        long remove = System.nanoTime() - t;

        t = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            a.indexOf(N - 1 - i);
        }
        long find = System.nanoTime() - t;

        System.out.printf("%-10s %10.2f %10.2f %10.2f %10.2f %10.2f%n", name,
                add / 1000000.0, insert / 1000000.0, get / 1000000.0, remove / 1000000.0, find / 1000000.0);
    }

    public static void main(String[] args) {
        System.out.println("Время в мс");
        System.out.printf("%-10s %10s %10s %10s %10s %10s%n", "", "в конец", "в начало", "get сер.", "удал.нач", "поиск");
        test("ArrayList", new ArrayList<>());
        test("LinkedList", new LinkedList<>());
    }
}
