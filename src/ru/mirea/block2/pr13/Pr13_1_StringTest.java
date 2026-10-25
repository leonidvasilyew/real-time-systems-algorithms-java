package ru.mirea.block2.pr13;

public class Pr13_1_StringTest {
    public static void test(String s) {
        System.out.println("Строка: " + s);
        System.out.println("Последний символ: " + s.charAt(s.length() - 1));
        System.out.println("Заканчивается на \"!!!\": " + s.endsWith("!!!"));
        System.out.println("Начинается с \"I like\": " + s.startsWith("I like"));
        System.out.println("Содержит \"Java\": " + s.contains("Java"));
        int i = s.indexOf("Java");
        System.out.println("Позиция \"Java\": " + i);
        System.out.println("Замена a на o: " + s.replace('a', 'o'));
        System.out.println("Верхний регистр: " + s.toUpperCase());
        System.out.println("Нижний регистр: " + s.toLowerCase());
        if (i >= 0) {
            System.out.println("Вырезано: " + s.substring(i, i + 4));
        }
    }

    public static void main(String[] args) {
        test("I like Java!!!");
    }
}
