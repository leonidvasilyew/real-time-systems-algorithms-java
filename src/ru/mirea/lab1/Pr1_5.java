package ru.mirea.lab1;

public class Pr1_5 {
    public static void main(String[] args) {
        System.out.println("Количество: " + args.length);
        for (int i=0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}
