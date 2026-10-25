package ru.mirea.block2.pr13;

public class Pr13_5_Phone {
    public static String format(String s) {
        String code;
        String num;
        if (s.startsWith("+")) {
            code = s.substring(1, s.length() - 10);
            num = s.substring(s.length() - 10);
        } else if (s.startsWith("8") && s.length() == 11) {
            code = "7";
            num = s.substring(1);
        } else {
            return "Неверный формат: " + s;
        }
        return "+" + code + num.substring(0, 3) + "-" + num.substring(3, 6) + "-" + num.substring(6);
    }

    public static void main(String[] args) {
        String[] a = {"+79175655655", "+104289652211", "89175655655"};
        for (String s : a) {
            System.out.println(s + " -> " + format(s));
        }
    }
}
