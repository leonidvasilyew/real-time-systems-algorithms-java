package ru.mirea.block2.pr11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pr11_1_Developer {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Scanner sc = new Scanner(System.in);
        System.out.print("Дата и время получения задания (дд.мм.гггг чч:мм): ");
        Date got = f.parse(sc.nextLine());
        Date done = new Date();
        System.out.println("Разработчик: Васильев");
        System.out.println("Задание получено: " + f.format(got));
        System.out.println("Задание сдано: " + f.format(done));
    }
}
