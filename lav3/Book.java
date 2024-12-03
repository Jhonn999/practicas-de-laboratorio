public class Book {
    private String title;
    private Author author;
    private double price;

    // Constructor
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Obtener información del libro
    public String getInfo() {
        return "Título: " + title + ", Autor: " + author.getName() + ", Precio: $" + price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
