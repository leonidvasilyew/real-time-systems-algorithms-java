package ru.mirea.block1.pr2;

public class Pr2_7_BookShelf {
    private Pr2_7_Book[] a = new Pr2_7_Book[10];
    private int n = 0;

    public boolean add(String author, String name, int year, String type) {
        if (n == a.length) {
            return false;
        }
        a[n] = new Pr2_7_Book(author, name, year, type);
        n++;
        return true;
    }

    public Pr2_7_Book getOldest() {
        if (n == 0) {
            return null;
        }
        Pr2_7_Book b = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i].getYear() < b.getYear()) {
                b = a[i];
            }
        }
        return b;
    }

    public Pr2_7_Book getNewest() {
        if (n == 0) {
            return null;
        }
        Pr2_7_Book b = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i].getYear() > b.getYear()) {
                b = a[i];
            }
        }
        return b;
    }

    public void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j].getYear() > a[j + 1].getYear()) {
                    Pr2_7_Book b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }
    }

    public void show() {
        if (n == 0) {
            System.out.println("Полка пуста");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
