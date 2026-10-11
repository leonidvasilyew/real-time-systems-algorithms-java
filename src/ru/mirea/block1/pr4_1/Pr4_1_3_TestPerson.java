package ru.mirea.block1.pr4_1;

public class Pr4_1_3_TestPerson {
    public static void main(String[] args) {
        Pr4_1_3_Person a = new Pr4_1_3_Person();
        Pr4_1_3_Person b = new Pr4_1_3_Person("Иван Иванов", 20);
        System.out.println(a);
        a.move();
        a.talk();
        System.out.println(b);
        b.move();
        b.talk();
    }
}
