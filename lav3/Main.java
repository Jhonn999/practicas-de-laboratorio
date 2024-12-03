public class Main {
    public static void main(String[] args) {
        // Crear un autor
        Author author = new Author("Gabriel García Márquez");

        // Crear libros y asignarlos al autor
        Book book1 = new Book("Cien años de soledad", author, 29.99);
        author.addBook(book1); // Agregar usando objeto Book

        // Agregar otro libro usando sobrecarga
        author.addBook("El amor en los tiempos del cólera", 19.99);

        // Mostrar información del autor y sus libros
        author.displayAuthorInfo();

        // Mostrar información de cada libro
        for (Book book : author.getBooks()) {
            System.out.println(book.getInfo());
        }
    }
}
