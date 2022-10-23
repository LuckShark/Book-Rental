package application;

import entities.Book;
import entities.Professor;
import entities.Rent;
import entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //LENDO OS DADOS

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Book livro1 = new Book(666,"Joanne K","Harry Potter quebrando tudo","2004",1);
        Book livro2 = new Book(024,"Stefany Maia","Crepúsculo Love","2010",6);
        Book livro3 = new Book(101,"Machado de Assis","Aventuras de Brás Cubas","1800",15);
        Book livro4 = new Book(123,"George RR M","O Samba dos Dragões","2020",1);
        Book livro5 = new Book(690,"Hagrid Morr","Livro dos Monstros","1995",19);

        Student aluno1 = new Student(045,"Lucas Araujo","lucas@gmail.com",8966669,"Computação","Noite");
        Student aluno2 = new Student(756,"Igor Cross","solar@gmail.com",8954311,"Engenharia","Manhã");
        Professor prof1 = new Professor(111,"Leo Taddeo","leo@gmail.com",9531245,"Doutor");

        //ALUGANDO OS LIVROS

        List<Book> listaProf = new ArrayList<>();
        listaProf.add(livro1);
        listaProf.add(livro2);
        listaProf.add(livro3);

        List<Book> listaAluno1 = new ArrayList<>();
        listaAluno1.add(livro4);

        List<Book> listaAluno2 = new ArrayList<>();
        listaAluno2.add(livro5);

        Rent emprestimo = new Rent();

        //MOSTRANDO AS INFO & DEVOLVENDO ALGUNS LIVROS

        System.out.println(emprestimo.rent(listaAluno1,aluno1));
        System.out.println(emprestimo.bookReturn(livro4));
        System.out.println("=================");
        System.out.println();
        System.out.println(emprestimo.rent(listaProf,prof1));
        System.out.println(emprestimo.bookReturn(livro2));

    }
}
