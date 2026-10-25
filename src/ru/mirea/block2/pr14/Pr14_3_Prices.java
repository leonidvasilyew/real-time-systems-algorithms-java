package ru.mirea.block2.pr14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr14_3_Prices {
    public static void main(String[] args) {
        String text = "Ноутбук 999.99 USD, мышь 1500 RUB, сумка 25.98 USD, наушники 79.50 EU, " +
                "ошибка 44 ERR, мелочь 0.004 EU, кабель 350.00 RUB";
        Pattern p = Pattern.compile(" \\d+(\\.\\d{1,2})? (USD|RUB|EU)");
        Matcher m = p.matcher(text);
        System.out.println("Текст: " + text);
        System.out.println("Найденные цены:");
        while (m.find()) {
            System.out.println(m.group().trim());
        }
    }
}
