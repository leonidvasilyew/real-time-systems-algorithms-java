package ru.mirea.block1.pr2;

public class Pr2_1_TestAuthor {
    public static void main(String[] args) {
        Pr2_1_Author a = new Pr2_1_Author("Иван Петров", "ivan@example.com", 'm');

        System.out.println(a);
        System.out.println("Имя: " + a.getName());
        System.out.println("Email: " + a.getEmail());
        System.out.println("Пол: " + a.getGender());

        a.setEmail("petrov@example.com");
        System.out.println("Новый email: " + a.getEmail());
        System.out.println(a);
    }
}
