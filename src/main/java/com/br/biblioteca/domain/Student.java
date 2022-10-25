package com.br.biblioteca.domain;

public class Student {

    private String ra;
    private String name;

    public Student() {
    }

    public Student(String ra, String name) {
        this.ra = ra;
        this.name = name;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
