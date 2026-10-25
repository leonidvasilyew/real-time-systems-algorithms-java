package ru.mirea.block2.pr13;

public class Pr13_2_Person {
    private String surname;
    private String name;
    private String patronymic;

    public Pr13_2_Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getShortName() {
        StringBuilder sb = new StringBuilder(surname);
        if (name != null && !name.isEmpty()) {
            sb.append(' ').append(name.charAt(0)).append('.');
            if (patronymic != null && !patronymic.isEmpty()) {
                sb.append(patronymic.charAt(0)).append('.');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Pr13_2_Person[] a = {
                new Pr13_2_Person("Иванов", "Сергей", "Петрович"),
                new Pr13_2_Person("Петров", "Иван", null),
                new Pr13_2_Person("Смирнова", "", ""),
                new Pr13_2_Person("Орлова", "Мария", "Андреевна")
        };
        for (Pr13_2_Person p : a) {
            System.out.println(p.getShortName());
        }
    }
}
