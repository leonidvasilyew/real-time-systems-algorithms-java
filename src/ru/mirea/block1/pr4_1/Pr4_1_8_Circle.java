package ru.mirea.block1.pr4_1;

public class Pr4_1_8_Circle extends Pr4_1_8_Shape {
    protected double radius;

    public Pr4_1_8_Circle() {
        this(1);
    }

    public Pr4_1_8_Circle(double radius) {
        this(radius, "red", true);
    }

    public Pr4_1_8_Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius < 0 || !Double.isFinite(radius)) {
            throw new IllegalArgumentException("Неверный радиус");
        }
        this.radius = radius;
    }

    public double getRadius() {return radius;}

    @Override
    public double getArea() {return Math.PI * radius * radius;}

    @Override
    public double getPerimeter() {return 2 * Math.PI * radius;}

    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", " + super.toString() + "}";
    }
}
