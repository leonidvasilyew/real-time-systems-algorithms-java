package ru.mirea.block2.pr9;

public class Pr9_1_Student implements Comparable<Pr9_1_Student> {
    private int id;
    private String name;
    private String surname;
    private String spec;
    private int course;
    private String group;
    private double gpa;

    public Pr9_1_Student(int id, String name, String surname, String spec, int course, String group, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setSpec(String spec) {this.spec = spec;}
    public void setCourse(int course) {this.course = course;}
    public void setGroup(String group) {this.group = group;}
    public void setGpa(double gpa) {this.gpa = gpa;}

    public int getId() {return id;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getSpec() {return spec;}
    public int getCourse() {return course;}
    public String getGroup() {return group;}
    public double getGpa() {return gpa;}

    @Override
    public int compareTo(Pr9_1_Student o) {
        return id - o.id;
    }

    @Override
    public String toString() {
        return String.format("%-4d %-10s %-9s %-6s %d курс %-10s %.2f", id, surname, name, spec, course, group, gpa);
    }
}
