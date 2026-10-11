package ru.mirea.block1.pr7;

public class Pr7_4_MathFunc implements Pr7_4_MathCalculable {
    @Override
    public double pow(double x, int n) {
        return Math.pow(x, n);
    }

    @Override
    public double abs(double x, double y) {
        return Math.hypot(x, y);
    }

    public double length(double r) {
        return 2 * PI * r;
    }
}
