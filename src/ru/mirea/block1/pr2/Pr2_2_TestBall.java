package ru.mirea.block1.pr2;

public class Pr2_2_TestBall {
    public static void main(String[] args) {
        Pr2_2_Ball b1 = new Pr2_2_Ball();
        System.out.println("Без аргументов: " + b1);

        Pr2_2_Ball b2 = new Pr2_2_Ball(3.0, 4.0);
        System.out.println("С аргументами: " + b2);
        System.out.println("x = " + b2.getX() + ", y = " + b2.getY());

        b2.setX(5.0);
        b2.setY(6.0);
        System.out.println("После setX и setY: " + b2);

        b2.setXY(10.0, 20.0);
        System.out.println("После setXY: " + b2);

        b2.move(2.0, -3.0);
        System.out.println("После move(2, -3): " + b2);

        b2.move(0.0, 0.0);
        System.out.println("После move(0, 0): " + b2);
        System.out.println("Другой мяч не изменился: " + b1);
    }
}
