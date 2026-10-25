package ru.mirea.block2.pr10;

import ru.mirea.block2.pr9.Pr9_1_Student;
import ru.mirea.block2.pr9.Pr9_2_SortingStudentsByGPA;

public class Pr10_3_MergeLists {
    public static void main(String[] args) {
        Pr9_1_Student[] a = {
                new Pr9_1_Student(105, "Иван", "Петров", "ИВТ", 2, "КВБО-11-25", 4.25),
                new Pr9_1_Student(101, "Анна", "Смирнова", "ИВТ", 2, "КВБО-11-25", 4.80),
                new Pr9_1_Student(107, "Денис", "Волков", "ИВТ", 2, "КВБО-11-25", 3.75)
        };
        Pr9_1_Student[] b = {
                new Pr9_1_Student(110, "Олег", "Кузнецов", "ПИ", 1, "КВБО-02-26", 3.90),
                new Pr9_1_Student(103, "Мария", "Орлова", "ПИ", 1, "КВБО-02-26", 4.55),
                new Pr9_1_Student(112, "Елена", "Белова", "ПИ", 1, "КВБО-02-26", 4.10)
        };
        Pr9_2_SortingStudentsByGPA c = new Pr9_2_SortingStudentsByGPA();
        a = Pr10_2_Tester.mergeSort(a, c);
        b = Pr10_2_Tester.mergeSort(b, c);

        System.out.println("Первый список:");
        for (Pr9_1_Student s : a) {
            System.out.println(s);
        }
        System.out.println("Второй список:");
        for (Pr9_1_Student s : b) {
            System.out.println(s);
        }
        System.out.println("Общий список по баллу:");
        for (Pr9_1_Student s : Pr10_2_Tester.merge(a, b, c)) {
            System.out.println(s);
        }
    }
}
