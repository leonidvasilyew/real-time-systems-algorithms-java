package ru.mirea.block1.pr4_1;

public class Pr4_1_8_Rectangle extends Pr4_1_8_Shape {
    protected double width;
    protected double length;

    public Pr4_1_8_Rectangle() {
        this(1, 1);
    }

    public Pr4_1_8_Rectangle(double width, double length) {
        this(width, length, "red", true);
    }

    public Pr4_1_8_Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public void setWidth(double width) {
        if (width < 0 || !Double.isFinite(width)) {
            throw new IllegalArgumentException("Неверная ширина");
        }
        this.width = width;
    }
    public void setLength(double length) {
        if (length < 0 || !Double.isFinite(length)) {
            throw new IllegalArgumentException("Неверная длина");
        }
        this.length = length;
    }

    public double getWidth() {return width;}
    public double getLength() {return length;}

    @Override
    public double getArea() {return width * length;}

    @Override
    public double getPerimeter() {return 2 * (width + length);}

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", length=" + length + ", " + super.toString() + "}";
    }
}
