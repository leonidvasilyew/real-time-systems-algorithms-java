package ru.mirea.block1.pr1;

public class Pr1_7 {
    public static long fact(int n) {
        if (n<0) {return -1;}
        long a = 1;
        for (int i=n; i > 1; i--) {
            a *= i;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
