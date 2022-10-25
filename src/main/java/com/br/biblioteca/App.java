package com.br.biblioteca;

import com.br.biblioteca.domain.*;
import com.br.biblioteca.services.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var bookSvc = new BookService();

        var publisherSvc = new PublisherService();

        var publisher = new Publisher("teste", "teste.com");

        var autorServ = new AuthorService();

        var clientServ = new ClientService();

        autorServ.add(new Author("Teste"));

        clientServ.add(new Client("teste", "123"));

        publisherSvc.add(publisher);

        bookSvc.add(new Book("Title default", 1, publisher));

        System.out.println("Dado de livros...");
        System.out.println(bookSvc.getAll());

        var student = new StudentService();
        System.out.println("Dados de estudantes...");

        student.add(new Student("2202568", "Matheus Alves de Lima"));
        student.add(new Student("2202147", "Rebeca Menezes Costa"));
        student.add(new Student("2203020", "Caio Henrique Munhoz"));
        student.add(new Student("2203412", "Aldenir Rodrigues Almeida"));
        System.out.println(student.getAll());
    }
}
