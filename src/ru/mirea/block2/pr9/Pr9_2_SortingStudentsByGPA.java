package ru.mirea.block2.pr9;

import java.util.Comparator;

public class Pr9_2_SortingStudentsByGPA implements Comparator<Pr9_1_Student> {
    @Override
    public int compare(Pr9_1_Student a, Pr9_1_Student b) {
        if (a.getGpa() < b.getGpa()) {
            return 1;
        } else if (a.getGpa() > b.getGpa()) {
            return -1;
        }
        return 0;
    }

    public static void quickSort(Pr9_1_Student[] a, int l, int r, Comparator<Pr9_1_Student> c) {
        if (l >= r) {
            return;
        }
        Pr9_1_Student p = a[(l + r) / 2];
        int i = l;
        int j = r;
        while (i <= j) {
            while (c.compare(a[i], p) < 0) {
                i++;
            }
            while (c.compare(a[j], p) > 0) {
                j--;
            }
            if (i <= j) {
                Pr9_1_Student t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            }
        }
        quickSort(a, l, j, c);
        quickSort(a, i, r, c);
    }

    public static void main(String[] args) {
        Pr9_1_Student[] a = {
                new Pr9_1_Student(105, "Иван", "Петров", "ИВТ", 2, "КВБО-11-25", 4.25),
                new Pr9_1_Student(101, "Анна", "Смирнова", "ИВТ", 2, "КВБО-11-25", 4.80),
                new Pr9_1_Student(110, "Олег", "Кузнецов", "ПИ", 1, "КВБО-02-26", 3.90),
                new Pr9_1_Student(103, "Мария", "Орлова", "ПИ", 1, "КВБО-02-26", 4.55),
                new Pr9_1_Student(107, "Денис", "Волков", "ИВТ", 2, "КВБО-11-25", 3.75)
        };
        quickSort(a, 0, a.length - 1, new Pr9_2_SortingStudentsByGPA());
        System.out.println("По среднему баллу (по убыванию), быстрая сортировка:");
        for (Pr9_1_Student s : a) {
            System.out.println(s);
        }
    }
}
