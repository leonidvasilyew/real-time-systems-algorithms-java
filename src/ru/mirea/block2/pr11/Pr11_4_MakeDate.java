package ru.mirea.block2.pr11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Pr11_4_MakeDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Год месяц число: ");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.print("Часы минуты: ");
        int h = sc.nextInt();
        int min = sc.nextInt();

        Calendar c = new GregorianCalendar(y, m - 1, d, h, min);
        Date date = c.getTime();

        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy HH:mm, EEEE");
        System.out.println("Date: " + f.format(date));
        System.out.printf("Calendar: год %d, месяц %d, число %d, %02d:%02d, день года %d%n",
                c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.DAY_OF_YEAR));
    }
}
