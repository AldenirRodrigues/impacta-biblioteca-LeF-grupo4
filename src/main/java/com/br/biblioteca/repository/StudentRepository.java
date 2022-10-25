package com.br.biblioteca.repository;

import com.br.biblioteca.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students;

    public StudentRepository() {
        super();
        students = new ArrayList<Student>();
        students.add(new Student("2202568", "Matheus Alves de Lima"));
        students.add(new Student("2202147", "Rebeca Menezes Costa"));
        students.add(new Student("2203020", "Caio Henrique Munhoz"));
        students.add(new Student("2203412", "Aldenir Rodrigues Almeida"));
    }

    public List<Student> getAll() {
        return students;
    }

    public List<Student> add(Student student) {
        students.add(student);

        return students;
    }
}
