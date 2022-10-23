package entities;

import java.util.ArrayList;
import java.util.List;

public class Rent {
    
    private List<Book> livrosEmprestados = new ArrayList<>();
    
    public String rent(List<Book> books, Person person){
        boolean isStudent = person instanceof Student;
        boolean isProfessor = person instanceof Professor;

        int numberOfBooks = books.size();

        List<String> rentBooks = new ArrayList<>();
        int index=1;
        for(Book book:books){
            rentBooks.add("Livro "+index+" :"+book.getTitle()+"\n");
            index++;
            this.livrosEmprestados.add(book);
        }

        boolean bookLimitStudent = numberOfBooks < 4;
        boolean bookLimitProfessor = numberOfBooks < 6;

        int deadline = 0;
        String result = "";

        if (isStudent && bookLimitStudent){
            deadline=10;
        }
        if(isProfessor && bookLimitProfessor){
            deadline=30;
        }
        if (!isStudent && !isProfessor){
            return "Pessoa inválida ou nº de livros inválido";
        }
        result = "Nº de livros emprestados = "+numberOfBooks+".\n"+
                "Livros emprestados: "+books+".\n"+
                "Quem realizou o emprestimo: "+person.getName()+".\n"+
                "Prazo de devolução: "+deadline+" dias"+".\n";
        return result;
    }

    //PARA DEVOLVER O LIVRO
    public String bookReturn(Book book){
        this.livrosEmprestados.removeIf(x->x.getTitle() == book.getTitle());

        int index=1;
        List<String> nomeEmprestimoAtivo = new ArrayList<>();

        for(Book liv:this.livrosEmprestados){
            nomeEmprestimoAtivo.add("Livro "+index+": "+liv.getTitle());
            index++;
        }


        String resultado = "Livro devolvido: "+book.getTitle()+".\n"+
                "Empréstimos ativos: "+nomeEmprestimoAtivo;

        return resultado;

    }
}
