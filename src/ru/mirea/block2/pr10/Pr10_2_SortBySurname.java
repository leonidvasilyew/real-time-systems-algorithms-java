package ru.mirea.block2.pr10;

import ru.mirea.block2.pr9.Pr9_1_Student;

import java.util.Comparator;

public class Pr10_2_SortBySurname implements Comparator<Pr9_1_Student> {
    @Override
    public int compare(Pr9_1_Student a, Pr9_1_Student b) {
        return a.getSurname().compareTo(b.getSurname());
    }
}
