package ru.mirea.block2.pr9;

public class Pr9_1_TestStudent {
    public static void insertionSort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            Comparable x = a[i];
            int j = i - 1;
            while (j >= 0 && a[j].compareTo(x) > 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
        }
    }

    public static void main(String[] args) {
        Pr9_1_Student[] iDNumber = {
                new Pr9_1_Student(105, "Иван", "Петров", "ИВТ", 2, "КВБО-11-25", 4.25),
                new Pr9_1_Student(101, "Анна", "Смирнова", "ИВТ", 2, "КВБО-11-25", 4.80),
                new Pr9_1_Student(110, "Олег", "Кузнецов", "ПИ", 1, "КВБО-02-26", 3.90),
                new Pr9_1_Student(103, "Мария", "Орлова", "ПИ", 1, "КВБО-02-26", 4.55),
                new Pr9_1_Student(107, "Денис", "Волков", "ИВТ", 2, "КВБО-11-25", 3.75)
        };
        System.out.println("До сортировки:");
        for (Pr9_1_Student s : iDNumber) {
            System.out.println(s);
        }
        insertionSort(iDNumber);
        System.out.println("После сортировки вставками по id:");
        for (Pr9_1_Student s : iDNumber) {
            System.out.println(s);
        }
    }
}
