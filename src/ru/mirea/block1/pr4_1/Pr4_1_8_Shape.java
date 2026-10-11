package ru.mirea.block1.pr4_1;

public abstract class Pr4_1_8_Shape {
    protected String color;
    protected boolean filled;

    public Pr4_1_8_Shape() {
        this("red", true);
    }

    public Pr4_1_8_Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {this.color = color;}
    public void setFilled(boolean filled) {this.filled = filled;}

    public String getColor() {return color;}
    public boolean isFilled() {return filled;}

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{color='" + color + "', filled=" + filled + "}";
    }
}
