package ru.mirea.block1.pr2;

public class Pr2_1_Author {
    private String name;
    private String email;
    private char gender;

    public Pr2_1_Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setEmail(String email) {this.email = email;}

    public String getName() {return name;}
    public String getEmail() {return email;}
    public char getGender() {return gender;}

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
