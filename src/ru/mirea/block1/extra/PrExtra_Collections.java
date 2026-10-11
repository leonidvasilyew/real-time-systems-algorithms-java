package ru.mirea.block1.extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class PrExtra_Collections {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Москва");
        a.add("Тула");
        a.add("Москва");
        a.add("Калуга");
        System.out.println("Список с повторами: " + a);
        LinkedHashSet<String> b = new LinkedHashSet<>(a);
        System.out.println("Уникальные города: " + b);
        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            String s = i.next();
            if (s.equals("Москва")) {
                i.remove();
            }
        }
        System.out.println("После удаления через итератор: " + a);
        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
        m.put("Москва", 0);
        m.put("Тула", 180);
        m.put("Калуга", 160);
        System.out.println("Расстояние до Тулы: " + m.get("Тула"));
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.printf("%s: %d км%n", e.getKey(), e.getValue());
        }
    }
}
