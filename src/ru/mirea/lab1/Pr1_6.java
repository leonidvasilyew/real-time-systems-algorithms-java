package ru.mirea.lab1;

public class Pr1_6 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.printf("%2d-е число = 1/%-2d = %.4f%n", i, i, 1.0 / i);
        }
    }
}
