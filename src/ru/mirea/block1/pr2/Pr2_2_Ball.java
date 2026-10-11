package ru.mirea.block1.pr2;

public class Pr2_2_Ball {
    private double x;
    private double y;

    public Pr2_2_Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Pr2_2_Ball() {
        this(0.0, 0.0);
    }

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void setXY(double x, double y) {this.x = x; this.y = y;}

    public double getX() {return x;}
    public double getY() {return y;}

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{" + "x=" + x + ", y=" + y + '}';
    }
}
