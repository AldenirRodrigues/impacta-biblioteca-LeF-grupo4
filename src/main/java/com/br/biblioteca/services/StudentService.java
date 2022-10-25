package com.br.biblioteca.services;

import com.br.biblioteca.domain.Student;
import com.br.biblioteca.repository.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository repo;

    public StudentService() {
        super();
        repo = new StudentRepository();
    }

    public List<Student> add(Student student) {
        repo.add(student);

        return repo.getAll();
    }

    public List<Student> getAll() {
        return repo.getAll();
    }


}
