package entities;
//A biblioteca possui um controle de livros
// (com código, título, autor, ano de publicação e edição)
public class Book {
    private Integer code;
    private String author;
    private String title;
    private String yearOfPub;
    private Integer edition;


    public Book(Integer code, String author,
                String title, String yearOfPub,
                Integer edition) {
        this.code = code;
        this.author = author;
        this.title = title;
        this.yearOfPub = yearOfPub;
        this.edition = edition;
    }

    //Getters & Setters
    public int getCode() { return code;}
    public void setCode(int code) {this.code = code;}

    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getYearOfPub() {return yearOfPub;}
    public void setYearOfPub(String yearOfPub) {this.yearOfPub = yearOfPub;}

    public int getEdition() {return edition;}
    public void setEdition(int edition) {this.edition = edition;}

    @Override
    public String toString() {
        return title;
    }
}
