package ru.mirea.block1.pr2;

public class Pr2_4_Shop {
    private Pr2_4_Computer[] a = new Pr2_4_Computer[10];
    private int n = 0;

    public boolean add(Pr2_4_Computer c) {
        if (n == a.length) {
            return false;
        }
        a[n] = c;
        n++;
        return true;
    }

    public Pr2_4_Computer find(String s) {
        for (int i = 0; i < n; i++) {
            if (a[i].getModel().equals(s)) {
                return a[i];
            }
        }
        return null;
    }

    public boolean remove(String s) {
        for (int i = 0; i < n; i++) {
            if (a[i].getModel().equals(s)) {
                for (int j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                n--;
                a[n] = null;
                return true;
            }
        }
        return false;
    }

    public void show() {
        if (n == 0) {
            System.out.println("Магазин пуст");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
