package ru.mirea.block1.pr4_1;

public class Pr4_1_8_Square extends Pr4_1_8_Rectangle {
    public Pr4_1_8_Square() {
        this(1);
    }

    public Pr4_1_8_Square(double side) {
        this(side, "red", true);
    }

    public Pr4_1_8_Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side) {setSide(side);}
    @Override
    public void setLength(double side) {setSide(side);}

    public double getSide() {return width;}

    @Override
    public String toString() {
        return "Square{side=" + getSide() + ", color='" + color + "', filled=" + filled + "}";
    }
}
