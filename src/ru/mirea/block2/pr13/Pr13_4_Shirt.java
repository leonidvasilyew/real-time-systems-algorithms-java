package ru.mirea.block2.pr13;

public class Pr13_4_Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Pr13_4_Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public static Pr13_4_Shirt parse(String s) {
        String[] p = s.split(",");
        return new Pr13_4_Shirt(p[0], p[1], p[2], p[3]);
    }

    @Override
    public String toString() {
        return "Код: " + id + "\nОписание: " + description + "\nЦвет: " + color + "\nРазмер: " + size + "\n";
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Pr13_4_Shirt[] a = new Pr13_4_Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            a[i] = parse(shirts[i]);
        }
        for (Pr13_4_Shirt s : a) {
            System.out.println(s);
        }
    }
}
