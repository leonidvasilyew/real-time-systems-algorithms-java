package ru.mirea.block2.pr11;

import ru.mirea.block2.pr9.Pr9_1_Student;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pr11_3_Student extends Pr9_1_Student {
    private Date birth;

    public Pr11_3_Student(int id, String name, String surname, String spec, int course, String group, double gpa, Date birth) {
        super(id, name, surname, spec, course, group, gpa);
        this.birth = birth;
    }

    public void setBirth(Date birth) {this.birth = birth;}

    public Date getBirth() {return birth;}

    public String getBirth(int style) {
        return DateFormat.getDateInstance(style).format(birth);
    }

    @Override
    public String toString() {
        return getSurname() + " " + getName() + ", дата рождения: " + getBirth(DateFormat.MEDIUM);
    }

    public static void main(String[] args) {
        Date d = new GregorianCalendar(2007, 2, 14).getTime();
        Pr11_3_Student s = new Pr11_3_Student(101, "Анна", "Смирнова", "ИВТ", 2, "КВБО-11-25", 4.80, d);
        System.out.println(s);
        System.out.println("Короткий: " + s.getBirth(DateFormat.SHORT));
        System.out.println("Средний:  " + s.getBirth(DateFormat.MEDIUM));
        System.out.println("Длинный:  " + s.getBirth(DateFormat.LONG));
        System.out.println("Полный:   " + s.getBirth(DateFormat.FULL));
    }
}
