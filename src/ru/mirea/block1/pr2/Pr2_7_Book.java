package ru.mirea.block1.pr2;

public class Pr2_7_Book {
    private String author;
    private String name;
    private int year;
    private String type;

    public Pr2_7_Book(String author, String name, int year, String type) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.type = type;
    }

    public void setAuthor(String author) {this.author = author;}
    public void setYear(int year) {this.year = year;}
    public void setName(String name) {this.name = name;}
    public void setType(String type) {this.type = type;}

    public String getAuthor() {return author;}
    public String getName() {return name;}
    public int getYear() {return year;}
    public String getType() {return type;}

    @Override
    public String toString() {
        return "Book{" + "author='" + author + "', name='" + name +
                "', year=" + year + ", type='" + type + "'}";
    }
}
