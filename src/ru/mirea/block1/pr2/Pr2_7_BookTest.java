package ru.mirea.block1.pr2;

public class Pr2_7_BookTest {
    public static void main(String[] args) {
        Pr2_7_Book b1 = new Pr2_7_Book("Иванов", "Java", 2005, "Учебник");
        Pr2_7_Book b2 = new Pr2_7_Book("Петров", "Алгоритмы", 1999, "Учебник");
        Pr2_7_Book b3 = new Pr2_7_Book("Сидоров", "Структуры данных", 2020, "Учебник");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.setAuthor("Сидоров");
        b1.setName("Основы Java");
        b1.setYear(2010);
        b1.setType("Учебник");
        System.out.println(b1.getAuthor());
        System.out.println(b1.getName());
        System.out.println(b1.getYear());
        System.out.println(b1.getType());

        Pr2_7_BookShelf s = new Pr2_7_BookShelf();
        s.add(b1.getAuthor(), b1.getName(), b1.getYear(), b1.getType());
        s.add(b2.getAuthor(), b2.getName(), b2.getYear(), b2.getType());
        s.add(b3.getAuthor(), b3.getName(), b3.getYear(), b3.getType());

        System.out.println("\nКниги на полке:");
        s.show();
        System.out.println("Самая ранняя: " + s.getOldest());
        System.out.println("Самая поздняя: " + s.getNewest());

        s.sort();
        System.out.println("\nПосле сортировки:");
        s.show();
    }
}
