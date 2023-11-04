import java.util.Objects;

public class Book {
    private String name;
    private int publicationYear;
    private Autor autor;

    public Book (String name, int publicationYear, Autor autor){
        this.name = name;
        this.publicationYear = publicationYear;
        this.autor = autor;
    }

    public String getName () {
        return  this.name;
    }

    public int getPublicationYear (){
        return this.publicationYear;
    }

    public Autor getAutor () {
        return this.autor;
    }

    public void setPublicationYear (int publicationYear){
        this.publicationYear = publicationYear;
    }

    public String toString(){
        return "Книга: " + name + ", год публикации: " + publicationYear + ", автор: " + autor;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && name.equals(book.name) && autor.equals(book.autor);
    }

    public int hashCode() {
        return Objects.hash(name, publicationYear, autor);
    }
}
