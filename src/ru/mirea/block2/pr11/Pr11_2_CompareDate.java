package ru.mirea.block2.pr11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pr11_2_CompareDate {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        System.out.println("Сейчас: " + f.format(now));
        System.out.print("Введите дату (дд.мм.гггг чч:мм): ");
        Date d;
        try {
            d = f.parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
            return;
        }
        if (d.before(now)) {
            System.out.println("Введённая дата раньше текущей");
        } else if (d.after(now)) {
            System.out.println("Введённая дата позже текущей");
        } else {
            System.out.println("Даты совпадают");
        }
        long h = Math.abs(now.getTime() - d.getTime()) / (1000 * 60 * 60);
        System.out.println("Разница: " + h / 24 + " дн. " + h % 24 + " ч.");
    }
}
