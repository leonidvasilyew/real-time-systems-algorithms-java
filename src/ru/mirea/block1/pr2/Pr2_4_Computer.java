package ru.mirea.block1.pr2;

public class Pr2_4_Computer {
    private String model;
    private double price;

    public Pr2_4_Computer(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void setModel(String model) {this.model = model;}
    public void setPrice(double price) {this.price = price;}

    public String getModel() {return model;}
    public double getPrice() {return price;}

    @Override
    public String toString() {
        return "Computer{" + "model='" + model + '\'' + ", price=" + price + '}';
    }
}
