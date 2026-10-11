package ru.mirea.block1.pr6;

public class Pr6_11_Fahrenheit implements Pr6_11_Convertable {
    @Override
    public double convert(double x) {
        return x * 9 / 5 + 32;
    }
}
