package ru.mirea.block1.pr4_1;

public class Pr4_1_3_Person {
    private String fullName;
    private int age;

    public Pr4_1_3_Person() {
        this("Неизвестный", 0);
    }

    public Pr4_1_3_Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " идет");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    @Override
    public String toString() {
        return "Person{fullName='" + fullName + "', age=" + age + "}";
    }
}
