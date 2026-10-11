package ru.mirea.block1.extra;

public class PrExtra_Singleton {
    private static final PrExtra_Singleton instance = new PrExtra_Singleton();
    private int value;

    private PrExtra_Singleton() {
    }

    public void setValue(int value) {this.value = value;}
    public int getValue() {return value;}

    public static PrExtra_Singleton getInstance() {return instance;}

    public static void main(String[] args) {
        PrExtra_Singleton a = PrExtra_Singleton.getInstance();
        PrExtra_Singleton b = PrExtra_Singleton.getInstance();
        System.out.println("Один объект: " + (a == b));
        a.setValue(10);
        System.out.println("Значение через вторую ссылку: " + b.getValue());
    }
}
