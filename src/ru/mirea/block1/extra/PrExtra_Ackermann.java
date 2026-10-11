package ru.mirea.block1.extra;

public class PrExtra_Ackermann {
    public static int ack(int m, int n) {
        if (m < 0 || m > 3 || n < 0 || n > 6) {
            throw new IllegalArgumentException("Для запуска: 0 <= m <= 3, 0 <= n <= 6");
        }
        return calc(m, n);
    }

    private static int calc(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return calc(m - 1, 1);
        }
        return calc(m - 1, calc(m, n - 1));
    }

    public static void main(String[] args) {
        for (int m = 0; m <= 3; m++) {
            for (int n = 0; n <= 3; n++) {
                System.out.printf("A(%d, %d) = %d%n", m, n, ack(m, n));
            }
        }
    }
}
