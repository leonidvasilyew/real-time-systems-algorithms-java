package ru.mirea.block1.pr3;

public class Pr3_1_Converter {
    private static final double USD = 90;
    private static final double EUR = 100;

    private double rate(String s) {
        switch (s.toUpperCase()) {
            case "RUB": return 1;
            case "USD": return USD;
            case "EUR": return EUR;
            default: throw new IllegalArgumentException("Неизвестная валюта");
        }
    }

    public double convert(double x, String a, String b) {
        if (x < 0 || !Double.isFinite(x)) {
            throw new IllegalArgumentException("Сумма должна быть конечной и неотрицательной");
        }
        double y = x * (rate(a) / rate(b));
        if (!Double.isFinite(y)) {
            throw new IllegalArgumentException("Сумма слишком велика");
        }
        return y;
    }
}
