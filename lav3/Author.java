import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    // Constructor
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Método para agregar un libro con objeto Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("El libro '" + book.getTitle() + "' ha sido agregado al autor " + name);
    }

    // Sobrecarga: Método para agregar un libro con título y precio
    public void addBook(String title, double price) {
        Book newBook = new Book(title, this, price);
        books.add(newBook);
        System.out.println("El libro '" + title + "' ha sido agregado al autor " + name);
    }

    // Obtener la lista de libros del autor
    public List<Book> getBooks() {
        return books;
    }

    // Mostrar información del autor y sus libros
    public void displayAuthorInfo() {
        System.out.println("Autor: " + name);
        System.out.println("Libros escritos:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}
