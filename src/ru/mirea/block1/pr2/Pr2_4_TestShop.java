package ru.mirea.block1.pr2;

import java.util.Scanner;

public class Pr2_4_TestShop {
    public static void main(String[] args) {
        Pr2_4_Shop s = new Pr2_4_Shop();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Показать все компьютеры");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            if (!sc.hasNextInt()) {
                if (!sc.hasNextLine()) {
                    break;
                }
                sc.nextLine();
                System.out.println("Введите номер действия");
                continue;
            }

            int k = sc.nextInt();
            sc.nextLine();
            if (k == 0) {
                break;
            }

            switch (k) {
                case 1: {
                    System.out.print("Модель: ");
                    String m = sc.nextLine();
                    System.out.print("Цена: ");
                    if (!sc.hasNextDouble()) {
                        if (sc.hasNextLine()) {
                            sc.nextLine();
                        }
                        System.out.println("Введите число для цены");
                        break;
                    }
                    double p = sc.nextDouble();
                    sc.nextLine();
                    Pr2_4_Computer c = new Pr2_4_Computer(m, p);
                    if (s.add(c)) {
                        System.out.println("Компьютер добавлен");
                    } else {
                        System.out.println("Магазин заполнен");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Модель: ");
                    String m = sc.nextLine();
                    if (s.remove(m)) {
                        System.out.println("Компьютер удалён");
                    } else {
                        System.out.println("Компьютер не найден");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Модель: ");
                    String m = sc.nextLine();
                    Pr2_4_Computer c = s.find(m);
                    if (c == null) {
                        System.out.println("Компьютер не найден");
                    } else {
                        System.out.println(c);
                    }
                    break;
                }
                case 4:
                    s.show();
                    break;
                default:
                    System.out.println("Такого действия нет");
            }
        }
        sc.close();
    }
}
