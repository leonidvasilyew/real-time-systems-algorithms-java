package ru.mirea.block1.pr3;

public class Pr3_1_Double {
    public static void main(String[] args) {
        Double a = Double.valueOf(65.75);
        Double b = Double.valueOf("12.5");
        double x = Double.parseDouble("3.14");
        System.out.println("Double: " + a + ", " + b);
        System.out.println("Из строки в double: " + x);
        System.out.println("byte: " + a.byteValue());
        System.out.println("short: " + a.shortValue());
        System.out.println("int: " + a.intValue());
        System.out.println("long: " + a.longValue());
        System.out.println("float: " + a.floatValue());
        System.out.println("double: " + a.doubleValue());
        System.out.println("char: " + (char) a.intValue());
        String d = Double.toString(3.14);
        System.out.println("Строка: " + d);
    }
}
