package ru.mirea.lab1;

public class Pr1_3 {
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float s = 0;

        for(int i=0; i<b.length; i++) {
            s += b[i];
        }

        System.out.println(s);
        System.out.println(s/b.length);
    }
}
