package ru.mirea.block2.pr10;

import ru.mirea.block2.pr9.Pr9_1_Student;
import ru.mirea.block2.pr9.Pr9_2_SortingStudentsByGPA;

import java.util.Comparator;

public class Pr10_2_Tester {
    private Pr9_1_Student[] iDNumber;

    public void setArray() {
        iDNumber = new Pr9_1_Student[] {
                new Pr9_1_Student(105, "Иван", "Петров", "ИВТ", 2, "КВБО-11-25", 4.25),
                new Pr9_1_Student(101, "Анна", "Смирнова", "ИВТ", 2, "КВБО-11-25", 4.80),
                new Pr9_1_Student(110, "Олег", "Кузнецов", "ПИ", 1, "КВБО-02-26", 3.90),
                new Pr9_1_Student(103, "Мария", "Орлова", "ПИ", 1, "КВБО-02-26", 4.55),
                new Pr9_1_Student(107, "Денис", "Волков", "ИВТ", 2, "КВБО-11-25", 3.75),
                new Pr9_1_Student(112, "Елена", "Белова", "ПИ", 1, "КВБО-02-26", 4.10)
        };
    }

    public void quickSort(Comparator<Pr9_1_Student> c) {
        Pr9_2_SortingStudentsByGPA.quickSort(iDNumber, 0, iDNumber.length - 1, c);
    }

    public void mergeSort(Comparator<Pr9_1_Student> c) {
        iDNumber = mergeSort(iDNumber, c);
    }

    public static Pr9_1_Student[] mergeSort(Pr9_1_Student[] a, Comparator<Pr9_1_Student> c) {
        if (a.length < 2) {
            return a;
        }
        int m = a.length / 2;
        Pr9_1_Student[] l = new Pr9_1_Student[m];
        Pr9_1_Student[] r = new Pr9_1_Student[a.length - m];
        System.arraycopy(a, 0, l, 0, m);
        System.arraycopy(a, m, r, 0, a.length - m);
        return merge(mergeSort(l, c), mergeSort(r, c), c);
    }

    public static Pr9_1_Student[] merge(Pr9_1_Student[] a, Pr9_1_Student[] b, Comparator<Pr9_1_Student> c) {
        Pr9_1_Student[] res = new Pr9_1_Student[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (c.compare(a[i], b[j]) <= 0) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }
        while (i < a.length) {
            res[k++] = a[i++];
        }
        while (j < b.length) {
            res[k++] = b[j++];
        }
        return res;
    }

    public void outArray() {
        for (Pr9_1_Student s : iDNumber) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pr10_2_Tester t = new Pr10_2_Tester();
        t.setArray();
        System.out.println("Исходный массив:");
        t.outArray();

        t.quickSort(new Pr9_2_SortingStudentsByGPA());
        System.out.println("Быстрая сортировка по баллу (по убыванию):");
        t.outArray();

        t.setArray();
        t.mergeSort(new Pr9_2_SortingStudentsByGPA());
        System.out.println("Сортировка слиянием по баллу (по убыванию):");
        t.outArray();

        t.mergeSort(new Pr10_2_SortBySurname());
        System.out.println("Сортировка слиянием по фамилии:");
        t.outArray();
    }
}
