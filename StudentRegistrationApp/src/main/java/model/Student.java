package main.java.model;


public class Student {

    private String name;
    private String email;
    private int year;

    public Student(String name, String email, int year) {
        this.name = name;
        this.email = email;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getYear() {
        return year;
    }
}
